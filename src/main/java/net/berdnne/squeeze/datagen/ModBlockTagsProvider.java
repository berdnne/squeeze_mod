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
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(COMPRESSED_STONE)
                .add(SQUEEZED_STONE)
                .add(HARDENED_STONE)
                .add(COMPRESSED_COBBLESTONE)
                .add(SQUEEZED_COBBLESTONE)
                .add(HARDENED_COBBLESTONE)
                .add(COMPRESSED_NETHERRACK)
                .add(SQUEEZED_NETHERRACK)
                .add(HARDENED_NETHERRACK)
                .add(COMPRESSED_IRON_BLOCK)
                .add(SQUEEZED_IRON_BLOCK)
                .add(HARDENED_IRON_BLOCK)
                .add(COMPRESSED_REDSTONE_BLOCK)
                .add(SQUEEZED_REDSTONE_BLOCK)
                .add(HARDENED_REDSTONE_BLOCK)
                .add(COMPRESSED_GOLD_BLOCK)
                .add(SQUEEZED_GOLD_BLOCK)
                .add(HARDENED_GOLD_BLOCK)
                .add(COMPRESSED_DEEPSLATE)
                .add(SQUEEZED_DEEPSLATE)
                .add(HARDENED_DEEPSLATE)
                .add(COMPRESSED_COBBLED_DEEPSLATE)
                .add(SQUEEZED_COBBLED_DEEPSLATE)
                .add(HARDENED_COBBLED_DEEPSLATE);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(SUGAR_CANE_BLOCK)
                .add(COMPRESSED_SUGAR_CANE_BLOCK)
                .add(SQUEEZED_SUGAR_CANE_BLOCK)
                .add(HARDENED_SUGAR_CANE_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(COMPRESSED_BAMBOO_BLOCK)
                .add(SQUEEZED_BAMBOO_BLOCK)
                .add(COMPRESSED_BAMBOO_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(COMPRESSED_IRON_BLOCK)
                .add(SQUEEZED_IRON_BLOCK)
                .add(HARDENED_IRON_BLOCK)
                .add(COMPRESSED_REDSTONE_BLOCK)
                .add(SQUEEZED_REDSTONE_BLOCK)
                .add(HARDENED_REDSTONE_BLOCK)
                .add(COMPRESSED_GOLD_BLOCK)
                .add(SQUEEZED_GOLD_BLOCK)
                .add(HARDENED_GOLD_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(COMPRESSED_DIRT)
                .add(SQUEEZED_DIRT)
                .add(HARDENED_DIRT)
                .add(COMPRESSED_GRASS_BLOCK)
                .add(SQUEEZED_GRASS_BLOCK)
                .add(HARDENED_GRASS_BLOCK)
                .add(ROTTEN_FLESH_BLOCK)
                .add(COMPRESSED_ROTTEN_FLESH_BLOCK)
                .add(SQUEEZED_ROTTEN_FLESH_BLOCK)
                .add(HARDENED_ROTTEN_FLESH_BLOCK);
    }
}
