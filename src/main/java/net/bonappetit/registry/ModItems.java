package net.bonappetit.registry;

import net.bonappetit.BonAppetit;
import net.bonappetit.common.CompostableItem;
import net.bonappetit.common.CookingItem;
import net.bonappetit.common.DiscItem;
import net.bonappetit.common.JuiceItem;
import net.bonappetit.common.ModFoodComponents;
import net.bonappetit.common.ModSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems 
{
    // ~BLOCKS~
    public static final Item HALITE_ORE = register(ModBlocks.HALITE_ORE);
    public static final Item LIMESTONE = register(ModBlocks.LIMESTONE);
    public static final Item LIMESTONE_STAIRS = register(ModBlocks.LIMESTONE_STAIRS);
    public static final Item LIMESTONE_SLAB = register(ModBlocks.LIMESTONE_SLAB);
    public static final Item LIMESTONE_WALL = register(ModBlocks.LIMESTONE_WALL);
    public static final Item LIMESTONE_POLISHED = register(ModBlocks.LIMESTONE_POLISHED);
    public static final Item LIMESTONE_POLISHED_STAIRS = register(ModBlocks.LIMESTONE_POLISHED_STAIRS);
    public static final Item LIMESTONE_POLISHED_SLAB = register(ModBlocks.LIMESTONE_POLISHED_SLAB);
    public static final Item QUARTZ_TILES = register(ModBlocks.QUARTZ_TILES);
    public static final Item SALT_BLOCK = register(ModBlocks.SALT_BLOCK);
    public static final Item BUTTER_BLOCK = register(ModBlocks.BUTTER_BLOCK);
    public static final Item CHEESE_BLOCK = register(ModBlocks.CHEESE_BLOCK);
    //  ~COOKING TOOLS~
    public static final Item JUICER = register("juicer", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));
    public static final Item CUTTING_BOARD = register("cutting_board", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));
    public static final Item PAN = register("cooking_pan", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));
    public static final Item POT = register("cooking_pot", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));
    public static final Item MORTAR_AND_PESTLE = register("cooking_mortar_and_pestle", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));
    public static final Item BAKEWARE = register("cooking_bakeware", new CookingItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).maxCount(1)));
    //  ~ITEMS~
    public static final Item SALT = register("salt", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    public static final Item CREAM = register("cream", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    public static final Item BUTTER = register("butter", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    public static final Item FLOUR = register("flour", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    public static final Item DOUGH = register("dough", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP)));
    //  ~FOOD~
    public static final Item SCALLION = register("scallion", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.SCALLION), 0.65F));
    public static final Item ONION = register("onion", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.ONION), 0.65F));
    public static final Item SEEDS_ONION = register("seeds_onion", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP), 0.30f));
    public static final Item TOMATO = register("tomato", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.TOMATO), 0.65F));
    public static final Item SEEDS_TOMATO = register("seeds_tomato", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP), 0.30f));
    public static final Item GARLIC = register("garlic", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.GARLIC), 0.65F));
    public static final Item SEEDS_GARLIC = register("seeds_garlic", new CompostableItem(new Item.Settings().group(BonAppetit.ITEM_GROUP), 0.30f));
    public static final Item CHEESE = register("cheese", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.CHEESE)));
    public static final Item CHEESE_CROQUETTES = register("cheese_croquettes", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.CHEESE_CROQUETTES)));
    public static final Item PANCAKES = register("pancakes", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.PANCAKES)));
    public static final Item FRIED_EGG = register("fried_egg", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.FRIED_EGG)));
    public static final Item CHEESE_SOUP = register("cheese_soup", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.CHEESE_SOUP)));
    public static final Item ONION_SOUP = register("onion_soup", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.ONION_SOUP)));
    public static final Item CARROT_SALAD = register("carrot_salad", new Item(new Item.Settings().group(BonAppetit.ITEM_GROUP).food(ModFoodComponents.CARROT_SALAD)));
    //  ~DRINKS~
    public static final Item JUICE_APPLE = register("juice_apple", new JuiceItem(16776960, new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_APPLE).group(BonAppetit.ITEM_GROUP)));
    public static final Item JUICE_PUMPKIN = register("juice_pumpkin", new JuiceItem(16762880, new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_PUMPKIN).group(BonAppetit.ITEM_GROUP)));
    public static final Item JUICE_CARROT = register("juice_carrot", new JuiceItem(16751365, new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_CARROT).group(BonAppetit.ITEM_GROUP)));
    public static final Item JUICE_TOMATO = register("juice_tomato", new JuiceItem(14435840, new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_TOMATO).group(BonAppetit.ITEM_GROUP)));
    public static final Item JUICE_MELON = register("juice_melon", new JuiceItem(16711680, new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_MELON).group(BonAppetit.ITEM_GROUP)));
    public static final Item JUICE_BERRIES = register("juice_berries", new JuiceItem(16711835, new Item.Settings().recipeRemainder(JUICER).food(ModFoodComponents.JUICE_BERRIES).group(BonAppetit.ITEM_GROUP)));


    //  ~MISC~
    public static final Item MUSIC_DISC_AFTERNOON = register("music_disc_afternoon", new DiscItem(0, ModSoundEvents.SOUND_AFTERNOON, new Item.Settings().maxCount(1).group(BonAppetit.ITEM_GROUP).rarity(Rarity.RARE)));

    // WHEAT_SEEDS = register((String)"wheat_seeds", (Item)(new AliasedBlockItem(Blocks.WHEAT, (new Item.Settings()).group(ItemGroup.MATERIALS))));

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

    public static void init() { }
}