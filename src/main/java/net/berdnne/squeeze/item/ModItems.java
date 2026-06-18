package net.berdnne.squeeze.item;

import net.berdnne.squeeze.Squeeze;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    //public static final Item GUN = registerItem("gun", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {

        Identifier itemId = Identifier.fromNamespaceAndPath(Squeeze.MOD_ID, name);
        return Registry.register(BuiltInRegistries.ITEM, itemId,
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, itemId))));
    }

    public static void registerModItems() {
        Squeeze.LOGGER.info("Registering Mod Items for " + Squeeze.MOD_ID);

//        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(output -> {
//            output.accept(GUN);
//        });
    }

}
