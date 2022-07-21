package dev.realz.swordsmod.world.gen;

import dev.realz.swordsmod.SwordsMod;
import dev.realz.swordsmod.init.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
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
            (Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLACK_IRON_ORE.getDefaultState(), 9));

    public static PlacedFeature BLACK_IRON_ORE_PLACED = new PlacedFeature(
            RegistryEntry.of(BLACK_IRON_ORE),
            Arrays.asList(
                    CountPlacementModifier.of(40),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static void registerConfiguredOre() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(SwordsMod.MOD_ID, "overworld_black_iron_ore"), BLACK_IRON_ORE);
    }

    public static void registerPlacedOre() {
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(SwordsMod.MOD_ID, "overworld_black_iron_ore"),
                BLACK_IRON_ORE_PLACED);
    }

    public static void registerBiomeMod() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(SwordsMod.MOD_ID, "overworld_black_iron_ore")));
    }

}
