package net.misti.stuffmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.misti.stuffmod.StuffMod;
import net.misti.stuffmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(StuffMod.MOD_ID, "stuff"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.stuff"))
                    .icon(() -> new ItemStack(ModBlocks.Stuff_Block)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.Stuff_Block);


                    }).build());


    public static void registerItemGroups() {
        StuffMod.LOGGER.info("Registering Item Groups for " + StuffMod.MOD_ID);
    }
}
