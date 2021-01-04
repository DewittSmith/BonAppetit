package net.bonappetit.registry;

import java.util.HashMap;
import java.util.Map;

import net.bonappetit.SimpleBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class ModBlocks 
{
    public static Map<String, SimpleBlock> Blocks;
    static {
        Blocks = new HashMap<>();
        Blocks.put("LIMESTONE", new SimpleBlock("limestone", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)));
    }
    
    public static void registerBlocks()
    {
        for (SimpleBlock block : Blocks.values())
        {
            Registry.register(block.Registry, block.Identifier, block.Block);
        }
    }
}
