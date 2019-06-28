package com.command.il.siri.request;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestHouse implements ISiriRequest {
	
	Siri pl;
	
	public RequestHouse( Siri pl ) {
		this.pl = pl;
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		Location buildAround = player.getLocation();
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(pl, new Runnable() {
			@Override
			public void run() {
				
			}
		}, 5l);
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"build a house", "build me a house", "build me a home", "build a home", "build me a base", "build a base"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "build a house for you";
	}

	@Override
	public String getPermission() {
		return "msiri.request.house";
	}
	
}
