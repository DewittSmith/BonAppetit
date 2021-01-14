package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.AliasedBlockItem;

public class ModSeedItem extends AliasedBlockItem {

    public ModSeedItem(Block block, Settings settings, float chance) {
        super(block, settings.group(BonAppetit.ITEM_GROUP));
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(this, chance);
    }
    
}
