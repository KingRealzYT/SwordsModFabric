package com.kingrealzyt.swords.registry;

import com.kingrealzyt.swords.Swords;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    // Items
    public static final Item BLACK_IRON_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));
    public static final Item BLOOD_IRON_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));
    public static final Item FIRE_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));
    public static final Item CRIMSON_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));
    public static final Item COBALT_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));
    public static final Item BRUH_INGOT = new Item(new Item.Settings().group(Swords.ITEM_GROUP));

    // Swords


    // Combined Swords


    // Block Items
    public static final BlockItem BLACK_IRON_BLOCK = new BlockItem(ModBlocks.BLACK_IRON_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem BLOOD_IRON_BLOCK = new BlockItem(ModBlocks.BLOOD_IRON_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem FIRE_BLOCK = new BlockItem(ModBlocks.FIRE_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem CRIMSON_BLOCK = new BlockItem(ModBlocks.CRIMSON_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem COBALT_BLOCK = new BlockItem(ModBlocks.COBALT_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem SILVER_BLOCK = new BlockItem(ModBlocks.SILVER_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem BRUH_BLOCK = new BlockItem(ModBlocks.BRUH_BLOCK, new Item.Settings().group(Swords.ITEM_GROUP));

    // OreBlock Items
    public static final BlockItem BLACK_IRON_ORE = new BlockItem(ModBlocks.BLACK_IRON_ORE, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem BLOOD_IRON_ORE = new BlockItem(ModBlocks.BLOOD_IRON_ORE, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem FIRE_ORE = new BlockItem(ModBlocks.FIRE_ORE, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem CRIMSON_ORE = new BlockItem(ModBlocks.CRIMSON_ORE, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem COBALT_ORE = new BlockItem(ModBlocks.COBALT_ORE, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem SILVER_ORE = new BlockItem(ModBlocks.SILVER_ORE, new Item.Settings().group(Swords.ITEM_GROUP));
    public static final BlockItem BRUH_ORE = new BlockItem(ModBlocks.BRUH_ORE, new Item.Settings().group(Swords.ITEM_GROUP));

    // Registering Items
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "black_iron_ingot"), BLACK_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "blood_iron_ingot"), BLOOD_IRON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "fire_ingot"), FIRE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "crimson_ingot"), CRIMSON_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "bruh_ingot"), BRUH_INGOT);
    }

    // Registering Blocks
    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "black_iron_block"), BLACK_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "blood_iron_block"), BLOOD_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "fire_block"), FIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "crimson_block"), CRIMSON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "bruh_block"), BRUH_BLOCK);
    }

    // Registering OreBlocks
    public static void registerOreBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "black_iron_ore"), BLACK_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "blood_iron_ore"), BLOOD_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "fire_ore"), FIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "crimson_ore"), CRIMSON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Swords.MOD_ID, "bruh_ore"), BRUH_ORE);
    }
}
