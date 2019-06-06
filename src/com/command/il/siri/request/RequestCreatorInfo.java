package com.command.il.siri.request;

import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestCreatorInfo implements ISiriRequest {

	@Override
	public void activate(Player player, String msg) {
		
		Siri.sendSiriMessage(player, "My creator is Blue_future a.k.a CommandIL!");
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"who is your creator", "who created you", "who develops you", "who is your daddy", "who is your dad", "who is your mom", "who is your mommy", "who is your father"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Plug my creator...";
	}

	@Override
	public String getPermission() {
		return "msiri.request.*";
	}

}
