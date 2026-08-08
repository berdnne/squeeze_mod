package net.berdnne.squeeze.block;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

public record CompressableBlockType(String name, ItemLike baseItem, TagKey<Block> tool, Block[] tiers) {

}
