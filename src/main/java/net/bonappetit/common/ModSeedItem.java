package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.AliasedBlockItem;

public class ModSeedItem extends AliasedBlockItem {

    private int color1;
    private int color2;

    public ModSeedItem(int color1, int color2, Block block, Settings settings, float chance) {
        super(block, settings.group(BonAppetit.ITEM_GROUP));
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(this, chance);

        this.color1 = color1;
        this.color2 = color2;
    }

    @Environment(EnvType.CLIENT)
    public void applyColor() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            if (tintIndex == 0) return color1;
            else return color2;
        }, this);
    }
    
}
