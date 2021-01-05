package net.bonappetit.registry;

import net.bonappetit.SimpleBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class ModBlocks 
{
    public static SimpleBlock[] Blocks = new SimpleBlock[]
    {
        new SimpleBlock("halite_ore", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.NETHER_GOLD_ORE)),
        new SimpleBlock("limestone", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("limestone_stairs", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("limestone_wall", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("limestone_slab", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("limestone_polished", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("limestone_polished_stairs", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("limestone_polished_slab", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("quartz_tiles", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(0.8f, 0.8f).sounds(BlockSoundGroup.STONE)),
        new SimpleBlock("salt_block", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.5f, 1.5f).sounds(BlockSoundGroup.NETHERRACK)),
        new SimpleBlock("butter_block", Registry.BLOCK, FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES, 0).strength(0.25f, 0.25f).sounds(BlockSoundGroup.HONEY).slipperiness(0.75f)),
        new SimpleBlock("cheese_block", Registry.BLOCK, FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES, 0).strength(0.25f, 0.25f).sounds(BlockSoundGroup.HONEY)),
    };

    public static Block GetBlock(String name)
    {
        for (SimpleBlock block : Blocks)
        {
            if (block.Name == name)
                return block.Block;
        }

        return null;
    }
    
    public static void registerBlocks()
    {
        for (SimpleBlock block : Blocks) Registry.register(block.Registry, block.Identifier, block.Block);
    }
}
