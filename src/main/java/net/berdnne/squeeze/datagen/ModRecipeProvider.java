package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
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
                for (String group : ModBlocks.MOD_BLOCKS.keySet()) {
                    Block[] blocks = ModBlocks.MOD_BLOCKS.get(group);
                    if (blocks.length >= 5) { // if a new block form is present (e.g. sugar cane block)
                        buildSqueezeRecipe(blocks[0], blocks[1], "", "block", group);
                    }
                    for (int i = 0; i < blocks.length - 1; i++) {
                        String fromTier = translateTier(i);
                        String toTier = translateTier(i + 1);
                        buildSqueezeRecipe(blocks[i], blocks[i + 1], fromTier, toTier, group);
                    }
                }

            }
            private void buildSqueezeRecipe(Block from, Block to, String fromTier, String toTier, String group) {
                String sep = fromTier.isEmpty() ? "" : "_";
                nineBlockStorageRecipesRecipesWithCustomUnpacking(
                        RecipeCategory.MISC, from,
                        RecipeCategory.MISC, to,
                        fromTier + sep + group + "_from_" + toTier, group);
            }

            private String translateTier(int tier) {
                return switch (tier) {
                    case 0 -> "";
                    case 1 -> "compressed";
                    case 2 -> "squeezed";
                    case 3 -> "hardened";
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
