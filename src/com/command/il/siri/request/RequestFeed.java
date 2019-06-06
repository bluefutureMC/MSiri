package com.command.il.siri.request;

import org.bukkit.entity.Player;

import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestFeed implements ISiriRequest {

	Siri pl;
	
	public RequestFeed(Siri pl) {
		
		this.pl = pl;
		
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		Player feedAble = SiriUtil.extractPlayer(pl, msg);
		
		if( feedAble == null ) {
			
			player.setFoodLevel(20);
			
			Siri.sendSiriMessage(player, "Fed you");
			
		} else {
			
			feedAble.setFoodLevel(20);
			
			Siri.sendSiriMessage(player, "Fed " + feedAble.getName());
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"feed", "feed me", "fill hunger", "fill food", "fill food level", "give food"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "Feed a player";
	}

	@Override
	public String getPermission() {
		return "msiri.request.feed";
	}

}
