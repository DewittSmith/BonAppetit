package net.bonappetit;

import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;

public class SimpleItem extends AbstractItem
{
    public Item Item;

    public SimpleItem(String name, Registry registry, Item.Settings itemSettings) 
    {
        super(name, registry);
        Item = new Item(itemSettings);
    }
}