package net.berdnne.squeeze.datagen;

import net.berdnne.squeeze.Squeeze;
import net.berdnne.squeeze.block.ModBlocks;
import net.berdnne.squeeze.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.model.Model;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        for (Block[] blocks : ModBlocks.MOD_BLOCKS.values()) {
            for (Block block : blocks) {
                generator.createTrivialCube(block);
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //
    }
}
