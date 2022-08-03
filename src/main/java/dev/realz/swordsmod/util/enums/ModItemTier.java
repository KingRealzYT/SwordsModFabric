package dev.realz.swordsmod.util.enums;

import dev.realz.swordsmod.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements ToolMaterial {

    BLACK_IRON(3, 1500, 7.0F, 6, 11, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    BLOOD_IRON(3, 1500, 7.0F, 6, 11, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    FIRE(3, 1800, 7.0F, 7, 12, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    CRIMSON(3, 1600, 7.0F, 6, 11, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    COBALT(3, 1600, 7.0F, 6, 11, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    SILVER(3, 1500, 7.0F, 6, 11, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    BRUH(3, 1800, 7.0F, 6.5F, 12, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    HELL(3, 1800, 7.0F, 7, 12, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    ENDER(3, 2000, 7.0F, 9, 13, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    VAMPIRIC(3, 2200, 7.0F, 10, 15, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    INFESTED(3, 2400, 7.0F, 11, 16, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    HELL_BENDER(3, 2600, 7.0F, 12, 17, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT)),

    HOLY(3, 3000, 7.0F, 18, 18, () -> Ingredient.ofItems(ModItems.BLACK_IRON_INGOT));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
