package net.bonappetit;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;

public class SimpleBlock extends AbstractItem
{
    public Block Block;
    public SimpleBlock(String name, Registry registry, FabricBlockSettings blockSettings) {
        super(name, registry);
        Block = new Block(blockSettings);
    }
}