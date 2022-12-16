package net.caillous_boyfriend.drill_tool;

import net.caillous_boyfriend.drill_tool.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrillTool implements ModInitializer {
	public static final String MOD_ID = "drill_tool";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
