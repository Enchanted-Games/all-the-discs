package games.enchanted.allthediscs.registry;

import games.enchanted.allthediscs.AllTheDiscs;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTables {

    private static final Identifier VOLUME_ALPHA_1_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/volume_alpha_1_every_time");
    private static final Identifier VOLUME_ALPHA_RANDOM_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/volume_alpha_random_every_time");

    private static final Identifier VOLUME_BETA_1_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/volume_beta_1_every_time");
    private static final Identifier VOLUME_BETA_RANDOM_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/volume_beta_random_every_time");
    private static final Identifier VOLUME_BETA_RANDOM_RARE = new Identifier(AllTheDiscs.MOD_ID, "chests/volume_beta_random_rare");

    private static final Identifier UPDATE_AQUATIC_1_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/update_aquatic_1_every_time");
    private static final Identifier UPDATE_AQUATIC_RANDOM_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/update_aquatic_random_every_time");
    
    private static final Identifier ALL_DISCS_1_EVERY_TIME = new Identifier(AllTheDiscs.MOD_ID, "chests/all_discs_1_every_time");

    
    private static final Identifier MINESHAFT_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier VILLAGE_CARTOGRAPHER_ID = new Identifier("minecraft", "chests/village/village_cartographer");
    private static final Identifier VILLAGE_FLETCHER_ID = new Identifier("minecraft", "chests/village/village_fletcher");
    private static final Identifier VILLAGE_MASON_ID = new Identifier("minecraft", "chests/village/village_mason");
    private static final Identifier VILLAGE_PLAINS_HOUSE_ID = new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_ID = new Identifier("minecraft", "chests/village/village_savanna_house");
    private static final Identifier VILLAGE_SHEPHERD_ID = new Identifier("minecraft", "chests/village/village_shepherd");
    private static final Identifier VILLAGE_SNOWY_HOUSE_ID = new Identifier("minecraft", "chests/village/village_snowy_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE_ID = new Identifier("minecraft", "chests/village/village_taiga_house");
    private static final Identifier VILLAGE_TOOLSMITH_ID = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGE_FISHER_ID = new Identifier("minecraft", "chests/village/village_fisher");
    private static final Identifier DESERT_PYRAMID_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier JUNGLE_TEMPLE_ID = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier SIMPLE_DUNGEON_ID = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier SHIPWRECK_SUPPLY_ID = new Identifier("minecraft", "chests/shipwreck_supply");

    
    private static final Identifier DISC_CONTAINER_ID = new Identifier(AllTheDiscs.MOD_ID, "blocks/disc_container");
    private static final Identifier DISC_CONTAINER_ALPHA_ID = new Identifier(AllTheDiscs.MOD_ID, "blocks/disc_container_volume_alpha");
    private static final Identifier DISC_CONTAINER_BETA_ID = new Identifier(AllTheDiscs.MOD_ID, "blocks/disc_container_volume_beta");
    private static final Identifier DISC_CONTAINER_AQUATIC_ID = new Identifier(AllTheDiscs.MOD_ID, "blocks/disc_container_update_aquatic");


    public static void modifyLootTables(){
        LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, supplier, setter) -> {

            // add disc loot tables into disc container loot tables
            if(DISC_CONTAINER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_1_EVERY_TIME))
                    .with(LootTableEntry.builder(VOLUME_BETA_1_EVERY_TIME))
                    .with(LootTableEntry.builder(UPDATE_AQUATIC_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }
            
            if(DISC_CONTAINER_ALPHA_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(DISC_CONTAINER_BETA_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(DISC_CONTAINER_AQUATIC_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(UPDATE_AQUATIC_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }


            // add discs to vanilla chest loot tables
            if(MINESHAFT_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            // armourer villager chest
            if(VILLAGE_CARTOGRAPHER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }
            
            if(VILLAGE_FLETCHER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_RANDOM_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_MASON_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_RANDOM_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_PLAINS_HOUSE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_RANDOM_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_SAVANNA_HOUSE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(UPDATE_AQUATIC_RANDOM_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_SHEPHERD_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_SNOWY_HOUSE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_RANDOM_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_TAIGA_HOUSE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_RANDOM_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_TOOLSMITH_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(VILLAGE_FISHER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(UPDATE_AQUATIC_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(JUNGLE_TEMPLE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_ALPHA_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(DESERT_PYRAMID_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(VOLUME_BETA_RANDOM_RARE));
                supplier.withPool(poolBuilder.build());
            }

            if(SIMPLE_DUNGEON_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(ALL_DISCS_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

            if(SHIPWRECK_SUPPLY_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    // loot table to be added onto vanilla one
                    .with(LootTableEntry.builder(UPDATE_AQUATIC_1_EVERY_TIME));
                supplier.withPool(poolBuilder.build());
            }

        }));
    }
}
