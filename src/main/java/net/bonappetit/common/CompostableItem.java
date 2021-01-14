package net.bonappetit.common;

import net.minecraft.block.ComposterBlock;

public class CompostableItem extends ModItem {
    public CompostableItem(Settings settings, float chance) {
        super(settings);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(this, chance);
    }
}
