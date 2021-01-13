package net.bonappetit.common;

import net.minecraft.block.CropBlock;

public class ModCropBlock extends CropBlock {
    public ModCropBlock(Settings settings) {
        super(settings.nonOpaque());
    }
}
