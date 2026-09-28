package net.berdnne.squeeze.block;

import net.berdnne.squeeze.Squeeze;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
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
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            properties -> new Block(properties.strength(0.5f)
                    .sound(SoundType.CORAL_BLOCK)));
    public static final Block COMPRESSED_ROTTEN_FLESH_BLOCK = registerBlock("compressed_rotten_flesh_block",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.CORAL_BLOCK)));
    public static final Block SQUEEZED_ROTTEN_FLESH_BLOCK = registerBlock("squeezed_rotten_flesh_block",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.CORAL_BLOCK)));
    public static final Block HARDENED_ROTTEN_FLESH_BLOCK = registerBlock("hardened_rotten_flesh_block",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.CORAL_BLOCK)));
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
    public static final Block COMPRESSED_BAMBOO_BLOCK = registerBlock("compressed_bamboo_block",
            properties -> new Block(properties.strength(2f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block SQUEEZED_BAMBOO_BLOCK = registerBlock("squeezed_bamboo_block",
            properties -> new Block(properties.strength(3f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block HARDENED_BAMBOO_BLOCK = registerBlock("hardened_bamboo_block",
            properties -> new Block(properties.strength(4f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block SQUEEZED_DEEPSLATE = registerBlock("squeezed_deepslate",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block HARDENED_DEEPSLATE = registerBlock("hardened_deepslate",
            properties -> new Block(properties.strength(6f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block COMPRESSED_COBBLED_DEEPSLATE = registerBlock("compressed_cobbled_deepslate",
            properties -> new Block(properties.strength(4.5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block SQUEEZED_COBBLED_DEEPSLATE = registerBlock("squeezed_cobbled_deepslate",
            properties -> new Block(properties.strength(5.5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block HARDENED_COBBLED_DEEPSLATE = registerBlock("hardened_cobbled_deepslate",
            properties -> new Block(properties.strength(6.5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.GRAVEL)));
    public static final Block SQUEEZED_DIRT = registerBlock("squeezed_dirt",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.GRAVEL)));
    public static final Block HARDENED_DIRT = registerBlock("hardened_dirt",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.GRAVEL)));
    public static final Block COMPRESSED_GRASS_BLOCK = registerBlock("compressed_grass_block",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.GRASS)));
    public static final Block SQUEEZED_GRASS_BLOCK = registerBlock("squeezed_grass_block",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.GRASS)));
    public static final Block HARDENED_GRASS_BLOCK = registerBlock("hardened_grass_block",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.GRASS)));
    public static final Block COMPRESSED_CACTUS = registerBlock("compressed_cactus",
            properties -> new Block(properties.strength(1.4f)
                    .sound(SoundType.WOOL)));
    public static final Block SQUEEZED_CACTUS = registerBlock("squeezed_cactus",
            properties -> new Block(properties.strength(2.4f)
                    .sound(SoundType.WOOL)));
    public static final Block HARDENED_CACTUS = registerBlock("hardened_cactus",
            properties -> new Block(properties.strength(3.4f)
                    .sound(SoundType.WOOL)));
    // Logs
    public static final Block COMPRESSED_OAK_LOG = registerBlock("compressed_oak_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_OAK_LOG = registerBlock("squeezed_oak_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_OAK_LOG = registerBlock("hardened_oak_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_SPRUCE_LOG = registerBlock("compressed_spruce_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_SPRUCE_LOG = registerBlock("squeezed_spruce_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_SPRUCE_LOG = registerBlock("hardened_spruce_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_BIRCH_LOG = registerBlock("compressed_birch_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_BIRCH_LOG = registerBlock("squeezed_birch_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_BIRCH_LOG = registerBlock("hardened_birch_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_DARK_OAK_LOG = registerBlock("compressed_dark_oak_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_DARK_OAK_LOG = registerBlock("squeezed_dark_oak_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_DARK_OAK_LOG = registerBlock("hardened_dark_oak_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_ACACIA_LOG = registerBlock("compressed_acacia_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_ACACIA_LOG = registerBlock("squeezed_acacia_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_ACACIA_LOG = registerBlock("hardened_acacia_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_JUNGLE_LOG = registerBlock("compressed_jungle_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_JUNGLE_LOG = registerBlock("squeezed_jungle_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_JUNGLE_LOG = registerBlock("hardened_jungle_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_MANGROVE_LOG = registerBlock("compressed_mangrove_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_MANGROVE_LOG = registerBlock("squeezed_mangrove_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_MANGROVE_LOG = registerBlock("hardened_mangrove_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_CHERRY_LOG = registerBlock("compressed_cherry_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_CHERRY_LOG = registerBlock("squeezed_cherry_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_CHERRY_LOG = registerBlock("hardened_cherry_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_PALE_OAK_LOG = registerBlock("compressed_pale_oak_log",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.WOOD)));
    public static final Block SQUEEZED_PALE_OAK_LOG = registerBlock("squeezed_pale_oak_log",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.WOOD)));
    public static final Block HARDENED_PALE_OAK_LOG = registerBlock("hardened_pale_oak_log",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.WOOD)));
    public static final Block COMPRESSED_CRIMSON_STEM = registerBlock("compressed_crimson_stem",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.NETHER_WOOD)));
    public static final Block SQUEEZED_CRIMSON_STEM = registerBlock("squeezed_crimson_stem",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.NETHER_WOOD)));
    public static final Block HARDENED_CRIMSON_STEM = registerBlock("hardened_crimson_stem",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.NETHER_WOOD)));
    public static final Block COMPRESSED_WARPED_STEM = registerBlock("compressed_warped_stem",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.NETHER_WOOD)));
    public static final Block SQUEEZED_WARPED_STEM = registerBlock("squeezed_warped_stem",
            properties -> new Block(properties.strength(2.5f)
                    .sound(SoundType.NETHER_WOOD)));
    public static final Block HARDENED_WARPED_STEM = registerBlock("hardened_warped_stem",
            properties -> new Block(properties.strength(3.5f)
                    .sound(SoundType.NETHER_WOOD)));


    public static final CompressableBlockType[] COMPRESSABLE_BLOCK_TYPES = new CompressableBlockType[]{
            new CompressableBlockType("stone", Blocks.STONE, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_STONE, SQUEEZED_STONE, HARDENED_STONE}),
            new CompressableBlockType("cobblestone", Blocks.COBBLESTONE, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_COBBLESTONE, SQUEEZED_COBBLESTONE, HARDENED_COBBLESTONE}),
            new CompressableBlockType("netherrack", Blocks.NETHERRACK, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_NETHERRACK, SQUEEZED_NETHERRACK, HARDENED_NETHERRACK}),
            new CompressableBlockType("iron_block", Blocks.IRON_BLOCK, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_IRON_BLOCK, SQUEEZED_IRON_BLOCK, HARDENED_IRON_BLOCK}),
            new CompressableBlockType("sugar_cane_block", Items.SUGAR_CANE, BlockTags.MINEABLE_WITH_HOE, new Block[]{SUGAR_CANE_BLOCK, COMPRESSED_SUGAR_CANE_BLOCK, SQUEEZED_SUGAR_CANE_BLOCK, HARDENED_SUGAR_CANE_BLOCK}),
            new CompressableBlockType("redstone_block", Blocks.REDSTONE_BLOCK, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_REDSTONE_BLOCK, SQUEEZED_REDSTONE_BLOCK, HARDENED_REDSTONE_BLOCK}),
            new CompressableBlockType("gold_block", Blocks.GOLD_BLOCK, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_GOLD_BLOCK, SQUEEZED_GOLD_BLOCK, HARDENED_GOLD_BLOCK}),
            new CompressableBlockType("bamboo_block", Blocks.BAMBOO_BLOCK, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_BAMBOO_BLOCK, SQUEEZED_BAMBOO_BLOCK, HARDENED_BAMBOO_BLOCK}),
            new CompressableBlockType("deepslate", Blocks.DEEPSLATE, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_DEEPSLATE, SQUEEZED_DEEPSLATE, HARDENED_DEEPSLATE}),
            new CompressableBlockType("cobbled_deepslate", Blocks.COBBLED_DEEPSLATE, BlockTags.MINEABLE_WITH_PICKAXE, new Block[]{COMPRESSED_COBBLED_DEEPSLATE, SQUEEZED_COBBLED_DEEPSLATE, HARDENED_COBBLED_DEEPSLATE}),
            new CompressableBlockType("dirt", Blocks.DIRT, BlockTags.MINEABLE_WITH_SHOVEL, new Block[]{COMPRESSED_DIRT, SQUEEZED_DIRT, HARDENED_DIRT}),
            new CompressableBlockType("grass_block", Blocks.GRASS_BLOCK, BlockTags.MINEABLE_WITH_SHOVEL, new Block[]{COMPRESSED_GRASS_BLOCK, SQUEEZED_GRASS_BLOCK, HARDENED_GRASS_BLOCK}),
            new CompressableBlockType("cactus", Blocks.CACTUS, null, new Block[]{COMPRESSED_CACTUS, SQUEEZED_CACTUS, HARDENED_CACTUS}),
            new CompressableBlockType("rotten_flesh", Items.ROTTEN_FLESH, BlockTags.MINEABLE_WITH_SHOVEL, new Block[]{ROTTEN_FLESH_BLOCK, COMPRESSED_ROTTEN_FLESH_BLOCK, SQUEEZED_ROTTEN_FLESH_BLOCK, HARDENED_ROTTEN_FLESH_BLOCK}),
            new CompressableBlockType("oak_log", Blocks.OAK_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_OAK_LOG, SQUEEZED_OAK_LOG, HARDENED_OAK_LOG}),
            new CompressableBlockType("spruce_log", Blocks.SPRUCE_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_SPRUCE_LOG, SQUEEZED_SPRUCE_LOG, HARDENED_SPRUCE_LOG}),
            new CompressableBlockType("birch_log", Blocks.BIRCH_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_BIRCH_LOG, SQUEEZED_BIRCH_LOG, HARDENED_BIRCH_LOG}),
            new CompressableBlockType("dark_oak_log", Blocks.DARK_OAK_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_DARK_OAK_LOG, SQUEEZED_DARK_OAK_LOG, HARDENED_DARK_OAK_LOG}),
            new CompressableBlockType("acacia_log", Blocks.ACACIA_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_ACACIA_LOG, SQUEEZED_ACACIA_LOG, HARDENED_ACACIA_LOG}),
            new CompressableBlockType("jungle_log", Blocks.JUNGLE_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_JUNGLE_LOG, SQUEEZED_JUNGLE_LOG, HARDENED_JUNGLE_LOG}),
            new CompressableBlockType("mangrove_log", Blocks.MANGROVE_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_MANGROVE_LOG, SQUEEZED_MANGROVE_LOG, HARDENED_MANGROVE_LOG}),
            new CompressableBlockType("crimson_stem", Blocks.CRIMSON_STEM, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_CRIMSON_STEM, SQUEEZED_CRIMSON_STEM, HARDENED_CRIMSON_STEM}),
            new CompressableBlockType("warped_stem", Blocks.WARPED_STEM, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_WARPED_STEM, SQUEEZED_WARPED_STEM, HARDENED_WARPED_STEM}),
            new CompressableBlockType("pale_oak_log", Blocks.PALE_OAK_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_PALE_OAK_LOG, SQUEEZED_PALE_OAK_LOG, HARDENED_PALE_OAK_LOG}),
            new CompressableBlockType("cherry_log", Blocks.CHERRY_LOG, BlockTags.MINEABLE_WITH_AXE, new Block[]{COMPRESSED_CHERRY_LOG, SQUEEZED_CHERRY_LOG, HARDENED_CHERRY_LOG}),
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

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        Squeeze.LOGGER.info("Registering Mod Blocks for " + Squeeze.MOD_ID);
    }
}
