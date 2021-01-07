package net.bonappetit;

import net.bonappetit.registry.ModBlocks;
import net.bonappetit.registry.ModItems;
import net.bonappetit.registry.ModOres;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BonAppetit implements ModInitializer
{
    public static final String MOD_ID = "bonappetit";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID,"general"), () -> new ItemStack(ModItems.GetItem("cooking_mortar_and_pestle")));

    @Override
    public void onInitialize() 
    {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModOres.registerOres();
    }
}

