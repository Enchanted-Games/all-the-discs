package games.enchanted.allthediscs.registry;

import games.enchanted.allthediscs.AllTheDiscs;
import games.enchanted.allthediscs.registry.types.BlockItemWithDesc;
import games.enchanted.allthediscs.registry.types.CustomDiscItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Rarity;


public class ModItems {

    // block items
    public static final BlockItem DISC_CONTAINER = new BlockItemWithDesc(ModBlocks.DISC_CONTAINER, new Item.Settings().group(AllTheDiscs.TAB_EXTRAS).rarity(Rarity.RARE), "disc_container");
    public static final BlockItem DISC_CONTAINER_VOLUME_ALPHA = new BlockItemWithDesc(ModBlocks.DISC_CONTAINER_VOLUME_ALPHA, new Item.Settings().group(AllTheDiscs.TAB_EXTRAS).rarity(Rarity.RARE), "disc_container_volume_alpha");
    public static final BlockItem DISC_CONTAINER_VOLUME_BETA = new BlockItemWithDesc(ModBlocks.DISC_CONTAINER_VOLUME_BETA, new Item.Settings().group(AllTheDiscs.TAB_EXTRAS).rarity(Rarity.RARE), "disc_container_volume_beta");
    public static final BlockItem DISC_CONTAINER_UPDATE_AQUATIC = new BlockItemWithDesc(ModBlocks.DISC_CONTAINER_UPDATE_AQUATIC, new Item.Settings().group(AllTheDiscs.TAB_EXTRAS).rarity(Rarity.RARE), "disc_container_update_aquatic");
    public static final BlockItem DISC_CONTAINER_CAVES_AND_CLIFFS = new BlockItemWithDesc(ModBlocks.DISC_CONTAINER_CAVES_AND_CLIFFS, new Item.Settings().group(AllTheDiscs.TAB_EXTRAS).rarity(Rarity.RARE), "disc_container_caves_and_cliffs");



    public static final Item MUSIC_DISC_VOLUME_ALPHA = registerDiscCmdsOnly("music_disc_volume_alpha", ModSounds.MODSOUND_MUSIC_DISC_SECRET);
    public static final Item MUSIC_DISC_VOLUME_BETA = registerDiscCmdsOnly("music_disc_volume_beta", ModSounds.MODSOUND_MUSIC_DISC_SECRET);
    public static final Item MUSIC_DISC_UPDATE_AQUATIC = registerDiscCmdsOnly("music_disc_update_aquatic", ModSounds.MODSOUND_MUSIC_DISC_SECRET);
    public static final Item MUSIC_DISC_CAVES_AND_CLIFFS = registerDiscCmdsOnly("music_disc_caves_and_cliffs", ModSounds.MODSOUND_MUSIC_DISC_SECRET);
    public static final Item MUSIC_DISC_EXTRAS = registerDiscCmdsOnly("music_disc_extras", ModSounds.MODSOUND_MUSIC_DISC_SECRET);

    // discs volume alpha
    public static final Item MUSIC_DISC_KEY = registerDiscVolAlpha("music_disc_key", ModSounds.MODSOUND_MUSIC_DISC_KEY);
    public static final Item MUSIC_DISC_DOOR = registerDiscVolAlpha("music_disc_door", ModSounds.MODSOUND_MUSIC_DISC_DOOR);
    public static final Item MUSIC_DISC_SUBWOOFER_LULLABY = registerDiscVolAlpha("music_disc_subwoofer_lullaby", ModSounds.MODSOUND_MUSIC_DISC_SUBWOOFER_LULLABY);
    public static final Item MUSIC_DISC_DEATH = registerDiscVolAlpha("music_disc_death", ModSounds.MODSOUND_MUSIC_DISC_DEATH);
    public static final Item MUSIC_DISC_LIVING_MICE = registerDiscVolAlpha("music_disc_living_mice", ModSounds.MODSOUND_MUSIC_DISC_LIVING_MICE);
    public static final Item MUSIC_DISC_MOOG_CITY = registerDiscVolAlpha("music_disc_moog_city", ModSounds.MODSOUND_MUSIC_DISC_MOOG_CITY);
    public static final Item MUSIC_DISC_HAGGSTROM = registerDiscVolAlpha("music_disc_haggstrom", ModSounds.MODSOUND_MUSIC_DISC_HAGGSTROM);
    public static final Item MUSIC_DISC_MINECRAFT = registerDiscVolAlpha("music_disc_minecraft", ModSounds.MODSOUND_MUSIC_DISC_MINECRAFT);
    public static final Item MUSIC_DISC_OXYGENE = registerDiscVolAlpha("music_disc_oxygene", ModSounds.MODSOUND_MUSIC_DISC_OXYGENE);
    public static final Item MUSIC_DISC_EQUINOXE = registerDiscVolAlpha("music_disc_equinoxe", ModSounds.MODSOUND_MUSIC_DISC_EQUINOXE);
    public static final Item MUSIC_DISC_MICE_ON_VENUS = registerDiscVolAlpha("music_disc_mice_on_venus", ModSounds.MODSOUND_MUSIC_DISC_MICE_ON_VENUS);
    public static final Item MUSIC_DISC_MICE_DRY_HANDS = registerDiscVolAlpha("music_disc_dry_hands", ModSounds.MODSOUND_MUSIC_DISC_DRY_HANDS);
    public static final Item MUSIC_DISC_MICE_WET_HANDS = registerDiscVolAlpha("music_disc_wet_hands", ModSounds.MODSOUND_MUSIC_DISC_WET_HANDS);
    public static final Item MUSIC_DISC_CLARK = registerDiscVolAlpha("music_disc_clark", ModSounds.MODSOUND_MUSIC_DISC_CLARK);
    public static final Item MUSIC_DISC_CHRIS = registerDiscVolAlpha("music_disc_chris", ModSounds.MODSOUND_MUSIC_DISC_CHRIS);
    public static final Item MUSIC_DISC_THIRTEEN = registerDiscVolAlpha("music_disc_thirteen", ModSounds.MODSOUND_MUSIC_DISC_THIRTEEN);
    public static final Item MUSIC_DISC_EXCUSE = registerDiscVolAlpha("music_disc_excuse", ModSounds.MODSOUND_MUSIC_DISC_EXCUSE);
    public static final Item MUSIC_DISC_SWEDEN = registerDiscVolAlpha("music_disc_sweden", ModSounds.MODSOUND_MUSIC_DISC_SWEDEN);
    public static final Item MUSIC_DISC_CAT = registerDiscVolAlpha("music_disc_cat", ModSounds.MODSOUND_MUSIC_DISC_CAT);
    public static final Item MUSIC_DISC_DOG = registerDiscVolAlpha("music_disc_dog", ModSounds.MODSOUND_MUSIC_DISC_DOG);
    public static final Item MUSIC_DISC_DANNY = registerDiscVolAlpha("music_disc_danny", ModSounds.MODSOUND_MUSIC_DISC_DANNY);
    public static final Item MUSIC_DISC_BEGINNING = registerDiscVolAlpha("music_disc_beginning", ModSounds.MODSOUND_MUSIC_DISC_BEGINNING);
    public static final Item MUSIC_DISC_DROOPY1 = registerDiscVolAlpha("music_disc_droopy_likes_ricochet", ModSounds.MODSOUND_MUSIC_DISC_DROOPY1);
    public static final Item MUSIC_DISC_DROOPY2 = registerDiscVolAlpha("music_disc_droopy_likes_your_face", ModSounds.MODSOUND_MUSIC_DISC_DROOPY2);

    // discs volume beta
    public static final Item MUSIC_DISC_KI = registerDiscVolBeta("music_disc_ki", ModSounds.MODSOUND_MUSIC_DISC_KI);
    public static final Item MUSIC_DISC_ALPHA = registerDiscVolBeta("music_disc_alpha", ModSounds.MODSOUND_MUSIC_DISC_ALPHA);
    public static final Item MUSIC_DISC_DEAD_VOXEL = registerDiscVolBeta("music_disc_dead_voxel", ModSounds.MODSOUND_MUSIC_DISC_DEAD_VOXEL);
    public static final Item MUSIC_DISC_BLIND_SPOTS = registerDiscVolBeta("music_disc_blind_spots", ModSounds.MODSOUND_MUSIC_DISC_BLIND_SPOTS);
    public static final Item MUSIC_DISC_FLAKE = registerDiscVolBeta("music_disc_flake", ModSounds.MODSOUND_MUSIC_DISC_FLAKE);
    public static final Item MUSIC_DISC_MOOG_CITY_2 = registerDiscVolBeta("music_disc_moog_city_2", ModSounds.MODSOUND_MUSIC_DISC_MOOG_CITY_2);
    public static final Item MUSIC_DISC_CONCRETE_HALLS = registerDiscVolBeta("music_disc_concrete_halls", ModSounds.MODSOUND_MUSIC_DISC_CONCRETE_HALLS);
    public static final Item MUSIC_DISC_BIOME_FEST = registerDiscVolBeta("music_disc_biome_fest", ModSounds.MODSOUND_MUSIC_DISC_BIOME_FEST);
    public static final Item MUSIC_DISC_MUTATION = registerDiscVolBeta("music_disc_mutation", ModSounds.MODSOUND_MUSIC_DISC_MUTATION);
    public static final Item MUSIC_DISC_HAUNT_MUSKIE = registerDiscVolBeta("music_disc_haunt_muskie", ModSounds.MODSOUND_MUSIC_DISC_HAUNT_MUSKIE);
    public static final Item MUSIC_DISC_WARMTH = registerDiscVolBeta("music_disc_warmth", ModSounds.MODSOUND_MUSIC_DISC_WARMTH);
    public static final Item MUSIC_DISC_FLOATING_TREES = registerDiscVolBeta("music_disc_floating_trees", ModSounds.MODSOUND_MUSIC_DISC_FLOATING_TREES);
    public static final Item MUSIC_DISC_ARIA_MATH = registerDiscVolBeta("music_disc_aria_math", ModSounds.MODSOUND_MUSIC_DISC_ARIA_MATH);
    public static final Item MUSIC_DISC_KYOTO = registerDiscVolBeta("music_disc_kyoto", ModSounds.MODSOUND_MUSIC_DISC_KYOTO);
    public static final Item MUSIC_DISC_BALLAD_OF_THE_CATS = registerDiscVolBeta("music_disc_ballad_of_the_cats", ModSounds.MODSOUND_MUSIC_DISC_BALLAD_OF_THE_CATS);
    public static final Item MUSIC_DISC_TASWELL = registerDiscVolBeta("music_disc_taswell", ModSounds.MODSOUND_MUSIC_DISC_TASWELL);
    public static final Item MUSIC_DISC_BEGINNING_2 = registerDiscVolBeta("music_disc_beginning_2", ModSounds.MODSOUND_MUSIC_DISC_BEGINNING_2);
    public static final Item MUSIC_DISC_DREITON = registerDiscVolBeta("music_disc_dreiton", ModSounds.MODSOUND_MUSIC_DISC_DREITON);
    public static final Item MUSIC_DISC_THE_END = registerDiscVolBeta("music_disc_the_end", ModSounds.MODSOUND_MUSIC_DISC_THE_END);
    public static final Item MUSIC_DISC_CHIRP = registerDiscVolBeta("music_disc_chirp", ModSounds.MODSOUND_MUSIC_DISC_CHIRP);
    public static final Item MUSIC_DISC_WAIT = registerDiscVolBeta("music_disc_wait", ModSounds.MODSOUND_MUSIC_DISC_WAIT);
    public static final Item MUSIC_DISC_MELLOHI = registerDiscVolBeta("music_disc_mellohi", ModSounds.MODSOUND_MUSIC_DISC_MELLOHI);
    public static final Item MUSIC_DISC_STAL = registerDiscVolBeta("music_disc_stal", ModSounds.MODSOUND_MUSIC_DISC_STAL);
    public static final Item MUSIC_DISC_STRAD = registerDiscVolBeta("music_disc_strad", ModSounds.MODSOUND_MUSIC_DISC_STRAD);
    public static final Item MUSIC_DISC_ELEVEN = registerDiscVolBeta("music_disc_eleven", ModSounds.MODSOUND_MUSIC_DISC_ELEVEN);
    public static final Item MUSIC_DISC_WARD = registerDiscVolBeta("music_disc_ward", ModSounds.MODSOUND_MUSIC_DISC_WARD);
    public static final Item MUSIC_DISC_MALL = registerDiscVolBeta("music_disc_mall", ModSounds.MODSOUND_MUSIC_DISC_MALL);
    public static final Item MUSIC_DISC_BLOCKS = registerDiscVolBeta("music_disc_blocks", ModSounds.MODSOUND_MUSIC_DISC_BLOCKS);
    public static final Item MUSIC_DISC_FAR = registerDiscVolBeta("music_disc_far", ModSounds.MODSOUND_MUSIC_DISC_FAR);
    public static final Item MUSIC_DISC_INTRO = registerDiscVolBeta("music_disc_intro", ModSounds.MODSOUND_MUSIC_DISC_INTRO);

    // update aquatic
    public static final Item MUSIC_DISC_AXOLOTL = registerDiscUpdateAquatic("music_disc_axolotl", ModSounds.MODSOUND_MUSIC_DISC_AXOLOTL);
    public static final Item MUSIC_DISC_DRAGONFISH = registerDiscUpdateAquatic("music_disc_dragonfish", ModSounds.MODSOUND_MUSIC_DISC_DRAGONFISH);
    public static final Item MUSIC_DISC_SHUNJI = registerDiscUpdateAquatic("music_disc_shunji", ModSounds.MODSOUND_MUSIC_DISC_SHUNJI);

    // caves and cliffs
    public static final Item MUSIC_DISC_STAND_TALL = registerDiscCavesAndCliffs("music_disc_stand_tall", ModSounds.MODSOUND_MUSIC_DISC_STAND_TALL);
    public static final Item MUSIC_DISC_LEFT_TO_BLOOM = registerDiscCavesAndCliffs("music_disc_left_to_bloom", ModSounds.MODSOUND_MUSIC_DISC_LEFT_TO_BLOOM);

    // you found unused stuff amazing!
    // public static final Item MUSIC_DISC_TASWELL_PITCHED = registerDiscExtras("music_disc_taswell_pitched", ModSounds.MODSOUND_MUSIC_DISC_TASWELL_PITCHED);
    // public static final Item MUSIC_DISC_WARD_PITCHED = registerDiscExtras("music_disc_ward_pitched", ModSounds.MODSOUND_MUSIC_DISC_WARD_PITCHED);
    // public static final Item MUSIC_DISC_MALL_PITCHED = registerDiscExtras("music_disc_mall_pitched", ModSounds.MODSOUND_MUSIC_DISC_MALL_PITCHED);

    public static Item registerDiscVolAlpha(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(AllTheDiscs.TAB_VOLUME_ALPHA);
        return Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, id), new CustomDiscItem(10, sound, settings));
    }
    public static Item registerDiscVolBeta(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(AllTheDiscs.TAB_VOLUME_BETA);
        return Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, id), new CustomDiscItem(12, sound, settings));
    }
    public static Item registerDiscExtras(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(AllTheDiscs.TAB_EXTRAS);
        return Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, id), new CustomDiscItem(12, sound, settings));
    }
    public static Item registerDiscUpdateAquatic(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(AllTheDiscs.TAB_UPDATE_AQUATIC);
        return Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, id), new CustomDiscItem(12, sound, settings));
    }
    public static Item registerDiscCmdsOnly(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.EPIC).maxCount(1);
        return Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, id), new CustomDiscItem(0, sound, settings));
    }
    
    public static Item registerDiscCavesAndCliffs(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(AllTheDiscs.TAB_CAVES_AND_CLIFFS);
        return Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, id), new CustomDiscItem(15, sound, settings));
    }

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, "disc_container"), DISC_CONTAINER);
        Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, "disc_container_volume_alpha"), DISC_CONTAINER_VOLUME_ALPHA);
        Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, "disc_container_volume_beta"), DISC_CONTAINER_VOLUME_BETA);
        Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, "disc_container_update_aquatic"), DISC_CONTAINER_UPDATE_AQUATIC);
        Registry.register(Registry.ITEM, new Identifier(AllTheDiscs.MOD_ID, "disc_container_caves_and_cliffs"), DISC_CONTAINER_CAVES_AND_CLIFFS);
    }
}
