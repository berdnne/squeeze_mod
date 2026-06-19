package net.berdnne.squeeze.creativemodtab;

import net.berdnne.squeeze.Squeeze;
import net.berdnne.squeeze.block.CompressableBlockType;
import net.berdnne.squeeze.block.ModBlocks;
import net.berdnne.squeeze.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTabs {

    public static final CreativeModeTab SQUEEZE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Squeeze.MOD_ID, "squeeze_items"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.COMPRESSED_COBBLESTONE))
                    .title(Component.translatable("creativemodetab.squeeze.squeeze_items"))
                    .displayItems((parameters, output) -> {
                        for (CompressableBlockType cbt : ModBlocks.COMPRESSABLE_BLOCK_TYPES) {
                            for (Block block : cbt.getTiers()) {
                                output.accept(block);
                            }
                        }
                    })
                    .build());

    public static void registerModCreativeModeTabs() {
        Squeeze.LOGGER.info("Registering Creative Mode Tabs for " + Squeeze.MOD_ID);
    }
}
