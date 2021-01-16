package net.bonappetit.registry;

import net.bonappetit.common.ModCropBlock;

public class ModSeeds {
    
    public static void init() {
        ((ModCropBlock)ModBlocks.ONIONS).setSeedsItem(ModItems.SEEDS_ONION);
    }
}
