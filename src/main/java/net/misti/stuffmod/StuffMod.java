package net.misti.stuffmod;

import net.fabricmc.api.ModInitializer;

import net.misti.stuffmod.block.ModBlocks;
import net.misti.stuffmod.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StuffMod implements ModInitializer {
	public static final String MOD_ID = "stuffmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}
