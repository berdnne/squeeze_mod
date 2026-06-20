package net.berdnne.squeeze.block;

import net.berdnne.squeeze.Squeeze;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.HashMap;
import java.util.function.Function;

public class ModBlocks {

    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SQUEEZED_STONE = registerBlock("squeezed_stone",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block HARDENED_STONE = registerBlock("hardened_stone",
            properties -> new Block(properties.strength(7f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SQUEEZED_COBBLESTONE = registerBlock("squeezed_cobblestone",
            properties -> new Block(properties.strength(6f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block HARDENED_COBBLESTONE = registerBlock("hardened_cobblestone",
            properties -> new Block(properties.strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack",
            properties -> new Block(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final Block SQUEEZED_NETHERRACK = registerBlock("squeezed_netherrack",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final Block HARDENED_NETHERRACK = registerBlock("hardened_netherrack",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final Block COMPRESSED_IRON_BLOCK = registerBlock("compressed_iron_block",
            properties -> new Block(properties.strength(6f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));
    public static final Block SQUEEZED_IRON_BLOCK = registerBlock("squeezed_iron_block",
            properties -> new Block(properties.strength(7f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));
    public static final Block HARDENED_IRON_BLOCK = registerBlock("hardened_iron_block",
            properties -> new Block(properties.strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));
    public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            properties -> new Block(properties.strength(0.3f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block COMPRESSED_SUGAR_CANE_BLOCK = registerBlock("compressed_sugar_cane_block",
            properties -> new Block(properties.strength(0.6f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block SQUEEZED_SUGAR_CANE_BLOCK = registerBlock("squeezed_sugar_cane_block",
            properties -> new Block(properties.strength(1.2f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block HARDENED_SUGAR_CANE_BLOCK = registerBlock("hardened_sugar_cane_block",
            properties -> new Block(properties.strength(2.6f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block COMPRESSED_REDSTONE_BLOCK = registerBlock("compressed_redstone_block",
            properties -> new Block(properties.strength(6f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block SQUEEZED_REDSTONE_BLOCK = registerBlock("squeezed_redstone_block",
            properties -> new Block(properties.strength(7f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block HARDENED_REDSTONE_BLOCK = registerBlock("hardened_redstone_block",
            properties -> new Block(properties.strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block COMPRESSED_GOLD_BLOCK = registerBlock("compressed_gold_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block SQUEEZED_GOLD_BLOCK = registerBlock("squeezed_gold_block",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block HARDENED_GOLD_BLOCK = registerBlock("hardened_gold_block",
            properties -> new Block(properties.strength(6f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final CompressableBlockType[] COMPRESSABLE_BLOCK_TYPES = new CompressableBlockType[]{
            new CompressableBlockType("stone", Blocks.STONE, new Block[]{COMPRESSED_STONE, SQUEEZED_STONE, HARDENED_STONE}),
            new CompressableBlockType("cobblestone", Blocks.COBBLESTONE, new Block[]{COMPRESSED_COBBLESTONE, SQUEEZED_COBBLESTONE, HARDENED_COBBLESTONE}),
            new CompressableBlockType("netherrack", Blocks.NETHERRACK, new Block[]{COMPRESSED_NETHERRACK, SQUEEZED_NETHERRACK, HARDENED_NETHERRACK}),
            new CompressableBlockType("iron_block", Blocks.IRON_BLOCK, new Block[]{COMPRESSED_IRON_BLOCK, SQUEEZED_IRON_BLOCK, HARDENED_IRON_BLOCK}),
            new CompressableBlockType("sugar_cane_block", Items.SUGAR_CANE, new Block[]{SUGAR_CANE_BLOCK, COMPRESSED_SUGAR_CANE_BLOCK, SQUEEZED_SUGAR_CANE_BLOCK, HARDENED_SUGAR_CANE_BLOCK}),
            new CompressableBlockType("redstone_block", Blocks.REDSTONE_BLOCK, new Block[]{COMPRESSED_REDSTONE_BLOCK, SQUEEZED_REDSTONE_BLOCK, HARDENED_REDSTONE_BLOCK}),
            new CompressableBlockType("gold_block", Blocks.GOLD_BLOCK, new Block[]{COMPRESSED_GOLD_BLOCK, SQUEEZED_GOLD_BLOCK, HARDENED_GOLD_BLOCK}),
    };

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
    }
}
