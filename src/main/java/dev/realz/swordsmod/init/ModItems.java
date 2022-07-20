package dev.realz.swordsmod.init;

import dev.realz.swordsmod.SwordsMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Ingots
    public static final Item BLACK_IRON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));

    // Ingot Register
    public static void registerIngots() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_ingot"), BLACK_IRON_INGOT);
    }

}
