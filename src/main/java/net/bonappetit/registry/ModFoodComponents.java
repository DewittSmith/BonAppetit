package net.bonappetit.registry;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build();
    public static final FoodComponent JUICE_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).alwaysEdible().build();
}
