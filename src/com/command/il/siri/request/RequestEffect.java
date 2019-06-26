package com.command.il.siri.request;

import org.bukkit.entity.Player;

public class RequestEffect implements ISiriRequest {

	@Override
	public void activate(Player player, String msg) {
		
		
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"effect me", "apply effect", "effect", "apply effect to", "effect with", "effect me with"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "Apply potion effects";
	}

	@Override
	public String getPermission() {
		return "msiri.request.effect";
	}
	
}
