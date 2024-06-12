package net.misti.stuffmod.item.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class Staff extends SwordItem {



    public Staff(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public Staff() {
        super(, 4, 5);
    }
}
