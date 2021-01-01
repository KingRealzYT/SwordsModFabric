package com.kingrealzyt.swords.registry;

import com.kingrealzyt.swords.Swords;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{

    // Blocks
    public static final Block BLACK_IRON_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block BLOOD_IRON_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block FIRE_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block CRIMSON_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block COBALT_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block BRUH_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));

    // Ore Blocks
    public static final Block BLACK_IRON_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block BLOOD_IRON_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block FIRE_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block CRIMSON_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block COBALT_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block SILVER_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block BRUH_ORE = new Block(FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));

    // Registering Blocks
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "black_iron_block"), BLACK_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "blood_iron_block"), BLOOD_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "fire_block"), FIRE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "crimson_block"), CRIMSON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "bruh_block"), BRUH_BLOCK);
    }

    // Registering OreBlocks
    public static void registerOreBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "black_iron_ore"), BLACK_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "blood_iron_ore"), BLOOD_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "fire_ore"), FIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "crimson_ore"), CRIMSON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Swords.MOD_ID, "bruh_ore"), BRUH_ORE);
    }


}
