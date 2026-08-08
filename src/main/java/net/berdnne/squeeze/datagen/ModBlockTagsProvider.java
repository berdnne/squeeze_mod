package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.CompressableBlockType;
import net.berdnne.squeeze.block.Mineable;
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
        for (CompressableBlockType cbt : COMPRESSABLE_BLOCK_TYPES) {
            switch (cbt.tool()) { // this is hideous but it works
                case PICKAXE -> {
                    for (Block block : cbt.tiers()) {
                        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(getRK(block));
                    }
                }
                case AXE -> {
                    for (Block block : cbt.tiers()) {
                        tag(BlockTags.MINEABLE_WITH_AXE).add(getRK(block));
                    }
                }
                case SHOVEL -> {
                    for (Block block : cbt.tiers()) {
                        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(getRK(block));
                    }
                }
                case HOE -> {
                    for (Block block : cbt.tiers()) {
                        tag(BlockTags.MINEABLE_WITH_HOE).add(getRK(block));
                    }
                }
            }
        }
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(getRK(COMPRESSED_IRON_BLOCK))
                .add(getRK(SQUEEZED_IRON_BLOCK))
                .add(getRK(HARDENED_IRON_BLOCK))
                .add(getRK(COMPRESSED_REDSTONE_BLOCK))
                .add(getRK(SQUEEZED_REDSTONE_BLOCK))
                .add(getRK(HARDENED_REDSTONE_BLOCK))
                .add(getRK(COMPRESSED_GOLD_BLOCK))
                .add(getRK(SQUEEZED_GOLD_BLOCK))
                .add(getRK(HARDENED_GOLD_BLOCK));
    }
}
