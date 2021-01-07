package net.bonappetit.registry;

import net.bonappetit.BonAppetit;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ModItems 
{
    // Items
    /*public static final SimpleItem[] Items = new SimpleItem[]
    {
            // #Items
            new SimpleItem("salt", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("cutting_board", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)),
            new SimpleItem("cooking_pan", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)),
            new SimpleItem("cooking_pot", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)),
            new SimpleItem("cooking_mortar_and_pestle", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)),
            new SimpleItem("cooking_bakeware", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)),
            new SimpleItem("juicer", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)),

            // #Food
            new SimpleItem("leek", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build())),
            new SimpleItem("cream", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("butter", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleItem("cheese", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())),
            new SimpleItem("cheese_croquettes", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).snack().build())),
            new SimpleItem("cheese_soup", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())),
            new SimpleItem("carrot_salad", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())),
            new SimpleItem("juice_apple", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).alwaysEdible().build())),
            new SimpleItem("juice_pumpkin", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).alwaysEdible().build())),
            new SimpleItem("juice_carrot", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).alwaysEdible().build())),
            new SimpleItem("juice_melon", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build())),
            new SimpleItem("juice_berries", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build())),

            // #Miscs
            new SimpleItem("music_disc_afternoon", Registry.ITEM, new Item.Settings().group(BonAppetit.ITEM_GROUP).rarity(Rarity.RARE).maxCount(1)),
    };

    // Block Items
    public static final SimpleBlockItem[] BlockItems = new SimpleBlockItem[]
    {
            // #Building Blocks
            new SimpleBlockItem("halite_ore", Registry.ITEM, ModBlocks.GetBlock("halite_ore"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone", Registry.ITEM, ModBlocks.GetBlock("limestone"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone_stairs", Registry.ITEM, ModBlocks.GetBlock("limestone_stairs"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone_slab", Registry.ITEM, ModBlocks.GetBlock("limestone_slab"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone_wall", Registry.ITEM, ModBlocks.GetBlock("limestone_wall"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone_polished", Registry.ITEM, ModBlocks.GetBlock("limestone_polished"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone_polished_stairs", Registry.ITEM, ModBlocks.GetBlock("limestone_polished_stairs"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("limestone_polished_slab", Registry.ITEM, ModBlocks.GetBlock("limestone_polished_slab"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("quartz_tiles", Registry.ITEM, ModBlocks.GetBlock("quartz_tiles"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("salt_block", Registry.ITEM, ModBlocks.GetBlock("salt_block"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("butter_block", Registry.ITEM, ModBlocks.GetBlock("butter_block"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
            new SimpleBlockItem("cheese_block", Registry.ITEM, ModBlocks.GetBlock("cheese_block"), new Item.Settings().group(BonAppetit.ITEM_GROUP)),
    };*/

    public static final Item JUICER = register("juicer", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));

    public static final Item SALT = register("salt", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    public static final Item CHEESE = register("cheese", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.CHEESE)));
    
    public static final Item JUICE_APPLE = register("juice_apple", new JuiceItem(new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_APPLE).group(BonAppetit.ITEM_GROUP)));

    public static final Item MUSIC_DISC_AFTERNOON = register("music_disc_afternoon", new DiscItem(0, ModSoundEvents.SOUND_AFTERNOON, new Item.Settings().maxCount(1).group(BonAppetit.ITEM_GROUP).rarity(Rarity.RARE)));

    public static final Item HALITE_ORE = register(ModBlocks.HALITE_ORE);

    public static final Item LIMESTONE = register(ModBlocks.LIMESTONE);
    public static final Item LIMESTONE_WALL = register(ModBlocks.LIMESTONE_WALL);

    public static final Item LIMESTONE_POLISHED = register(ModBlocks.LIMESTONE_POLISHED);
    public static final Item LIMESTONE_POLISHED_SLAB = register(ModBlocks.LIMESTONE_POLISHED_SLAB);
    public static final Item LIMESTONE_POLISHED_STAIRS = register(ModBlocks.LIMESTONE_POLISHED_STAIRS);
    
    private static Item register(Block block) {
        return register(new BlockItem(block, new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    }

    private static Item register(BlockItem item) {
        return register((Block)item.getBlock(), (Item)item);
    }
  
    protected static Item register(Block block, Item item) {
        return register(Registry.BLOCK.getId(block), item);
    }

    private static Item register(String id, Item item) {
        return register(new Identifier(BonAppetit.MOD_ID, id), item);
    }
    
    private static Item register(Identifier id, Item item) {
       return (Item)Registry.register(Registry.ITEM, id, item);
    }
}