package net.bonappetit;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class AbstractItem
{
    public String Name;
    public Registry Registry;
    public Identifier Identifier;

    public AbstractItem(String name, Registry registry)
    {
        Name = name;
        Registry = registry;

        Identifier = new Identifier(BonAppetit.MOD_ID, Name);
    }
}