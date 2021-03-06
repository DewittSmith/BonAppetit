package net.bonappetit.registry;

import java.util.ArrayList;

import net.bonappetit.BonAppetit;
import net.bonappetit.common.CompostableItem;
import net.bonappetit.common.CookingItem;
import net.bonappetit.common.DiscItem;
import net.bonappetit.common.JuiceItem;
import net.bonappetit.common.ModFoodComponents;
import net.bonappetit.common.ModItem;
import net.bonappetit.common.ModSeedItem;
import net.bonappetit.common.ModSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems 
{
    public static final ArrayList<JuiceItem> JUICE_ITEMS = new ArrayList<JuiceItem>();
    public static final ArrayList<ModSeedItem> SEED_ITEMS = new ArrayList<ModSeedItem>();

    //  [BLOCKS]
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
    //  [COOKING TOOLS]
    public static final Item JUICER = register("juicer", new CookingItem(new Item.Settings()));
    public static final Item CUTTING_BOARD = register("cutting_board", new CookingItem(new Item.Settings()));
    public static final Item PAN = register("cooking_pan", new CookingItem(new Item.Settings()));
    public static final Item POT = register("cooking_pot", new CookingItem(new Item.Settings()));
    public static final Item MORTAR_AND_PESTLE = register("cooking_mortar_and_pestle", new CookingItem(new Item.Settings()));
    public static final Item BAKEWARE = register("cooking_bakeware", new CookingItem(new Item.Settings()));
    //  [ITEMS]
    public static final Item SALT = register("salt", new ModItem(new Item.Settings()));
    public static final Item CREAM = register("cream", new ModItem(new Item.Settings()));
    public static final Item FLOUR = register("flour", new ModItem(new Item.Settings()));
    public static final Item BUTTER = register("butter", new ModItem(new Item.Settings()));
    public static final Item DOUGH = register("dough", new ModItem(new Item.Settings()));
    //  [FOOD]
    public static final Item GARLIC = register("garlic", new CompostableItem(new Item.Settings().food(ModFoodComponents.GARLIC), 0.65F));
    public static final Item SEEDS_GARLIC = register("seeds_garlic", new ModSeedItem(0xf0e5ad, 0xbb766e, ModBlocks.GARLICS, new Item.Settings(), 0.30f));
    public static final Item ONION = register("onion", new CompostableItem(new Item.Settings().food(ModFoodComponents.ONION), 0.65F));
    public static final Item SEEDS_ONION = register("seeds_onion", new ModSeedItem(0xffce3e, 0xbd6100, ModBlocks.ONIONS, new Item.Settings(), 0.30f));
    public static final Item SCALLION = register("scallion", new CompostableItem(new Item.Settings().food(ModFoodComponents.SCALLION), 0.65F));
    public static final Item CUCUMBER = register("cucumber", new CompostableItem(new Item.Settings().food(ModFoodComponents.CUCUMBER), 0.65F));
    public static final Item SEEDS_CUCUMBER = register("seeds_cucumber", new CompostableItem(new Item.Settings(), 0.30f));
    public static final Item CHILLI = register("chilli", new CompostableItem(new Item.Settings().food(ModFoodComponents.CHILLI), 0.65F));
    public static final Item SEEDS_CHILLI = register("seeds_chilli", new CompostableItem(new Item.Settings(), 0.30f));
    public static final Item TOMATO = register("tomato", new CompostableItem(new Item.Settings().food(ModFoodComponents.TOMATO), 0.65F));
    public static final Item SEEDS_TOMATO = register("seeds_tomato", new ModSeedItem(0xec3c17, 0xa2412d, ModBlocks.TOMATOES, new Item.Settings(), 0.30f));
    public static final Item FRIED_EGG = register("fried_egg", new ModItem(new Item.Settings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item PANCAKES = register("pancakes", new ModItem(new Item.Settings().food(ModFoodComponents.PANCAKES)));
    public static final Item CHEESE = register("cheese", new ModItem(new Item.Settings().food(ModFoodComponents.CHEESE)));
    public static final Item CHEESE_CROQUETTES = register("cheese_croquettes", new ModItem(new Item.Settings().food(ModFoodComponents.CHEESE_CROQUETTES)));
    public static final Item DONUT = register("donut", new ModItem(new Item.Settings().food(ModFoodComponents.DONUT)));
    // public static final Item DONUT_CHOCOLATE = register("donut_chocolate", new ModItem(new Item.Settings().food(ModFoodComponents.DONUT_CHOCOLATE)));
    public static final Item CARAMEL = register("caramel", new ModItem(new Item.Settings().food(ModFoodComponents.CARAMEL)));
    public static final Item CARAMEL_APPLE = register("caramel_apple", new ModItem(new Item.Settings().food(ModFoodComponents.CARAMEL_APPLE)));
    public static final Item CHOCOLATE = register("chocolate", new ModItem(new Item.Settings().food(ModFoodComponents.CHOCOLATE)));
    public static final Item ONION_SOUP = register("onion_soup", new ModItem(new Item.Settings().food(ModFoodComponents.ONION_SOUP)));
    public static final Item CHEESE_SOUP = register("cheese_soup", new ModItem(new Item.Settings().food(ModFoodComponents.CHEESE_SOUP)));
    public static final Item TOMATO_SOUP = register("tomato_soup", new ModItem(new Item.Settings().food(ModFoodComponents.TOMATO_SOUP)));
    public static final Item CARROT_SALAD = register("carrot_salad", new ModItem(new Item.Settings().food(ModFoodComponents.CARROT_SALAD)));
    //  [DRINKS]
    public static final Item JUICE_APPLE = register("juice_apple", new JuiceItem(0xffff00, new Item.Settings().food(ModFoodComponents.JUICE_APPLE)));
    public static final Item JUICE_PUMPKIN = register("juice_pumpkin", new JuiceItem(0xffc800, new Item.Settings().food(ModFoodComponents.JUICE_PUMPKIN)));
    public static final Item JUICE_CARROT = register("juice_carrot", new JuiceItem(0xff9b05, new Item.Settings().food(ModFoodComponents.JUICE_CARROT)));
    public static final Item JUICE_TOMATO = register("juice_tomato", new JuiceItem(0xdc4600, new Item.Settings().food(ModFoodComponents.JUICE_TOMATO)));
    public static final Item JUICE_MELON = register("juice_melon", new JuiceItem(0xff0000, new Item.Settings().food(ModFoodComponents.JUICE_MELON)));
    public static final Item JUICE_BERRIES = register("juice_berries", new JuiceItem(0xff009B, new Item.Settings().food(ModFoodComponents.JUICE_BERRIES)));
    //  [MISC]
    public static final Item MUSIC_DISC_AFTERNOON = register("music_disc_afternoon", new DiscItem(0, ModSoundEvents.SOUND_AFTERNOON, new Item.Settings()));



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

    private static Item register(String id, JuiceItem item) {
        JUICE_ITEMS.add(item);
        return register(id, (Item)item);
    }

    private static Item register(String id, ModSeedItem item) {
        SEED_ITEMS.add(item);
        return register(id, (Item)item);
    }
    
    private static Item register(Identifier id, Item item) {
       return (Item)Registry.register(Registry.ITEM, id, item);
    }

    public static void init() { }
}