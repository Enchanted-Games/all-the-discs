package net.allthediscs.registry;

import net.allthediscs.AllTheDiscs;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    
    public static final Block DISC_CONTAINER = new Block(FabricBlockSettings
        .of(Material.WOOD)
        .breakByHand(true)
        .breakByTool(FabricToolTags.AXES)
        .strength(0.5f, 0.5f)
        .sounds(BlockSoundGroup.WOOD)
    );
    public static final Block DISC_CONTAINER_VOLUME_ALPHA = new Block(FabricBlockSettings
        .of(Material.WOOD)
        .breakByHand(true)
        .breakByTool(FabricToolTags.AXES)
        .strength(0.5f, 0.5f)
        .sounds(BlockSoundGroup.WOOD)
    );
    public static final Block DISC_CONTAINER_VOLUME_BETA = new Block(FabricBlockSettings
        .of(Material.WOOD)
        .breakByHand(true)
        .breakByTool(FabricToolTags.AXES)
        .strength(0.5f, 0.5f)
        .sounds(BlockSoundGroup.WOOD)
    );
    public static final Block DISC_CONTAINER_UPDATE_AQUATIC = new Block(FabricBlockSettings
        .of(Material.WOOD)
        .breakByHand(true)
        .breakByTool(FabricToolTags.AXES)
        .strength(0.5f, 0.5f)
        .sounds(BlockSoundGroup.WOOD)
    );

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(AllTheDiscs.MOD_ID, "disc_container"), DISC_CONTAINER);
        Registry.register(Registry.BLOCK, new Identifier(AllTheDiscs.MOD_ID, "disc_container_volume_alpha"), DISC_CONTAINER_VOLUME_ALPHA);
        Registry.register(Registry.BLOCK, new Identifier(AllTheDiscs.MOD_ID, "disc_container_volume_beta"), DISC_CONTAINER_VOLUME_BETA);
        Registry.register(Registry.BLOCK, new Identifier(AllTheDiscs.MOD_ID, "disc_container_update_aquatic"), DISC_CONTAINER_UPDATE_AQUATIC);
    }

}
