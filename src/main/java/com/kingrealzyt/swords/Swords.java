package com.kingrealzyt.swords;

import com.kingrealzyt.swords.registry.ModBlocks;
import com.kingrealzyt.swords.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Swords implements ModInitializer {

	public static final String MOD_ID = "rswords";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
			.build(new Identifier(MOD_ID, "swordstab"), () -> new ItemStack(ModItems.BLACK_IRON_INGOT));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItems.registerBlockItems();
		ModBlocks.registerOreBlocks();
		ModItems.registerOreBlockItems();
	}
}
