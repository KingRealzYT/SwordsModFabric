package dev.realz.swordsmod;

import dev.realz.swordsmod.init.ModBlocks;
import dev.realz.swordsmod.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class SwordsMod implements ModInitializer {

    public static final String MOD_ID = "rswords";

    public static final ItemGroup INGOTTAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "ingots"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT)
    );

    public static final ItemGroup SHARDTAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "shards"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT)
    );

    public static final ItemGroup ESSENCETAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "essences"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT)
    );

    public static final ItemGroup STICKTAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "sticks"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT)
    );

    public static final ItemGroup SWORDTAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "swords"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT)
    );

    public static final ItemGroup BLOCKTAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "blocks"),
            () -> new ItemStack(ModItems.BLACK_IRON_INGOT)
    );

    public static final ItemGroup ORETAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "ores"),
            () -> new ItemStack(ModBlocks.BLACK_IRON_ORE)
    );

    @Override
    public void onInitialize() {
        ModItems.registerIngots();
        ModBlocks.registerOres();
    }
}