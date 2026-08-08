package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static net.berdnne.squeeze.block.ModBlocks.*;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(COMPRESSED_STONE))
                .add(ModBlocks.getRK(SQUEEZED_STONE))
                .add(ModBlocks.getRK(HARDENED_STONE))
                .add(ModBlocks.getRK(COMPRESSED_COBBLESTONE))
                .add(ModBlocks.getRK(SQUEEZED_COBBLESTONE))
                .add(ModBlocks.getRK(HARDENED_COBBLESTONE))
                .add(ModBlocks.getRK(COMPRESSED_NETHERRACK))
                .add(ModBlocks.getRK(SQUEEZED_NETHERRACK))
                .add(ModBlocks.getRK(HARDENED_NETHERRACK))
                .add(ModBlocks.getRK(COMPRESSED_IRON_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_IRON_BLOCK))
                .add(ModBlocks.getRK(HARDENED_IRON_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_REDSTONE_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_REDSTONE_BLOCK))
                .add(ModBlocks.getRK(HARDENED_REDSTONE_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_GOLD_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_GOLD_BLOCK))
                .add(ModBlocks.getRK(HARDENED_GOLD_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_DEEPSLATE))
                .add(ModBlocks.getRK(SQUEEZED_DEEPSLATE))
                .add(ModBlocks.getRK(HARDENED_DEEPSLATE))
                .add(ModBlocks.getRK(COMPRESSED_COBBLED_DEEPSLATE))
                .add(ModBlocks.getRK(SQUEEZED_COBBLED_DEEPSLATE))
                .add(ModBlocks.getRK(HARDENED_COBBLED_DEEPSLATE));
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.getRK(SUGAR_CANE_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_SUGAR_CANE_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_SUGAR_CANE_BLOCK))
                .add(ModBlocks.getRK(HARDENED_SUGAR_CANE_BLOCK));
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(COMPRESSED_BAMBOO_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_BAMBOO_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_BAMBOO_BLOCK));
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.getRK(COMPRESSED_IRON_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_IRON_BLOCK))
                .add(ModBlocks.getRK(HARDENED_IRON_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_REDSTONE_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_REDSTONE_BLOCK))
                .add(ModBlocks.getRK(HARDENED_REDSTONE_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_GOLD_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_GOLD_BLOCK))
                .add(ModBlocks.getRK(HARDENED_GOLD_BLOCK));
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.getRK(COMPRESSED_DIRT))
                .add(ModBlocks.getRK(SQUEEZED_DIRT))
                .add(ModBlocks.getRK(HARDENED_DIRT))
                .add(ModBlocks.getRK(COMPRESSED_GRASS_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_GRASS_BLOCK))
                .add(ModBlocks.getRK(HARDENED_GRASS_BLOCK))
                .add(ModBlocks.getRK(ROTTEN_FLESH_BLOCK))
                .add(ModBlocks.getRK(COMPRESSED_ROTTEN_FLESH_BLOCK))
                .add(ModBlocks.getRK(SQUEEZED_ROTTEN_FLESH_BLOCK))
                .add(ModBlocks.getRK(HARDENED_ROTTEN_FLESH_BLOCK));
    }
}
