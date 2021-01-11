package net.bonappetit.registry;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;

public class CompostableItem extends Item {
    public CompostableItem(Settings settings, float chance) {
        super(settings);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(this, chance);
    }
}
