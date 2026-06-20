package net.berdnne.squeeze.block;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

public record CompressableBlockType(String name, ItemLike baseItem, Block[] tiers) {

}
