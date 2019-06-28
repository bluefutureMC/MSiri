package com.command.il.siri;

import java.util.HashMap;

import org.bukkit.Material;

public class IDDictionary {
	
	private HashMap<String[], String> enumNameMap;
	
	public IDDictionary() {
		enumNameMap = new HashMap<>();
		
		// Mineral Blocks
		
		String[] diamondBlock = {"block of diamond", "diamond block", "blocks of diamond", "diamond blocks"};
		String[] emeraldBlock = {"block of emerald", "emerald block", "blocks of emerald", "emerald blocks"};
		String[] goldBlock = {"block of gold", "gold block", "blocks of gold", "gold blocks"};
		String[] ironBlock = {"block of iron", "iron block", "blocks of iron", "iron blocks"};
		String[] coalBlock = {"block of coal", "coal block", "blocks of coal", "coal blocks"};
		String[] lapisBlock = {"block of lapis", "lapis block", "blocks of lapis", "lapis blocks", "block of lapis lazuli", "lapis lazuli block", "blocks of lapis lazuli", "lapis lazuli blocks"};
		String[] redstoneBlock = {"block of redstone", "redstone block", "blocks of redstone", "redstone blocks", "block of red stone", "red stone block", "blocks of red stone", "red stone blocks"};
		String[] quartzBlock = {"block of quartz", "quartz block", "blocks of quartz", "quartz blocks"};
		
		enumNameMap.put(diamondBlock, "diamond_block");
		enumNameMap.put(emeraldBlock, "emerald_block");
		enumNameMap.put(goldBlock, "gold_block");
		enumNameMap.put(ironBlock, "iron_block");
		enumNameMap.put(coalBlock, "coal_block");
		enumNameMap.put(lapisBlock, "lapis_block");
		enumNameMap.put(redstoneBlock, "redstone_block");
		enumNameMap.put(quartzBlock, "quartz_block");
		
		// Tools
		
		String[] woodAxe = {"wooden axe", "wood axe"};
		String[] stoneAxe = {"stone axe"};
		String[] ironAxe = {"iron axe"};
		String[] goldAxe = {"golden axe", "gold axe"};
		String[] diamondAxe = {"diamond axe"};
		String[] woodPickaxe = {"wooden pickaxe", "wood pickaxe"};
		String[] stonePickaxe = {"stone pickaxe"};
		String[] ironPickaxe = {"iron pickaxe"};
		String[] goldPickaxe = {"golden pickaxe", "gold pickaxe"};
		String[] diamondPickaxe = {"diamond pickaxe"};
		String[] woodShovel = {"wooden shovel", "wood shovel"};
		String[] stoneShovel = {"stone shovel"};
		String[] ironShovel = {"iron shovel"};
		String[] goldShovel = {"golden shovel", "gold shovel"};
		String[] diamondShovel = {"diamond shovel"};
		String[] woodSword = {"wooden sword", "wood sword"};
		String[] stoneSword = {"stone sword"};
		String[] ironSword = {"iron sword"};
		String[] goldSword = {"golden sword", "gold sword"};
		String[] diamondSword = {"diamond sword"};
		String[] woodHoe = {"wooden hoe", "wood hoe"};
		String[] stoneHoe = {"stone hoe"};
		String[] ironHoe = {"iron hoe"};
		String[] goldHoe = {"golden hoe", "gold hoe"};
		String[] diamondHoe = {"diamond hoe"};
		String[] flintAndSteel = {"flint and steel", "lighter"};
		String[] fishingRod = {"fishing rod"};
		String[] carrotOnAStick = {"carrot on a stick"};
		String[] totemOfUndying = {"totem"};
		String[] debugStick = {"debug stick"};
		
		enumNameMap.put(woodAxe, "wooden_axe");
		enumNameMap.put(stoneAxe, "stone_axe");
		enumNameMap.put(ironAxe, "iron_axe");
		enumNameMap.put(goldAxe, "golden_axe");
		enumNameMap.put(diamondAxe, "diamond_axe");
		enumNameMap.put(woodPickaxe, "wooden_pickaxe");
		enumNameMap.put(stonePickaxe, "stone_pickaxe");
		enumNameMap.put(ironPickaxe, "iron_pickaxe");
		enumNameMap.put(goldPickaxe, "golden_pickaxe");
		enumNameMap.put(diamondPickaxe, "diamond_pickaxe");
		enumNameMap.put(woodShovel, "wooden_shovel");
		enumNameMap.put(stoneShovel, "stone_shovel");
		enumNameMap.put(ironShovel, "iron_shovel");
		enumNameMap.put(goldShovel, "golden_shovel");
		enumNameMap.put(diamondShovel, "diamond_shovel");
		enumNameMap.put(woodSword, "wooden_sword");
		enumNameMap.put(stoneSword, "stone_sword");
		enumNameMap.put(ironSword, "iron_sword");
		enumNameMap.put(goldSword, "golden_sword");
		enumNameMap.put(diamondSword, "diamond_sword");
		enumNameMap.put(woodHoe, "wooden_hoe");
		enumNameMap.put(stoneHoe, "stone_hoe");
		enumNameMap.put(ironHoe, "iron_hoe");
		enumNameMap.put(goldHoe, "golden_hoe");
		enumNameMap.put(diamondHoe, "diamond_hoe");
		enumNameMap.put(flintAndSteel, "flint_and_steel");
		enumNameMap.put(fishingRod, "fishing_rod");
		enumNameMap.put(carrotOnAStick, "carrot_on_a_stick");
		enumNameMap.put(totemOfUndying, "totem_of_undying");
		enumNameMap.put(debugStick, "debug_stick");
		
		// Armor
		
		String[] leatherBoots = {"leather boot", "leather shoe"};
		String[] chainBoots = {"chain boot", "chain shoe", "chainmail boot", "chainmail shoe"};
		String[] ironBoots = {"iron boot", "iron shoe"};
		String[] goldBoots = {"golden boot", "gold boot", "golden shoe", "gold shoe"};
		String[] diamondBoots = {"diamond boot"};
		String[] leatherLeggings = {"leather legging", "leather pants"};
		String[] chainLeggings = {"chain legging", "chain pants", "chainmail legging", "chainmail pants"};
		String[] ironLeggings = {"iron legging", "iron pants"};
		String[] goldLeggings = {"golden legging", "golden pants", "gold legging", "gold pants"};
		String[] diamondLeggings = {"diamond legging", "diamond pants"};
		String[] leatherChestplate = {"leather chestplate", "leather tunic", "leather shirt"};
		String[] chainChestplate = {"chain chestplate", "chain shirt", "chainmail chestplate", "chainmail shirt"};
		String[] ironChestplate = {"iron chestplate", "iron shirt"};
		String[] goldChestplate = {"golden chestplate", "golden shirt", "gold chestplate", "gold shirt"};
		String[] diamondChestplate = {"diamond chestplate", "diamond shirt"};
		String[] leatherHelmet = {"leather helmet", "leather hat"};
		String[] chainHelmet = {"chain helmet", "chain hat", "chainmail helmet", "chainmail hat"};
		String[] ironHelmet = {"iron helmet", "iron hat"};
		String[] goldHelmet = {"golden helmet", "golden hat", "gold helmet", "gold hat"};
		String[] diamondHelmet = {"diamond helmet", "diamond hat"};
		String[] leatherHorseArmor = {"leather horse armor"};
		String[] ironHorseArmor = {"iron horse armor"};
		String[] goldHorseArmor = {"golden horse armor", "gold horse armor"};
		String[] diamondHorseArmor = {"diamond horse armor"};
		String[] turtleShell = {"turtle shell", "turtle helmet", "turtle hat"};
		
		enumNameMap.put(leatherBoots, "leather_boots");
		enumNameMap.put(chainBoots, "chainmail_boots");
		enumNameMap.put(ironBoots, "iron_boots");
		enumNameMap.put(goldBoots, "golden_boots");
		enumNameMap.put(diamondBoots, "diamond_boots");
		enumNameMap.put(leatherLeggings, "leather_leggings");
		enumNameMap.put(chainLeggings, "chainmail_leggings");
		enumNameMap.put(ironLeggings, "iron_leggings");
		enumNameMap.put(goldLeggings, "golden_leggings");
		enumNameMap.put(diamondLeggings, "diamond_leggings");
		enumNameMap.put(leatherChestplate, "leather_chestplate");
		enumNameMap.put(chainChestplate, "chainmail_chestplate");
		enumNameMap.put(ironChestplate, "iron_chestplate");
		enumNameMap.put(goldChestplate, "gold_chestplate");
		enumNameMap.put(diamondChestplate, "diamond_chestplate");
		enumNameMap.put(leatherHelmet, "leather_helmet");
		enumNameMap.put(chainHelmet, "chainmail_helmet");
		enumNameMap.put(ironHelmet, "iron_helmet");
		enumNameMap.put(goldHelmet, "golden_helmet");
		enumNameMap.put(diamondHelmet, "diamond_helmet");
		enumNameMap.put(leatherHorseArmor, "leather_horse_armor");
		enumNameMap.put(ironHorseArmor, "iron_horse_armor");
		enumNameMap.put(goldHorseArmor, "golden_horse_armor");
		enumNameMap.put(diamondHorseArmor, "diamond_horse_armor");
		enumNameMap.put(turtleShell, "turtle_helmet");
		
		// Vehicles
		
		String[] birchBoat = {"birch boat"};
		String[] spruceBoat = {"spruce boat"};
		String[] acaciaBoat = {"acacia boat"};
		String[] jungleBoat = {"jungle boat", "jungle wood boat"};
		String[] darkOakBoat = {"dark boat", "dark oak boat"};
		String[] oakBoat = {"boat"};
		String[] furnaceMinecart = {"furnace minecart", "furnace cart", "minecart with furnace", "minecart with a furnace"};
		String[] chestMinecart = {"chest minecart", "chest cart", "minecart with chest", "minecart with a chest"};
		String[] tntMinecart = {"tnt minecart", "tnt cart", "minecart with tnt"};
		String[] hopperMinecart = {"hopper minecart", "hopper cart", "minecart with hopper", "minecart with a hopper"};
		String[] commandBlockMinecart = {"command block minecart", "command block cart", "minecart with command block", "minecart with a command block"};
		
		enumNameMap.put(birchBoat, "birch_boat");
		enumNameMap.put(spruceBoat, "spruce_boat");
		enumNameMap.put(acaciaBoat, "acacia_boat");
		enumNameMap.put(jungleBoat, "jungle_boat");
		enumNameMap.put(darkOakBoat, "dark_oak_boat");
		enumNameMap.put(oakBoat, "oak_boat");
		enumNameMap.put(furnaceMinecart, "furnace_minecart");
		enumNameMap.put(chestMinecart, "chest_minecart");
		enumNameMap.put(tntMinecart, "tnt_minecart");
		enumNameMap.put(hopperMinecart, "hopper_minecart");
		enumNameMap.put(commandBlockMinecart, "command_block_minecart");
		
		// Food
		
		String[] goldenApple = {"golden apple", "gold apple", "gapple"};
		String[] enchantedGoldenApple = {"enchanted golden apple", "enchanted gold apple", "notch apple"};
		String[] beetrootSoup = {"beetroot soup", "beetroot stew"};
		String[] rawBeef = {"raw beef", "uncooked beef", "raw steak"};
		String[] cookedBeef = {"steak", "cooked beef"};
		String[] goldenCarrot = {"golden carrot", "gold carrot"};
		String[] rawChicken = {"raw chicken"};
		String[] cookedChicken = {"cooked chicken"};
		String[] chorusFruit = {"chorus fruit"};
		String[] rawCod = {"raw cod", "raw fish", "fish"};
		String[] cookedCod = {"cooked cod", "cooked fish"};
		String[] melonSlice = {"melon slice", "melon part"};
		String[] redMushroom = {"red mushroom"};
		String[] brownMushroom = {"brown mushroom"};
		String[] mushroomStew = {"mushroom stew", "mushroom soup"};
		String[] rawMutton = {"raw mutton", "uncooked mutton"};
		String[] cookedMutton = {"cooked mutton", "mutton"};
		String[] rawPorkchop = {"raw porkchop", "uncooked porkchop"};
		String[] cookedPorkchop = {"cooked porkchop", "porkchop"};
		String[] bakedPotato = {"baked potato", "cooked potato"};
		String[] poisonousPotato = {"poisonous potato", "poison potato"};
		String[] pumpkinPie = {"pumpkin pie"};
		String[] rawRabbit = {"raw rabbit", "uncooked rabbit"};
		String[] cookedRabbit = {"cooked rabbit"};
		String[] rabbitStew = {"rabbit stew", "rabbit soup"};
		String[] rottenFlesh = {"rotten flesh"};
		String[] cookedSalmon = {"cooked salmon"};
		String[] rawSalmon = {"raw salmon", "salmon"};
		String[] suspiciousStew = {"suspicious stew", "suspicious soup"};
		String[] sweetBerries = {"sweet berries", "berries"};
		String[] driedKelp = {"dried kelp"};
		String[] tropicalFish = {"tropical fish"};
		
		enumNameMap.put(enchantedGoldenApple, "enchanted_golden_apple");
		enumNameMap.put(goldenApple, "golden_apple");
		enumNameMap.put(beetrootSoup, "beetroot_soup");
		enumNameMap.put(cookedBeef, "cooked_beef");
		enumNameMap.put(rawBeef, "beef");
		enumNameMap.put(goldenCarrot, "golden_carrot");
		enumNameMap.put(cookedChicken, "cooked_chicken");
		enumNameMap.put(rawChicken, "chicken");
		enumNameMap.put(chorusFruit, "chorus_fruit");
		enumNameMap.put(cookedCod, "cooked_cod");
		enumNameMap.put(rawCod, "cod");
		enumNameMap.put(melonSlice, "melon_slice");
		enumNameMap.put(redMushroom, "red_mushroom");
		enumNameMap.put(brownMushroom, "brown_mushroom");
		enumNameMap.put(mushroomStew, "mushroom_stew");
		enumNameMap.put(cookedMutton, "cooked_mutton");
		enumNameMap.put(rawMutton, "mutton");
		enumNameMap.put(cookedPorkchop, "cooked_porkchop");
		enumNameMap.put(rawPorkchop, "porkchop");
		enumNameMap.put(bakedPotato, "baked_potato");
		enumNameMap.put(poisonousPotato, "poisonous_potato");
		enumNameMap.put(pumpkinPie, "pumpkin_pie");
		enumNameMap.put(cookedRabbit, "cooked_rabbit");
		enumNameMap.put(rawRabbit, "rabbit");
		enumNameMap.put(rabbitStew, "rabbit_stew");
		enumNameMap.put(rottenFlesh, "rotten_flesh");
		enumNameMap.put(cookedSalmon, "cooked_salmon");
		enumNameMap.put(rawSalmon, "salmon");
		enumNameMap.put(suspiciousStew, "suspicious_stew");
		enumNameMap.put(sweetBerries, "sweet_berries");
		enumNameMap.put(driedKelp, "dried_kelp");
		enumNameMap.put(tropicalFish, "tropical_fish");
		
		// Raw Materials
		
		String[] blazeRod = {"blaze rod"};
		String[] cocoaBeans = {"cocoa bean"};
		String[] enderPearl = {"ender pearl"};
		String[] spiderEyes = {"spider eye"};
		String[] ghastTear = {"ghast tear"};
		String[] glowstoneDust = {"glowstone dust"};
		String[] goldIngot = {"gold"};
		String[] goldNugget = {"gold nugget"};
		String[] inkSac = {"ink sac", "squid ink", "squid sac", "ink"};
		String[] ironIngot = {"iron"};
		String[] ironNugget = {"iron nugget"};
		String[] lapisLazuli = {"lapis"};
		String[] magmaCream = {"magma cream"};
		String[] prismarineCrystal = {"prismarine"};
		String[] prismarineShard = {"prismarine shard"};
		String[] rabbitFoot = {"rabbit foot", "rabbit's foot", "rabbits foot"};
		String[] rabbitHide = {"rabbit hide"};
		String[] beetrootSeeds = {"beetroot seed"};
		String[] netherWart = {"nether wart"};
		String[] pumpkinSeeds = {"pumpkin seed"};
		String[] wheatSeeds = {"wheat seed"};
		String[] netherStar = {"nether star"};
		String[] shulkerShell = {"shulker shell"};
		String[] nautilusShell = {"nautilus shell"};
		String[] phantomMembrane = {"phantom membrane"};
		String[] heartOfTheSea = {"heart of the sea", "sea heart"};
		
		enumNameMap.put(blazeRod, "blaze_rod");
		enumNameMap.put(cocoaBeans, "cocoa_beans");
		enumNameMap.put(enderPearl, "ender_pearl");
		enumNameMap.put(spiderEyes, "spider_eyes");
		enumNameMap.put(ghastTear, "ghast_tear");
		enumNameMap.put(glowstoneDust, "glowstone_dust");
		enumNameMap.put(goldNugget, "gold_nugget");
		enumNameMap.put(ironNugget, "iron_nugget");
		enumNameMap.put(goldIngot, "gold_ingot");
		enumNameMap.put(ironIngot, "iron_ingot");
		enumNameMap.put(inkSac, "ink_sac");
		enumNameMap.put(lapisLazuli, "lapis_lazuli");
		enumNameMap.put(magmaCream, "magma_cream");
		enumNameMap.put(prismarineShard, "prismarine_shard");
		enumNameMap.put(prismarineCrystal, "prismarine_crystal");
		enumNameMap.put(rabbitFoot, "rabbit_foot");
		enumNameMap.put(rabbitHide, "rabbit_hide");
		enumNameMap.put(beetrootSeeds, "beetroot_seeds");
		enumNameMap.put(netherWart, "nether_wart");
		enumNameMap.put(pumpkinSeeds, "pumpkin_seeds");
		enumNameMap.put(wheatSeeds, "wheat_seeds");
		enumNameMap.put(netherStar, "nether_star");
		enumNameMap.put(shulkerShell, "shulker shell");
		enumNameMap.put(nautilusShell, "nautilus_shell");
		enumNameMap.put(phantomMembrane, "phantom_membrane");
		enumNameMap.put(heartOfTheSea, "heart_of_the_sea");
		
		// Manufacture
		
		String[] nameTag = {"name tag"};
		String[] blazePowder = {"blaze powder"};
		String[] boneMeal = {"bone meal", "fertilizer"};
		String[] bookAndQuill = {"book and quill"};
		String[] eyeOfEnder = {"ender eye", "eye of ender"};
		String[] fermentedSpiderEye = {"fermented spider eye"};
		String[] glisteringMelon = {"glistering melon"};
		String[] netherBrick = {"nether brick"};
		String[] poppedChorusFruit = {"popped chorus"};
		String[] fireCharge = {"fire charge", "fireball", "fire ball"};
		
		enumNameMap.put(nameTag, "nametag");
		enumNameMap.put(blazePowder, "blaze_powder");
		enumNameMap.put(boneMeal, "bone_meal");
		enumNameMap.put(bookAndQuill, "bookAndQuill");
		enumNameMap.put(eyeOfEnder, "ender_eye");
		enumNameMap.put(fermentedSpiderEye, "fermented_spider_eye");
		enumNameMap.put(glisteringMelon, "glistering_melon");
		enumNameMap.put(netherBrick, "nether_brick");
		enumNameMap.put(poppedChorusFruit, "popped_chorus_fruit");
		enumNameMap.put(fireCharge, "fire_charge");
		
		// Dyes
		
		String[] roseRed = {"rose red", "red dye"};
		String[] pinkDye = {"pink dye"};
		String[] orangeDye = {"orange dye"};
		String[] dandelionYellow = {"dendelion yellow", "yellow dye"};
		String[] cactusGreen = {"cactus green", "green dye"};
		String[] limeDye = {"lime dye"};
		String[] lightBlueDye = {"light blue dye"};
		String[] cyanDye = {"cyan dye"};
		String[] blueDye = {"blue dye", "lapis dye"};
		String[] magentaDye = {"magenta dye"};
		String[] purpleDye = {"purpleDye"};
		String[] grayDye = {"gray dye"};
		String[] lightGrayDye = {"light gray dye"};
		String[] whiteDye = {"white dye", "bonemeal dye"};
		String[] blackDye = {"black dye", "ink dye"};
		String[] brownDye = {"brown dye"};
		
		enumNameMap.put(roseRed, "red_dye");
		enumNameMap.put(pinkDye, "pink_dye");
		enumNameMap.put(orangeDye, "orange_dye");
		enumNameMap.put(dandelionYellow, "yellow_dye");
		enumNameMap.put(cactusGreen, "green_dye");
		enumNameMap.put(limeDye, "lime_dye");
		enumNameMap.put(lightBlueDye, "light_blue_dye");
		enumNameMap.put(cyanDye, "cyan_dye");
		enumNameMap.put(blueDye, "blue_dye");
		enumNameMap.put(magentaDye, "magenta_dye");
		enumNameMap.put(purpleDye, "purple_dye");
		enumNameMap.put(grayDye, "gray_dye");
		enumNameMap.put(lightGrayDye, "light_gray_dye");
		enumNameMap.put(whiteDye, "white_dye");
		enumNameMap.put(blackDye, "black_dye");
		enumNameMap.put(brownDye, "brown_dye");
		
		// Music Discs
		
		String[] disc11 = {"disc 11", "record 11"};
		String[] disc13 = {"disc 13", "record 13"};
		String[] discCat = {"disc cat", "record cat"};
		String[] discBlocks = {"disc blocks", "disc blocks"};
		String[] discChirp = {"disc chirp", "record chirp"};
		String[] discFar = {"disc far", "record far"};
		String[] discMall = {"disc mall", "record mall"};
		String[] discMellohi = {"disc mellohi", "record mellohi"};
		String[] discStal = {"disc stal", "record stal"};
		String[] discStrad = {"disc stard", "record stard"};
		String[] discWard = {"disc ward", "record ward"};
		String[] discWait = {"disc", "record"};
		
		enumNameMap.put(disc11, "music_disc_11");
		enumNameMap.put(disc13, "music_disc_13");
		enumNameMap.put(discCat, "music_disc_cat");
		enumNameMap.put(discBlocks, "music_disc_blocks");
		enumNameMap.put(discChirp, "music_disc_chirp");
		enumNameMap.put(discFar, "music_disc_far");
		enumNameMap.put(discMall, "music_disc_mall");
		enumNameMap.put(discMellohi, "music_disc_mellohi");
		enumNameMap.put(discStal, "music_disc_stal");
		enumNameMap.put(discStrad, "music_disc_strad");
		enumNameMap.put(discWard, "music_disc_ward");
		enumNameMap.put(discWait, "music_disc_wait");
		
	}
	
	public String translateMessageIDs(String msg) {
		
		String newMsg = msg;
		
		for( String[] names : enumNameMap.keySet() ) {
			
			for( int i = 0 ; i<names.length ; i++ ) {
				newMsg = newMsg.replace(" " + names[i] + " ", " " + enumNameMap.get(names) + " ");
				newMsg = newMsg.replace(" " + names[i] + "s ", " " + enumNameMap.get(names) + " ");
			}
			
		}
		
		return newMsg;
		
	}
	
}
