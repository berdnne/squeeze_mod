package net.berdnne.squeeze.block;

import net.berdnne.squeeze.Squeeze;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.HashMap;
import java.util.function.Function;

public class ModBlocks {

    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SQUEEZED_COBBLESTONE = registerBlock("squeezed_cobblestone",
            properties -> new Block(properties.strength(6f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block HARDENED_COBBLESTONE = registerBlock("hardened_cobblestone",
            properties -> new Block(properties.strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SQUEEZED_STONE = registerBlock("squeezed_stone",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block HARDENED_STONE = registerBlock("hardened_stone",
            properties -> new Block(properties.strength(7f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final HashMap<String, Block[]> MOD_BLOCKS = new HashMap<>();

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Identifier block_id = Identifier.fromNamespaceAndPath(Squeeze.MOD_ID, name);
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, block_id)));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, block_id, toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Identifier block_id = Identifier.fromNamespaceAndPath(Squeeze.MOD_ID, name);
        Registry.register(BuiltInRegistries.ITEM, block_id,
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, block_id))));
    }

    public static void registerModBlocks() {
        Squeeze.LOGGER.info("Registering Mod Blocks for " + Squeeze.MOD_ID);
        MOD_BLOCKS.put("stone", new Block[]{Blocks.STONE, COMPRESSED_STONE, SQUEEZED_STONE, HARDENED_STONE});
        MOD_BLOCKS.put("cobblestone", new Block[]{Blocks.COBBLESTONE, COMPRESSED_COBBLESTONE, SQUEEZED_COBBLESTONE, HARDENED_COBBLESTONE});
    }
}
