package com.command.il.siri.request;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestSummon implements ISiriRequest {

	@SuppressWarnings("deprecation")
	@Override
	public void activate(Player player, String msg) {
		
		String[] words = msg.split(" ");
		
		EntityType type = null;
		boolean isValid = false;
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			try {
				
				type = EntityType.valueOf(words[i].toUpperCase());
				isValid = true;
				break;
				
			} catch(IllegalArgumentException e) {}
			
		}
		
		if( !isValid ) {
			
			Siri.sendSiriMessage(player, "I don't seem to understand you... Maybe try agian?");
			return;
			
		}
		
		if( SiriUtil.containsWord(msg, "here") ) {
			
			Location loc = player.getLocation();
			
			player.getWorld().spawnEntity(loc, type);
			
			Siri.sendSiriMessage(player, "Spawned a " + type.getName() + " at " + loc.getBlockX() + " " + loc.getBlockY() + " " + loc.getBlockZ());
			
		} else if( SiriUtil.containsWord(msg, "at") ) {
			
			int offset = 0;
			
			for( int i = 0 ; i<words.length ; i++ ) {
				
				if( words[i].equalsIgnoreCase("at") ) {
					offset = i;
					break;
				}
				
			}
			
			try {
				
				double locX = Double.parseDouble(words[offset+1]);
				double locY = Double.parseDouble(words[offset+2]);
				double locZ = Double.parseDouble(words[offset+3]);
				
				Location loc = new Location(player.getWorld(), locX, locY, locZ);
				
				player.getWorld().spawnEntity(loc, type);
				
				Siri.sendSiriMessage(player, "Spawned a " + type.getName() + " at " + locX + " " + locY + " " + locZ);
				
			} catch( NumberFormatException e ) {
				
				Siri.sendSiriMessage(player, "I can't find that destenation...");
				return;
				
			}
			
		} else {
			
			int maxDis = 10;
			
			Block b = player.getTargetBlock(null, maxDis);
			
			Location loc = new Location(player.getWorld(), b.getLocation().getX(), b.getLocation().getY() + 1, b.getLocation().getZ());
			
			player.getWorld().spawnEntity(loc, type);
			
			Siri.sendSiriMessage(player, "Spawned a " + type.getName());
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"summon a", "summon an", "summon entity", "summon entity at", "summon a at", "summon an at", "summon a here", "summon an here", "summon", "spawn a", "spawn an", "spawn entity", "spawn at", "spawn a at", "spawn an at", "spawn a here", "spawn here", "spawn an here"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Spawn mobs or entities";
	}

	@Override
	public String getPermission() {
		return "msiri.request.summon_mob";
	}
	
}
