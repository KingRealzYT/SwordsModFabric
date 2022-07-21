package dev.realz.swordsmod.init;

import dev.realz.swordsmod.SwordsMod;
import dev.realz.swordsmod.util.enums.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Ingots
    public static final Item BLACK_IRON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));

    // Swords
    public static final ToolItem BLACK_IRON_SWORD = new SwordItem(
            ModItemTier.BLACK_IRON, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    // Ingot Register
    public static void registerIngots() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_ingot"), BLACK_IRON_INGOT);
    }

    // Sword Register
    public static void registerSwords() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_sword"), BLACK_IRON_SWORD);
    }

}
