package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

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
                .add(HARDENED_GOLD_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(SUGAR_CANE_BLOCK)
                .add(COMPRESSED_SUGAR_CANE_BLOCK)
                .add(SQUEEZED_SUGAR_CANE_BLOCK)
                .add(HARDENED_SUGAR_CANE_BLOCK);
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
    }
}
