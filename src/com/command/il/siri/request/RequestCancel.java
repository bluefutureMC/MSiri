package com.command.il.siri.request;

import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestCancel implements ISiriRequest {

	@Override
	public void activate(Player player, String msg) {
		
		Siri.sendSiriMessage(player, "Ok " + player.getName());
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"never mind", "cancel", "forget about it", "you cant", "stop", "cancel that"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public String getPermission() {
		return "";
	}
	
}
