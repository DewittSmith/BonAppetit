package net.bonappetit.common;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.CropBlock;
import net.minecraft.client.render.RenderLayer;

public class ModCropBlock extends CropBlock {
    public ModCropBlock(Settings settings) {
        super(settings.nonOpaque());
        BlockRenderLayerMap.INSTANCE.putBlock(this, RenderLayer.getCutout());
    }
}
