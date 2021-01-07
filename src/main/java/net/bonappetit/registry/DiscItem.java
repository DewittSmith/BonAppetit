package net.bonappetit.registry;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class DiscItem extends MusicDiscItem {
    protected DiscItem(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings);
    }
}
