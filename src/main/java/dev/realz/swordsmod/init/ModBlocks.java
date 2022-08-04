package dev.realz.swordsmod.init;

import dev.realz.swordsmod.SwordsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Ore's
    public static final OreBlock BLACK_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock BLOOD_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock FIRE_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock CRIMSON_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock COBALT_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock SILVER_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock BRUH_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock HELL_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final OreBlock ENDER_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());


    // Block's
    public static final Block BLACK_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block BLOOD_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block FIRE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block CRIMSON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block COBALT_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block BRUH_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block HELL_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static final Block ENDER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());


    // Register Ore's
    public static void registerOres() {
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "black_iron_ore"), BLACK_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_ore"),
                new BlockItem(BLACK_IRON_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "blood_iron_ore"), BLOOD_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "blood_iron_ore"),
                new BlockItem(BLOOD_IRON_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "fire_ore"), FIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "fire_ore"),
                new BlockItem(FIRE_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "crimson_ore"), CRIMSON_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "crimson_ore"),
                new BlockItem(CRIMSON_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "cobalt_ore"),
                new BlockItem(COBALT_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "silver_ore"),
                new BlockItem(SILVER_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "bruh_ore"), BRUH_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "bruh_ore"),
                new BlockItem(BRUH_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "hell_iron_ore"), HELL_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_iron_ore"),
                new BlockItem(HELL_IRON_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "ender_ore"), ENDER_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "ender_ore"),
                new BlockItem(ENDER_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
    }

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "black_iron_block"), BLACK_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_block"),
                new BlockItem(BLACK_IRON_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "blood_iron_block"), BLOOD_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "blood_iron_block"),
                new BlockItem(BLOOD_IRON_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "fire_block"), FIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "fire_block"),
                new BlockItem(FIRE_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "crimson_block"), CRIMSON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "crimson_block"),
                new BlockItem(CRIMSON_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "cobalt_block"),
                new BlockItem(COBALT_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "silver_block"),
                new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "bruh_block"), BRUH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "bruh_block"),
                new BlockItem(BRUH_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "hell_iron_block"), HELL_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "hell_iron_block"),
                new BlockItem(HELL_IRON_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "ender_block"), ENDER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "ender_block"),
                new BlockItem(ENDER_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
    }

}
