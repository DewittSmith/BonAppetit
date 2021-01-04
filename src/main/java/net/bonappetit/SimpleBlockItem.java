package net.bonappetit;

import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class SimpleBlockItem extends AbstractItem
{
    public BlockItem BlockItem;

    public SimpleBlockItem(String name, Registry registry, Block block, Item.Settings itemSettings) 
    {
        super(name, registry);
        BlockItem = new BlockItem(block, itemSettings);
    }
}