package com.command.il.siri;

import java.util.HashMap;

import org.bukkit.Material;

public class IDDictionary {
	
	private HashMap<String[], String> enumNameMap;
	
	public IDDictionary() {
		enumNameMap = new HashMap<>();
		
		// Resource Blocks
		String[] diamondBlock = {"block of diamond", "diamond block", "blocks of diamond", "diamond blocks"};
		String[] emeraldBlock = {"block of emerald", "emerald block", "blocks of emerald", "emerald blocks"};
		String[] goldBlock = {"block of gold", "gold block", "blocks of gold", "gold blocks"};
		String[] ironBlock = {"block of iron", "iron block", "blocks of iron", "iron blocks"};
		String[] coalBlock = {"block of coal", "coal block", "blocks of coal", "coal blocks"};
		String[] lapisBlock = {"block of lapis", "lapis block", "blocks of lapis", "lapis blocks", "block of lapis lazuli", "lapis lazuli block", "blocks of lapis lazuli", "lapis lazuli blocks"};
		String[] redstoneBlock = {"block of redstone", "redstone block", "blocks of redstone", "redstone blocks", "block of red stone", "red stone block", "blocks of red stone", "red stone blocks"};
		
		enumNameMap.put(diamondBlock, "diamond_block");
		enumNameMap.put(emeraldBlock, "emerald_block");
		enumNameMap.put(goldBlock, "gold_block");
		enumNameMap.put(ironBlock, "iron_block");
		enumNameMap.put(coalBlock, "coal_block");
		enumNameMap.put(lapisBlock, "lapis_block");
		enumNameMap.put(redstoneBlock, "redstone_block");
		
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
		
	}
	
	public String translateMessageIDs(String msg) {
		
		String newMsg = msg;
		
		for( String[] names : enumNameMap.keySet() ) {
			
			for( int i = 0 ; i<names.length ; i++ ) {
				newMsg = newMsg.replace(names[i], enumNameMap.get(names));
			}
			
		}
		
		return newMsg;
		
	}
	
}
