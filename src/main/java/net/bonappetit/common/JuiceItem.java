package net.bonappetit.common;

import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class JuiceItem extends ModItem {

    private int color;

    public JuiceItem(int color, Settings settings) {
        super(settings);
        this.color = color;
    }

    @Environment(EnvType.CLIENT)
    public void applyColor() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            if (tintIndex == 0) return color;
            else return 16777215;
        }, this);
    }
    
    public int getMaxUseTime(ItemStack stack) {
        return 28;
    }
  
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ITEM_BOTTLE_EMPTY;
    }
}