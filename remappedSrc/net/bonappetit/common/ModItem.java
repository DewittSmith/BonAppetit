package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.minecraft.item.Item;

public class ModItem extends Item {

    public ModItem(Settings settings) {
        super(settings.group(BonAppetit.ITEM_GROUP));
    }
    
}
