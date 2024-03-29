package dev.realz.swordsmod.init;

import dev.realz.swordsmod.SwordsMod;
import dev.realz.swordsmod.swordeffects.*;
import dev.realz.swordsmod.util.enums.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Shards
    public static final Item BLACK_IRON_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item BLOOD_IRON_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item FIRE_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item CRIMSON_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item COBALT_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item SILVER_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item BRUH_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item HELL_IRON_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));
    public static final Item ENDER_SHARD = new Item(new Item.Settings().group(SwordsMod.SHARDTAB));

    // Ingots
    public static final Item BLACK_IRON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item BLOOD_IRON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item FIRE_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item CRIMSON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item COBALT_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item BRUH_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item HELL_IRON_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));
    public static final Item ENDER_INGOT = new Item(new Item.Settings().group(SwordsMod.INGOTTAB));



    // Essences
    public static final Item DRAGON_ESSENCE = new Item(new Item.Settings().group(SwordsMod.ESSENCETAB));

    // Sticks
    public static final Item IRON_STICK = new Item(new Item.Settings().group(SwordsMod.STICKTAB));
    public static final Item HELL_IRON_STICK = new Item(new Item.Settings().group(SwordsMod.STICKTAB));

    // Swords
    public static final ToolItem BLACK_IRON_SWORD = new BlackIronSword(
            ModItemTier.BLACK_IRON, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem BLOOD_IRON_SWORD = new BloodIronSword(
            ModItemTier.BLOOD_IRON, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem FIRE_SWORD = new FireSword(
            ModItemTier.FIRE, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem CRIMSON_SWORD = new CrimsonSword(
            ModItemTier.CRIMSON, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem COBALT_SWORD = new CobaltSword(
            ModItemTier.COBALT, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem SILVER_SWORD = new SilverSword(
            ModItemTier.SILVER, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem BRUH_SWORD = new BruhSword(
            ModItemTier.BRUH, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem HELL_IRON_SWORD = new HellIronSword(
            ModItemTier.HELL, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));
    public static final ToolItem ENDER_SWORD = new EnderSword(
            ModItemTier.ENDER, 5, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    // Combined Swords

    public static final ToolItem VAMPIRIC_SWORD = new VampiricSword(
            ModItemTier.VAMPIRIC, 9, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    public static final ToolItem INFESTED_SWORD = new InfestedSword(
            ModItemTier.INFESTED, 10, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    public static final ToolItem HELL_BENDER_SWORD = new HellBenderSword(
            ModItemTier.HELL_BENDER, 11, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    // Final Swords
    public static final ToolItem HOLY_SWORD = new HolySword(
            ModItemTier.HOLY, 12, -2.4F, new Item.Settings().group(SwordsMod.SWORDTAB));

    // Shard Register
    public static void registerShards() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_shard"), BLACK_IRON_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "blood_iron_shard"), BLOOD_IRON_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "fire_shard"), FIRE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "crimson_shard"), CRIMSON_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "cobalt_shard"), COBALT_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "silver_shard"), SILVER_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "bruh_shard"), BRUH_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_iron_shard"), HELL_IRON_SHARD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "ender_shard"), ENDER_SHARD);
    }

    // Ingot Register
    public static void registerIngots() {
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_ingot"), BLACK_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "blood_iron_ingot"), BLOOD_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "fire_ingot"), FIRE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "crimson_ingot"), CRIMSON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "bruh_ingot"), BRUH_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_iron_ingot"), HELL_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "ender_ingot"), ENDER_INGOT);
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
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "blood_iron_sword"), BLOOD_IRON_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "fire_sword"), FIRE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "crimson_sword"), CRIMSON_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "cobalt_sword"), COBALT_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "silver_sword"), SILVER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "bruh_sword"), BRUH_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_iron_sword"), HELL_IRON_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "ender_sword"), ENDER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "vampiric_sword"), VAMPIRIC_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "infested_sword"), INFESTED_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_bender_sword"), HELL_BENDER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "holy_sword"), HOLY_SWORD);
    }

}
