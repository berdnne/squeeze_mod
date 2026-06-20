package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.block.CompressableBlockType;
import net.berdnne.squeeze.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Block;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        for (CompressableBlockType cbt : ModBlocks.COMPRESSABLE_BLOCK_TYPES) {
            for (Block block : cbt.tiers()) {
                generator.createTrivialCube(block);
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //
    }
}
