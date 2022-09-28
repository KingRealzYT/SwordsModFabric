package dev.realz.swordsmod.world.gen;

import dev.realz.swordsmod.SwordsMod;
import dev.realz.swordsmod.init.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class ModOreGen {

    private static ConfiguredFeature<?, ?> BLACK_IRON_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLACK_IRON_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> BLOOD_IRON_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLOOD_IRON_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> FIRE_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, ModBlocks.FIRE_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> CRIMSON_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRIMSON_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> COBALT_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> SILVER_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> BRUH_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BRUH_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> HELL_IRON_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, ModBlocks.HELL_IRON_ORE.getDefaultState(), 6));

    private static ConfiguredFeature<?, ?> ENDER_ORE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDER_ORE.getDefaultState(), 6));

    public static PlacedFeature BLACK_IRON_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(BLACK_IRON_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature BLOOD_IRON_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(BLOOD_IRON_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature FIRE_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(FIRE_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature CRIMSON_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(CRIMSON_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature COBALT_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(COBALT_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature SILVER_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(SILVER_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature BRUH_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(BRUH_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature HELL_IRON_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(HELL_IRON_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature ENDER_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(ENDER_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static void registerConfiguredOre() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_black_iron_ore"), BLACK_IRON_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_blood_iron_ore"), BLOOD_IRON_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "nether_fire_ore"), FIRE_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_crimson_ore"), CRIMSON_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_cobalt_ore"), COBALT_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_silver_ore"), SILVER_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_bruh_ore"), BRUH_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "nether_hell_iron_ore"), HELL_IRON_ORE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "end_ender_ore"), ENDER_ORE);
    }

    public static void registerPlacedOre() {
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_black_iron_ore"),
                BLACK_IRON_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_blood_iron_ore"),
                BLOOD_IRON_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "nether_fire_ore"),
                FIRE_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_crimson_ore"),
                CRIMSON_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_cobalt_ore"),
                COBALT_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_silver_ore"),
                SILVER_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_bruh_ore"),
                BRUH_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "nether_hell_iron_ore"),
                HELL_IRON_ORE_PLACED);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "end_ender_ore"),
                ENDER_ORE_PLACED);

    }

    public static void registerBiomeMod() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_black_iron_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_blood_iron_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "nether_fire_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_crimson_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_cobalt_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_silver_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_bruh_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "nether_hell_iron_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "end_ender_ore")));

    }

}
