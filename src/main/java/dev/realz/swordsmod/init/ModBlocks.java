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
    public static final OreBlock BLACK_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    // Block's
    public static final Block BLACK_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    // Register Ore's
    public static void registerOres() {
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "black_iron_ore"), BLACK_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_ore"),
                new BlockItem(BLACK_IRON_ORE, new FabricItemSettings().group(SwordsMod.ORETAB)));
    }

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SwordsMod.MOD_ID, "black_iron_block"), BLACK_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SwordsMod.MOD_ID, "black_iron_block"),
                new BlockItem(BLACK_IRON_BLOCK, new FabricItemSettings().group(SwordsMod.BLOCKTAB)));
    }

}
