package net.bonappetit.registry;

import net.bonappetit.common.ModCropBlock;

public class ModSeeds {
    
    public static void init() {
        ((ModCropBlock)ModBlocks.GARLICS).setSeedsItem(ModItems.SEEDS_GARLIC);
        ((ModCropBlock)ModBlocks.ONIONS).setSeedsItem(ModItems.SEEDS_ONION);
        ((ModCropBlock)ModBlocks.TOMATOES).setSeedsItem(ModItems.SEEDS_TOMATO);
    }
}
