package net.bonappetit.registry;

import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguredFeatures {

    private static final RuleTest IN_LIMESTONE = new BlockMatchRuleTest(ModBlocks.LIMESTONE);

    public static final ConfiguredFeature<?, ?> LIMESTONE = Feature.ORE
    .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.LIMESTONE.getDefaultState(), 33))
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 79)))
    .spreadHorizontally()
    .repeat(10);

    public static final ConfiguredFeature<?, ?> ORE_HALITE = Feature.ORE
        .configure(new OreFeatureConfig(IN_LIMESTONE, ModBlocks.HALITE_ORE.getDefaultState(), 14))
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 12, 127)))
        .spreadHorizontally()
        .repeat(20);
}
