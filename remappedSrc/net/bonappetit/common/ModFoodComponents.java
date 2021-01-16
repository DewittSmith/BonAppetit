package net.bonappetit.common;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent SCALLION = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent CHEESE_CROQUETTES = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent PANCAKES = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent TOMATO_SOUP = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build();
    public static final FoodComponent CHEESE_SOUP = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();
    public static final FoodComponent ONION_SOUP = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build();
    public static final FoodComponent CARROT_SALAD = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();

    public static final FoodComponent JUICE_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).alwaysEdible().build();
    public static final FoodComponent JUICE_PUMPKIN = new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).alwaysEdible().build();
    public static final FoodComponent JUICE_CARROT = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).alwaysEdible().build();
    public static final FoodComponent JUICE_TOMATO = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent JUICE_MELON = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent JUICE_BERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
}
