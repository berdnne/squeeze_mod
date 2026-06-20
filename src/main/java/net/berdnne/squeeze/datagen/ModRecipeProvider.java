package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.CompressableBlockType;
import net.berdnne.squeeze.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                for (CompressableBlockType cbt : ModBlocks.COMPRESSABLE_BLOCK_TYPES) {
                    if (cbt.tiers().length == 4) {
                        buildSqueezeRecipeTypeWithNewBase(cbt);
                    } else {
                        buildSqueezeRecipeType(cbt);
                    }
                }
            }
            private void buildSqueezeRecipeTypeWithNewBase(CompressableBlockType cbt) {
                Block[] blocks = cbt.tiers();
                String group = cbt.name();
                nineBlockStorageRecipesRecipesWithCustomUnpacking(
                        RecipeCategory.MISC, cbt.baseItem(),
                        RecipeCategory.MISC, blocks[0],
                        group.replace("_block", "") + "_from_block", group);
                for (int i = 0; i < blocks.length - 1; i++) {
                    String fromTier = translateTier(i - 1);
                    String toTier = translateTier(i);
                    String sep = (fromTier.isEmpty()) ? "" : "_";
                    nineBlockStorageRecipesRecipesWithCustomUnpacking(
                            RecipeCategory.MISC, blocks[i],
                            RecipeCategory.MISC, blocks[i + 1],
                            fromTier + sep + group + "_from_" + toTier, group);
                }
            }
            private void buildSqueezeRecipeType(CompressableBlockType cbt) {
                Block[] blocks = cbt.tiers();
                String group = cbt.name();
                nineBlockStorageRecipesRecipesWithCustomUnpacking(
                        RecipeCategory.MISC, cbt.baseItem(),
                        RecipeCategory.MISC, blocks[0],
                        group + "_from_compressed", group);
                for (int i = 0; i < blocks.length - 1; i++) {
                    String fromTier = translateTier(i);
                    String toTier = translateTier(i + 1);
                    //String sep = (fromTier.isEmpty()) ? "" : "_";
                    nineBlockStorageRecipesRecipesWithCustomUnpacking(
                            RecipeCategory.MISC, blocks[i],
                            RecipeCategory.MISC, blocks[i + 1],
                            fromTier + "_" + group + "_from_" + toTier, group);
                }
            }

            private String translateTier(int tier) {
                return switch (tier) {
                    case -1 -> "";
                    case 0 -> "compressed";
                    case 1 -> "squeezed";
                    case 2 -> "hardened";
                    default -> throw new IllegalStateException("Unexpected compression tier: " + tier);
                };
            }

        };
    }

    @Override
    public String getName() {
        return "Squeeze Recipes";
    }
}
