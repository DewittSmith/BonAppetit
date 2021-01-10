package net.bonappetit.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;

public class JuiceItem extends Item {

    public JuiceItem(Settings settings) {
        super(settings);
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