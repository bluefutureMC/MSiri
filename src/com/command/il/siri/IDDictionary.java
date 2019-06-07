package com.command.il.siri;

import java.util.HashMap;

import org.bukkit.Material;

public class IDDictionary {
	
	private HashMap<String[], Material> matNameMap;
	
	public IDDictionary() {
		matNameMap = new HashMap<>();
		
		String[] diamondBlock = {"block of diamond", "diamond block", "blocks of diamond", "diamond blocks"};
		String[] emeraldBlock = {"block of emerald", "emerald block", "blocks of emerald", "emerald blocks"};
		String[] goldBlock = {"block of gold", "gold block", "blocks of gold", "gold blocks"};
		String[] ironBlock = {"block of iron", "iron block", "blocks of iron", "iron blocks"};
		String[] coalBlock = {"block of coal", "coal block", "blocks of coal", "coal blocks"};
		String[] lapisBlock = {"block of lapis", "lapis block", "blocks of lapis", "lapis blocks", "block of lapis lazuli", "lapis lazuli block", "blocks of lapis lazuli", "lapis lazuli blocks"};
		String[] redstoneBlock = {"block of redstone", "redstone block", "blocks of redstone", "redstone blocks", "block of red stone", "red stone block", "blocks of red stone", "red stone blocks"};
		
		matNameMap.put(diamondBlock, Material.DIAMOND_BLOCK);
		matNameMap.put(emeraldBlock, Material.EMERALD_BLOCK);
		matNameMap.put(goldBlock, Material.GOLD_BLOCK);
		matNameMap.put(ironBlock, Material.IRON_BLOCK);
		matNameMap.put(coalBlock, Material.COAL_BLOCK);
		matNameMap.put(lapisBlock, Material.LAPIS_BLOCK);
		matNameMap.put(redstoneBlock, Material.REDSTONE_BLOCK);
	}
	
	public Material getMaterial(String name) {
		
		for( String[] alis : matNameMap.keySet() ) {
			
			for( int i = 0 ; i<alis.length ; i++ ) {
				
				if( name.equalsIgnoreCase(alis[i]) ) return matNameMap.get(alis);
				
			}
			
		}
		
		Material mat = null;
		
		try {
			
			mat = Material.valueOf(name.toUpperCase().replace(" ", "_"));
			
		} catch (Exception e) { }
		
		return mat;
		
	}
	
}
