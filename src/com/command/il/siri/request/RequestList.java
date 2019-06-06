package com.command.il.siri.request;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestList implements ISiriRequest {
	
	private Siri pl;
	
	public RequestList( Siri pl ) {
		
		this.pl = pl;
		
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		String mg = ChatColor.GOLD + "This is a list of my current abilities:";
		
		for( ISiriRequest r : pl.getRequestHandler().requests ) {
			
			if( r instanceof RequestCancel ) continue;
			
			mg += ChatColor.AQUA + "\n - " + r.getDescription();
			
		}
		
		player.sendMessage(mg);
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"what can you do", "show me what you got", "show me your abilities"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Show the list of abilities";
	}

	@Override
	public String getPermission() {
		return "msiri.request.list";
	}
	
}
