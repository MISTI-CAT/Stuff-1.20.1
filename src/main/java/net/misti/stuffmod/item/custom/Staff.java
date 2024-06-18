package net.misti.stuffmod.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.misti.stuffmod.item.ModToolMaterial;

public class Staff extends SwordItem {



    public Staff(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public Staff() {
        super(ModToolMaterial.COPPER, 4, 5, new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1).fireproof());
    }
}
