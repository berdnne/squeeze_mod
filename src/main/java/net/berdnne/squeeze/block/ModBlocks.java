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
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.HashMap;
import java.util.function.Function;

public class ModBlocks {

    public static final Block COMPRESSED_STONE = registerVariant("compressed_stone", Blocks.STONE);
    public static final Block SQUEEZED_STONE = registerVariant("squeezed_stone", Blocks.STONE);
    public static final Block HARDENED_STONE = registerVariant("hardened_stone", Blocks.STONE);

    public static final Block COMPRESSED_COBBLESTONE = registerVariant("compressed_cobblestone", Blocks.COBBLESTONE);
    public static final Block SQUEEZED_COBBLESTONE = registerVariant("squeezed_cobblestone", Blocks.COBBLESTONE);
    public static final Block HARDENED_COBBLESTONE = registerVariant("hardened_cobblestone", Blocks.COBBLESTONE);

    public static final Block COMPRESSED_NETHERRACK = registerVariant("compressed_netherrack", Blocks.NETHERRACK);
    public static final Block SQUEEZED_NETHERRACK = registerVariant("squeezed_netherrack", Blocks.NETHERRACK);
    public static final Block HARDENED_NETHERRACK = registerVariant("hardened_netherrack", Blocks.NETHERRACK);

    public static final Block COMPRESSED_IRON_BLOCK = registerVariant("compressed_iron_block", Blocks.IRON_BLOCK);
    public static final Block SQUEEZED_IRON_BLOCK = registerVariant("squeezed_iron_block", Blocks.IRON_BLOCK);
    public static final Block HARDENED_IRON_BLOCK = registerVariant("hardened_iron_block", Blocks.IRON_BLOCK);

    public static final Block SUGAR_CANE_BLOCK = registerBlock("sugar_cane_block",
            properties -> new Block(properties.strength(1.2f)
                    .sound(SoundType.BAMBOO_WOOD)));
    public static final Block COMPRESSED_SUGAR_CANE_BLOCK = registerVariant("compressed_sugar_cane_block", SUGAR_CANE_BLOCK);
    public static final Block SQUEEZED_SUGAR_CANE_BLOCK = registerVariant("squeezed_sugar_cane_block", SUGAR_CANE_BLOCK);
    public static final Block HARDENED_SUGAR_CANE_BLOCK = registerVariant("hardened_sugar_cane_block", SUGAR_CANE_BLOCK);

    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            properties -> new Block(properties.strength(1.5f)
                    .sound(SoundType.CORAL_BLOCK)));
    public static final Block COMPRESSED_ROTTEN_FLESH_BLOCK = registerVariant("compressed_rotten_flesh_block", ROTTEN_FLESH_BLOCK);
    public static final Block SQUEEZED_ROTTEN_FLESH_BLOCK = registerVariant("squeezed_rotten_flesh_block", ROTTEN_FLESH_BLOCK);
    public static final Block HARDENED_ROTTEN_FLESH_BLOCK = registerVariant("hardened_rotten_flesh_block", ROTTEN_FLESH_BLOCK);

    public static final Block COMPRESSED_REDSTONE_BLOCK = registerVariant("compressed_redstone_block", Blocks.REDSTONE_BLOCK);
    public static final Block SQUEEZED_REDSTONE_BLOCK = registerVariant("squeezed_redstone_block", Blocks.REDSTONE_BLOCK);
    public static final Block HARDENED_REDSTONE_BLOCK = registerVariant("hardened_redstone_block", Blocks.REDSTONE_BLOCK);

    public static final Block COMPRESSED_GOLD_BLOCK = registerVariant("compressed_gold_block", Blocks.GOLD_BLOCK);
    public static final Block SQUEEZED_GOLD_BLOCK = registerVariant("squeezed_gold_block", Blocks.GOLD_BLOCK);
    public static final Block HARDENED_GOLD_BLOCK = registerVariant("hardened_gold_block", Blocks.GOLD_BLOCK);

    public static final Block COMPRESSED_BAMBOO_BLOCK = registerPillarVariant("compressed_bamboo_block", Blocks.BAMBOO_BLOCK);
    public static final Block SQUEEZED_BAMBOO_BLOCK = registerPillarVariant("squeezed_bamboo_block", Blocks.BAMBOO_BLOCK);
    public static final Block HARDENED_BAMBOO_BLOCK = registerPillarVariant("hardened_bamboo_block", Blocks.BAMBOO_BLOCK);

    public static final Block COMPRESSED_DEEPSLATE = registerVariant("compressed_deepslate", Blocks.DEEPSLATE);
    public static final Block SQUEEZED_DEEPSLATE = registerVariant("squeezed_deepslate", Blocks.DEEPSLATE);
    public static final Block HARDENED_DEEPSLATE = registerVariant("hardened_deepslate", Blocks.DEEPSLATE);

    public static final Block COMPRESSED_COBBLED_DEEPSLATE = registerVariant("compressed_cobbled_deepslate", Blocks.COBBLED_DEEPSLATE);
    public static final Block SQUEEZED_COBBLED_DEEPSLATE = registerVariant("squeezed_cobbled_deepslate", Blocks.COBBLED_DEEPSLATE);
    public static final Block HARDENED_COBBLED_DEEPSLATE = registerVariant("hardened_cobbled_deepslate", Blocks.COBBLED_DEEPSLATE);

    public static final Block COMPRESSED_DIRT = registerVariant("compressed_dirt", Blocks.DIRT);
    public static final Block SQUEEZED_DIRT = registerVariant("squeezed_dirt", Blocks.DIRT);
    public static final Block HARDENED_DIRT = registerVariant("hardened_dirt", Blocks.DIRT);

    public static final Block COMPRESSED_GRASS_BLOCK = registerVariant("compressed_grass_block", Blocks.GRASS_BLOCK);
    public static final Block SQUEEZED_GRASS_BLOCK = registerVariant("squeezed_grass_block", Blocks.GRASS_BLOCK);
    public static final Block HARDENED_GRASS_BLOCK = registerVariant("hardened_grass_block", Blocks.GRASS_BLOCK);

    public static final Block COMPRESSED_CACTUS = registerVariant("compressed_cactus", Blocks.CACTUS);
    public static final Block SQUEEZED_CACTUS = registerVariant("squeezed_cactus", Blocks.CACTUS);
    public static final Block HARDENED_CACTUS = registerVariant("hardened_cactus", Blocks.CACTUS);
    // Logs
    public static final Block COMPRESSED_OAK_LOG = registerPillarVariant("compressed_oak_log", Blocks.OAK_LOG);
    public static final Block SQUEEZED_OAK_LOG = registerPillarVariant("squeezed_oak_log", Blocks.OAK_LOG);
    public static final Block HARDENED_OAK_LOG = registerPillarVariant("hardened_oak_log", Blocks.OAK_LOG);

    public static final Block COMPRESSED_SPRUCE_LOG = registerPillarVariant("compressed_spruce_log", Blocks.SPRUCE_LOG);
    public static final Block SQUEEZED_SPRUCE_LOG = registerPillarVariant("squeezed_spruce_log", Blocks.SPRUCE_LOG);
    public static final Block HARDENED_SPRUCE_LOG = registerPillarVariant("hardened_spruce_log", Blocks.SPRUCE_LOG);

    public static final Block COMPRESSED_BIRCH_LOG = registerPillarVariant("compressed_birch_log", Blocks.BIRCH_LOG);
    public static final Block SQUEEZED_BIRCH_LOG = registerPillarVariant("squeezed_birch_log", Blocks.BIRCH_LOG);
    public static final Block HARDENED_BIRCH_LOG = registerPillarVariant("hardened_birch_log", Blocks.BIRCH_LOG);

    public static final Block COMPRESSED_DARK_OAK_LOG = registerPillarVariant("compressed_dark_oak_log", Blocks.DARK_OAK_LOG);
    public static final Block SQUEEZED_DARK_OAK_LOG = registerPillarVariant("squeezed_dark_oak_log", Blocks.DARK_OAK_LOG);
    public static final Block HARDENED_DARK_OAK_LOG = registerPillarVariant("hardened_dark_oak_log", Blocks.DARK_OAK_LOG);

    public static final Block COMPRESSED_ACACIA_LOG = registerPillarVariant("compressed_acacia_log", Blocks.ACACIA_LOG);
    public static final Block SQUEEZED_ACACIA_LOG = registerPillarVariant("squeezed_acacia_log", Blocks.ACACIA_LOG);
    public static final Block HARDENED_ACACIA_LOG = registerPillarVariant("hardened_acacia_log", Blocks.ACACIA_LOG);

    public static final Block COMPRESSED_JUNGLE_LOG = registerPillarVariant("compressed_jungle_log", Blocks.JUNGLE_LOG);
    public static final Block SQUEEZED_JUNGLE_LOG = registerPillarVariant("squeezed_jungle_log", Blocks.JUNGLE_LOG);
    public static final Block HARDENED_JUNGLE_LOG = registerPillarVariant("hardened_jungle_log", Blocks.JUNGLE_LOG);

    public static final Block COMPRESSED_MANGROVE_LOG = registerPillarVariant("compressed_mangrove_log", Blocks.MANGROVE_LOG);
    public static final Block SQUEEZED_MANGROVE_LOG = registerPillarVariant("squeezed_mangrove_log", Blocks.MANGROVE_LOG);
    public static final Block HARDENED_MANGROVE_LOG = registerPillarVariant("hardened_mangrove_log", Blocks.MANGROVE_LOG);

    public static final Block COMPRESSED_CHERRY_LOG = registerPillarVariant("compressed_cherry_log", Blocks.CHERRY_LOG);
    public static final Block SQUEEZED_CHERRY_LOG = registerPillarVariant("squeezed_cherry_log", Blocks.CHERRY_LOG);
    public static final Block HARDENED_CHERRY_LOG = registerPillarVariant("hardened_cherry_log", Blocks.CHERRY_LOG);

    public static final Block COMPRESSED_PALE_OAK_LOG = registerPillarVariant("compressed_pale_oak_log", Blocks.PALE_OAK_LOG);
    public static final Block SQUEEZED_PALE_OAK_LOG = registerPillarVariant("squeezed_pale_oak_log", Blocks.PALE_OAK_LOG);
    public static final Block HARDENED_PALE_OAK_LOG = registerPillarVariant("hardened_pale_oak_log", Blocks.PALE_OAK_LOG);

    public static final Block COMPRESSED_CRIMSON_STEM = registerPillarVariant("compressed_crimson_stem", Blocks.CRIMSON_STEM);
    public static final Block SQUEEZED_CRIMSON_STEM = registerPillarVariant("squeezed_crimson_stem", Blocks.CRIMSON_STEM);
    public static final Block HARDENED_CRIMSON_STEM = registerPillarVariant("hardened_crimson_stem", Blocks.CRIMSON_STEM);

    public static final Block COMPRESSED_WARPED_STEM = registerPillarVariant("compressed_warped_stem", Blocks.WARPED_STEM);
    public static final Block SQUEEZED_WARPED_STEM = registerPillarVariant("squeezed_warped_stem", Blocks.WARPED_STEM);
    public static final Block HARDENED_WARPED_STEM = registerPillarVariant("hardened_warped_stem", Blocks.WARPED_STEM);

    public static final Block COMPRESSED_SAND = registerVariant("compressed_sand", Blocks.SAND);
    public static final Block SQUEEZED_SAND = registerVariant("squeezed_sand", Blocks.SAND);
    public static final Block HARDENED_SAND = registerVariant("hardened_sand", Blocks.SAND);

    public static final Block COMPRESSED_RED_SAND = registerVariant("compressed_red_sand", Blocks.RED_SAND);
    public static final Block SQUEEZED_RED_SAND = registerVariant("squeezed_red_sand", Blocks.RED_SAND);
    public static final Block HARDENED_RED_SAND = registerVariant("hardened_red_sand", Blocks.RED_SAND);

    public static final Block COMPRESSED_GRAVEL = registerVariant("compressed_gravel", Blocks.GRAVEL);
    public static final Block SQUEEZED_GRAVEL = registerVariant("squeezed_gravel", Blocks.GRAVEL);
    public static final Block HARDENED_GRAVEL = registerVariant("hardened_gravel", Blocks.GRAVEL);

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
            new CompressableBlockType("sand", Blocks.SAND, BlockTags.MINEABLE_WITH_SHOVEL, new Block[]{COMPRESSED_SAND, SQUEEZED_SAND, HARDENED_SAND}),
            new CompressableBlockType("red_sand", Blocks.RED_SAND, BlockTags.MINEABLE_WITH_SHOVEL, new Block[]{COMPRESSED_RED_SAND, SQUEEZED_RED_SAND, HARDENED_RED_SAND}),
            new CompressableBlockType("gravel", Blocks.GRAVEL, BlockTags.MINEABLE_WITH_SHOVEL, new Block[]{COMPRESSED_GRAVEL, SQUEEZED_GRAVEL, HARDENED_GRAVEL}),
    };

    private static Block registerVariant(String name, Block templateBlock) {
        Identifier block_id = Identifier.fromNamespaceAndPath(Squeeze.MOD_ID, name);
        Block toRegister = new Block(BlockBehaviour.Properties.ofFullCopy(templateBlock).setId(ResourceKey.create(Registries.BLOCK, block_id)));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, block_id, toRegister);
    }

    private static Block registerPillarVariant(String name, Block templateBlock) {
        Identifier block_id = Identifier.fromNamespaceAndPath(Squeeze.MOD_ID, name);
        Block toRegister = new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(templateBlock)
                .setId(ResourceKey.create(Registries.BLOCK, block_id)));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, block_id, toRegister);
    }

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
