package net.allthediscs;

import net.allthediscs.registry.ModBlocks;
import net.allthediscs.registry.ModItems;
import net.allthediscs.registry.ModLootTables;
import net.allthediscs.registry.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AllTheDiscs implements ModInitializer{

    public static final String MOD_ID = "allthediscs";

    //CREATIVE TABS
    public static final ItemGroup TAB_VOLUME_ALPHA = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "tab_volume_alpha"),
        () -> new ItemStack(ModItems.MUSIC_DISC_VOLUME_ALPHA)
    );
    public static final ItemGroup TAB_VOLUME_BETA = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "tab_volume_beta"),
        () -> new ItemStack(ModItems.MUSIC_DISC_VOLUME_BETA)
    );
    public static final ItemGroup TAB_UPDATE_AQUATIC = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "tab_update_aquatic"),
        () -> new ItemStack(ModItems.MUSIC_DISC_UPDATE_AQUATIC)
    );
    public static final ItemGroup TAB_EXTRAS = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "tab_extras"),
        () -> new ItemStack(ModItems.DISC_CONTAINER)
    );


    @Override
    public void onInitialize() {
        ModSounds.registerSounds();
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModLootTables.modifyLootTables();
    }
}