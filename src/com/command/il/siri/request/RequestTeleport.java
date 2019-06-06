package com.command.il.siri.request;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestTeleport implements ISiriRequest {

	Siri pl;
	
	public RequestTeleport(Siri pl) {
		
		this.pl = pl;
		
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		int[] loc = SiriUtil.extractPosition(msg);
		
		if( loc != null ) {
			
			if( SiriUtil.containsWord(msg, "me") ) {
				
				player.teleport(new Location(player.getWorld(), loc[0], loc[1], loc[2]));
				Siri.sendSiriMessage(player, "Teleported you to " + loc[0] + " " + loc[1] + " " + loc[2]);
				
			} else {
				
				Player teli = SiriUtil.extractPlayer(pl, msg);
				if( teli == null ) {
					
					Siri.sendSiriErrorMessage(player);
					return;
					
				}
				
				teli.teleport(new Location(player.getWorld(), loc[0], loc[1], loc[2]));
				Siri.sendSiriMessage(player, "Teleported " + teli.getName() + " to " + loc[0] + " " + loc[1] + " " + loc[2]);
				
			}
			
		} else {
			
			
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"teleport", "tp", "teleport me to", "tp me to", "teleport me", "tp me"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "Teleport players to a location";
	}

	@Override
	public String getPermission() {
		return "msiri.request.teleport";
	}

}
