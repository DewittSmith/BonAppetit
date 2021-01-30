package net.bonappetit;

import net.bonappetit.common.JuiceItem;
import net.bonappetit.common.ModCropBlock;
import net.bonappetit.common.ModSeedItem;
import net.bonappetit.registry.ModBlocks;
import net.bonappetit.registry.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BonAppetitClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        for(JuiceItem juice : ModItems.JUICE_ITEMS) juice.applyColor();
        for(ModSeedItem seed : ModItems.SEED_ITEMS) seed.applyColor();
        for(ModCropBlock crop : ModBlocks.CROPS) BlockRenderLayerMap.INSTANCE.putBlock(crop, RenderLayer.getCutout());
    }
    
}
