package com.command.il.siri.request;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.command.il.siri.Siri;

public class RequestGiveItem implements ISiriRequest {

	@Override
	public void activate(Player player, String msg) {
		
		String[] words = msg.split(" ");
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			try {
				
				String mat = "";
				
				if(words[i].endsWith("s")) {
					
					char[] mobC = words[i].toCharArray();
					
					for(int ii = 0 ; ii<mobC.length ; ii++) {
						if( ii != (mobC.length-1) ) mat += mobC[ii];
					}
					
				} else {
					mat = words[i];
				}
				
				Material item = Material.valueOf(mat.toUpperCase());
				
				try {
					
					int count = Integer.parseInt(words[i-1]);
					
					player.getInventory().addItem( new ItemStack(item, count) );
					if( count != 1 ) Siri.sendSiriMessage(player, "Gave you " + count + " " + item.name().toLowerCase() + "s");
					else Siri.sendSiriMessage(player, "Gave you 1 " + item.name().toLowerCase());
					
				} catch (NumberFormatException e) {
					
					player.getInventory().addItem( new ItemStack(item) );
					Siri.sendSiriMessage(player, "Gave you 1 " + item.name().toLowerCase());
					
				}
				
				return;
				
			} catch (IllegalArgumentException e) {
				
			}
			
		}
		
		Siri.sendSiriMessage(player, "I don't seem to understand... Maybe try agian?");
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"give me", "give"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Give items";
	}

	@Override
	public String getPermission() {
		return "msiri.request.give_item";
	}
	
}
