package net.bonappetit;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class SimpleOre
{
    public String Name;
    public RegistryKey<Registry<ConfiguredFeature<?, ?>>> Registry;
    public ConfiguredFeature<?, ?> Feature;

    public Identifier Identifier;

    public SimpleOre(String name, RegistryKey<Registry<ConfiguredFeature<?, ?>>> registry, ConfiguredFeature<?, ?> feature) {
        Name = name;
        Registry = registry;
        Feature = feature;

        Identifier = new Identifier(BonAppetit.MOD_ID, Name);
    }
}
