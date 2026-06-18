package net.berdnne.squeeze;

import net.berdnne.squeeze.block.ModBlocks;
import net.berdnne.squeeze.creativemodtab.ModCreativeModeTabs;
import net.berdnne.squeeze.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Squeeze implements ModInitializer {
	public static final String MOD_ID = "squeeze";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}