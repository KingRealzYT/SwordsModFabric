package dev.realz.swordsmod.init;

import dev.realz.swordsmod.SwordsMod;
import dev.realz.swordsmod.swordeffects.BlackIronSword;
import dev.realz.swordsmod.util.enums.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Shards
    public static final Item BLACK_IRON_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));

    // Ingots
    public static final Item BLACK_IRON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));

    // Essences
    public static final Item DRAGON_ESSENCE = new Item(new Item.Settings().group(SwordsMod.ESSENCETAB));

    // Sticks
    public static final Item IRON_STICK = new Item(new Item.Settings().group(SwordsMod.STICKTAB));
    public static final Item HELL_IRON_STICK = new Item(new Item.Settings().group(SwordsMod.STICKTAB));

    // Swords
    public static final ToolItem BLACK_IRON_SWORD = new BlackIronSword(
            ModItemTier.BLACK_IRON, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    // Shard Register
    public static void registerShards() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_shard"), BLACK_IRON_SHARD);
    }

    // Ingot Register
    public static void registerIngots() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_ingot"), BLACK_IRON_INGOT);
    }

    // Essence Register
    public static void registerEssences() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "dragon_essence"), DRAGON_ESSENCE);
    }

    // Stick Register
    public static void registerSticks() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "iron_stick"), IRON_STICK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_iron_stick"), HELL_IRON_STICK);
    }

    // Sword Register
    public static void registerSwords() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_sword"), BLACK_IRON_SWORD);
    }

}
