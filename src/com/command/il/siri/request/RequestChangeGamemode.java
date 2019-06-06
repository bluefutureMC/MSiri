package com.command.il.siri.request;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestChangeGamemode implements ISiriRequest {

	Siri pl;
	
	public RequestChangeGamemode(Siri pl) {
		
		this.pl = pl;
		
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		GameMode mode = extractGamemode(msg);
		Player changeable = SiriUtil.extractPlayer(pl, msg);
		
		if( mode != null ) {
			
			if( changeable != null ) {
				
				changeable.setGameMode(mode);
				Siri.sendSiriMessage(player, "Set " + changeable.getName() + "'s current gamemode to " + mode.name().toLowerCase());
				
			} else {
				
				player.setGameMode(mode);
				Siri.sendSiriMessage(player, "Set your current gamemode to " + mode.name().toLowerCase());
				
			}
			
		} else {
			
			Siri.sendSiriMessage(player, "I don't seem to understand... Maybe try agian?");
			return;
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"change gamemode", "set gamemode", "change to survival", "change to creative", "change to advanture", "change spectator"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "Change a player's gamemode";
	}

	@Override
	public String getPermission() {
		return "msiri.request.change_gamemode";
	}
	
	private GameMode extractGamemode(String msg) {
		
		String[] words = msg.split(" ");
		
		GameMode mode = null;
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			try {
				mode = GameMode.valueOf(words[i].toUpperCase());
				break;
			} catch (Exception e) {
				mode = null;
			}
			
		}
		
		if( mode == null ) {
			
			if( SiriUtil.containsWord(msg, "gamemode 0") ) mode = GameMode.SURVIVAL;
			else if( SiriUtil.containsWord(msg, "gamemode 1") ) mode = GameMode.CREATIVE;
			else if( SiriUtil.containsWord(msg, "gamemode 2") ) mode = GameMode.ADVENTURE;
			else if( SiriUtil.containsWord(msg, "gamemode 3") ) mode = GameMode.SPECTATOR;
			
		}
		
		return mode;
		
	}
	
}
