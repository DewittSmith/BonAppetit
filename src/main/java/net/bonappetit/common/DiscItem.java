package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Rarity;

public class DiscItem extends MusicDiscItem {
    public DiscItem(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings.maxCount(1).group(BonAppetit.ITEM_GROUP).rarity(Rarity.RARE));
    }
}
