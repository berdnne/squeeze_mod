package net.berdnne.squeeze;

import net.berdnne.squeeze.datagen.ModBlockLootTableProvider;
import net.berdnne.squeeze.datagen.ModBlockTagsProvider;
import net.berdnne.squeeze.datagen.ModModelProvider;
import net.berdnne.squeeze.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SqueezeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
