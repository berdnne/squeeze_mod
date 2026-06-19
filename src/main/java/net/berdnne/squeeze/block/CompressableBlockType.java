package net.berdnne.squeeze.block;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

public class CompressableBlockType {

    private final String name;
    private final ItemLike baseItem;
    private final Block[] tiers;

    public CompressableBlockType(String name, ItemLike baseItem, Block[] tiers) {
        this.name = name;
        this.baseItem = baseItem;
        this.tiers = tiers;
    }

    public String getName() {
        return name;
    }

    public ItemLike getBaseItem() {
        return baseItem;
    }

    public Block[] getTiers() {
        return tiers;
    }
}
