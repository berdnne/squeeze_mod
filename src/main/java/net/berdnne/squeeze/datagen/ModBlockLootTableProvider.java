package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.CompressableBlockType;
import net.berdnne.squeeze.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        for (CompressableBlockType cbt : ModBlocks.COMPRESSABLE_BLOCK_TYPES) {
            for (Block block : cbt.getTiers()) {
                dropSelf(block);
            }
        }
    }
}
