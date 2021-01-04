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
        Blocks.put("HALITE_ORE", new SimpleBlock("halite_ore", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));
        Blocks.put("LIMESTONE", new SimpleBlock("limestone", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 5.0f).sounds(BlockSoundGroup.NETHERRACK)));
        Blocks.put("LIMESTONE_POLISHED", new SimpleBlock("limestone_polished", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.NETHERRACK)));
        Blocks.put("QUARTZ_TILES", new SimpleBlock("quartz_tiles", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(0.8f, 0.8f).sounds(BlockSoundGroup.STONE)));
        Blocks.put("SALT_BLOCK", new SimpleBlock("salt_block", Registry.BLOCK, FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.5f, 1.5f).sounds(BlockSoundGroup.NETHERRACK)));
        Blocks.put("BUTTER_BLOCK", new SimpleBlock("butter_block", Registry.BLOCK, FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES, 0).strength(0.25f, 0.25f).sounds(BlockSoundGroup.HONEY).slipperiness(0.75f)));
        Blocks.put("CHEESE_BLOCK", new SimpleBlock("cheese_block", Registry.BLOCK, FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES, 0).strength(0.25f, 0.25f).sounds(BlockSoundGroup.HONEY)));
    }
    
    public static void registerBlocks()
    {
        for (SimpleBlock block : Blocks.values())
        {
            Registry.register(block.Registry, block.Identifier, block.Block);
        }
    }
}
