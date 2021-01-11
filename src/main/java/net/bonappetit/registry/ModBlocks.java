package net.bonappetit.registry;

import net.bonappetit.BonAppetit;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block HALITE_ORE = register("halite_ore", new ModOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));
    public static final Block LIMESTONE = register("limestone", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.25f, 3).sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block LIMESTONE_STAIRS = register("limestone_stairs", new StairBlock(LIMESTONE.getDefaultState(), AbstractBlock.Settings.copy(LIMESTONE)));
    public static final Block LIMESTONE_SLAB = register("limestone_slab", new SlabBlock(AbstractBlock.Settings.copy(LIMESTONE)));
    public static final Block LIMESTONE_WALL = register("limestone_wall", new WallBlock(AbstractBlock.Settings.copy(LIMESTONE)));
    public static final Block LIMESTONE_POLISHED = register("limestone_polished", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.75f, 4f).sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block LIMESTONE_POLISHED_STAIRS = register("limestone_polished_stairs", new StairBlock(LIMESTONE_POLISHED.getDefaultState(), AbstractBlock.Settings.copy(LIMESTONE_POLISHED)));
    public static final Block LIMESTONE_POLISHED_SLAB = register("limestone_polished_slab", new SlabBlock(AbstractBlock.Settings.copy(LIMESTONE_POLISHED)));
    public static final Block QUARTZ_TILES = register("quartz_tiles", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(2f, 6f).sounds(BlockSoundGroup.STONE)));
    public static final Block SALT_BLOCK = register("salt_block", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(2f, 4f).sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block BUTTER_BLOCK = register("butter_block", new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES, 0).strength(0.25f, 0.25f).slipperiness(0.9f).sounds(BlockSoundGroup.HONEY)));
    public static final Block CHEESE_BLOCK = register("cheese_block", new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES, 0).strength(0.25f, 0.25f).sounds(BlockSoundGroup.HONEY)));

    private static Block register(String id, Block block) {
        Identifier identifier = new Identifier(BonAppetit.MOD_ID, id);
        return (Block)Registry.register(Registry.BLOCK, identifier, block);
    }

    public static void init() { }
}
