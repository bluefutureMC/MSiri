package com.command.il.siri.request;

import java.util.ArrayList;

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
			
			Player[] telis = extractTeleporties(msg, player);
			
			if( telis != null && telis.length > 1 ) {
				
				for( int i = 0 ; i<telis.length-1 ; i++ ) {
					
					telis[i].teleport(telis[telis.length-1]);
					
				}
				
				if( telis.length == 2 ) {
					
					Siri.sendSiriMessage(player, "Teleported " + telis[0] + " to " + telis[1]);
					
				} else {
					
					String sendMsg = "Teleported ";
					
					for( int i = 0 ; i<telis.length-2 ; i++ ) {
						
						if( i == telis.length-3 ) {
							
							sendMsg += telis[i].getName();
							
						} else {
							
							sendMsg += telis[i].getName() + ", ";
							
						}
						
					}
					
					sendMsg += " and " + telis[telis.length-2] + " to " + telis[telis.length-1];
					
					Siri.sendSiriMessage(player, sendMsg);
					
				}
				
			} else {
				
				Siri.sendSiriErrorMessage(player);
				return;
				
			}
			
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

	private Player[] extractTeleporties(String msg, Player player) {		
		
		ArrayList<Player> telis = new ArrayList<>();
		
		String[] words = msg.split(" ");
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			if( words[i].equalsIgnoreCase("me") || words[i].equalsIgnoreCase("i") ) {
				
				telis.add(player);
				
			} else {
				
				Player pp = pl.getServer().getPlayer(words[i]);
				
				if( pp != null ) telis.add(pp);
				
			}
			
		}
		
		if( telis.isEmpty() ) return null;
		
		Player[] telisArray = new Player[telis.size()];
		
		for( int i = 0 ; i<telis.size() ; i++ ) {
			
			telisArray[i] = telis.get(i);
			
		}
		
		return telisArray;
		
	}
	
}
