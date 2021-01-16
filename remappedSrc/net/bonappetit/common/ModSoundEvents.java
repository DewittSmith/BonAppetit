package net.bonappetit.common;

import net.bonappetit.BonAppetit;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {
    public static final SoundEvent SOUND_AFTERNOON = register("music_disc_afternoon");

    public static SoundEvent register(String id) {
        Identifier identifier = new Identifier(BonAppetit.MOD_ID, id);
        return Registry.register(Registry.SOUND_EVENT, identifier, new SoundEvent(identifier));
    }
}
