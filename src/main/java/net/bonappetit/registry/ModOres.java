package net.bonappetit.registry;

import net.bonappetit.SimpleOre;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOres {
    private static SimpleOre[] Ores = new SimpleOre[]
    {   
        // #Halite Ore
                new SimpleOre("ore_halite_overworld", Registry.CONFIGURED_FEATURE_WORLDGEN,
                    Feature.ORE
                            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,ModBlocks.GetBlock("halite_ore").getDefaultState(),14))
                            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,12,127)))
                            .spreadHorizontally()
                            .repeat(20)),

        // #Limestone
                new SimpleOre("limestone_overworld", Registry.CONFIGURED_FEATURE_WORLDGEN,
                    Feature.ORE
                            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,ModBlocks.GetBlock("limestone").getDefaultState(),33))
                            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,79)))
                            .spreadHorizontally()
                            .repeat(10)),
    };

    public static void registerOres()
    {
        for (SimpleOre ore : Ores)
        {
            RegistryKey<ConfiguredFeature<?,?>> key = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, ore.Identifier);
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), ore.Feature);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, key);
        }
    }
}