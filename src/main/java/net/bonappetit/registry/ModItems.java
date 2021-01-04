package net.bonappetit.registry;

import net.bonappetit.BonAppetit;
import net.bonappetit.SimpleBlockItem;
import net.bonappetit.SimpleItem;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ModItems 
{
    // Items
    public static final SimpleItem[] Items = new SimpleItem[]
    {
            // #Items
            new SimpleItem("salt", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("cooking_pan", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("cooking_pot", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("cooking_bakeware", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("juicer", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),

            // #Food
            new SimpleItem("cream", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.075f).build()),
            new SimpleItem("butter", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()),
            new SimpleItem("cheese", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build())),
            new SimpleItem("cheese_croquettes", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).snack().build()),
            new SimpleItem("cheese_soup", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()),
            new SimpleItem("juice_apple", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.075f).snack().build()),
            new SimpleItem("juice_berry", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.075f).snack().build()),
            new SimpleItem("juice_carrot", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.075f).snack().build()),
            new SimpleItem("juice_melon", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.075f).snack().build()),
            new SimpleItem("juice_pumpkin", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.075f).snack().build()),

            // #Miscs
            new SimpleItem("music_disc_afternoon", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).rarity(Rarity.RARE)),
    };

    // Block Items
    public static final SimpleBlockItem[] BlockItems = new SimpleBlockItem[]
    {
        new SimpleBlockItem("limestone", Registry.ITEM, ModBlocks.Blocks.get("LIMESTONE").Block, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
    };

    public static void registerItems()
    {
        for (SimpleBlockItem blockItem : BlockItems) Registry.register(blockItem.Registry, blockItem.Identifier, blockItem.BlockItem);
        for (SimpleItem item : Items) Registry.register(item.Registry, item.Identifier, item.Item);

    };
}
