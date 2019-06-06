package com.command.il.siri.request;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestLocation implements ISiriRequest {

	@Override
	public void activate(Player player, String msg) {
		
		Location loc = player.getLocation();
		Biome bio = loc.getBlock().getBiome();
		
		Siri.sendSiriMessage(player, "Your current position is (" + loc.getBlockX() + ", " + loc.getBlockY() + ", " + loc.getBlockZ() + ") in \"" + loc.getWorld().getName() + "\" (" + bio.name() + ")");
		
	}

	@Override
	public String[] getVeriants() {
		String[] v = {"where am i", "what is my position", "show me my position", "what biome am i in", "what is my location", "show me my location", "what is my xyz", "show me my coordinates", "show me my coordinate", "what is my coordinates", "what is my coordinate"};
		return v;
	}

	@Override
	public String getDescription() {
		return "Gives info about your current location";
	}

	@Override
	public String getPermission() {
		return "msiri.request.get_location";
	}

}
