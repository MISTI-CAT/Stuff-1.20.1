package net.misti.stuffmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.misti.stuffmod.StuffMod;
import net.misti.stuffmod.item.custom.Staff;

public class ModItems {
    public static final Item STAFF = registerItem("copper_staff", new Staff());

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StuffMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        StuffMod.LOGGER.info("Registering Mod Items For " + StuffMod.MOD_ID);

    }
}
