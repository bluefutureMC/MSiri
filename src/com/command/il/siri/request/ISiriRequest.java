package com.command.il.siri.request;

import org.bukkit.entity.Player;

public interface ISiriRequest {
	
	public void activate(Player player, String msg);
	public String[] getVeriants();
	public String getDescription();
	public String getPermission();
	
}
