package net.bonappetit.registry;

import net.bonappetit.BonAppetit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ModOres {
    public static RegistryKey<ConfiguredFeature<?, ?>> LIMESTONE_OVERWORLD = register("limestone_overworld", ModConfiguredFeatures.LIMESTONE);
    public static RegistryKey<ConfiguredFeature<?, ?>> ORE_HALITE_OVERWORLD = register("ore_halite_overworld", ModConfiguredFeatures.ORE_HALITE);

    static {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, LIMESTONE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_HALITE_OVERWORLD);
    }
    
    private static RegistryKey<ConfiguredFeature<?, ?>> register(String id, ConfiguredFeature<?, ?> ore) {
        RegistryKey<ConfiguredFeature<?, ?>> oreKey = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(BonAppetit.MOD_ID, id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreKey.getValue(), ore);
        return oreKey;
    }

    public static void init() { }
}