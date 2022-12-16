package net.caillous_boyfriend.drill_tool.item;

import net.caillous_boyfriend.drill_tool.DrillTool;
import net.caillous_boyfriend.drill_tool.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Custom Items
    public static final Item DRILL_TOOL = registerItem("drill",
            new ModPickaxeItem(ModToolMaterials.DRILL, 5, 20,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DrillTool.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DrillTool.LOGGER.debug("Registering mod items for " + DrillTool.MOD_ID);
    }
}
