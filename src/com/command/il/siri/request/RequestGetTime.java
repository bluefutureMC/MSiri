package com.command.il.siri.request;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.World;
import org.bukkit.entity.Player;

import com.command.il.siri.HttpManager;
import com.command.il.siri.Siri;

public class RequestGetTime implements ISiriRequest {
	
	Siri pl;
	
	public RequestGetTime(Siri pl) {
		this.pl = pl;
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		if( msg.contains("real world") || msg.contains("irl") ) {
			
			String ip = player.getAddress().toString().replace("/", "").split(":")[0];
			pl.debug("Player IP: " + ip);
			Siri.sendSiriMessage(player, "Please wait...");
			Siri.sendSiriMessage(player, "The current Real World Time is " + HttpManager.getTimeByIP(ip));
			
		} else {
			
			World w = player.getWorld();
			
			Siri.sendSiriMessage(player, "The current In Game Time is " + ticksToTime(w.getTime()) + " ("+w.getFullTime()+" ticks)");			
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"what time is it", "what is the time", "what is the gametime", "show me the time", "show me the gametime", "show me the in game time"};
		
		return v;
		
	}
	
	private String ticksToTime(long ticks) {
		
		
		
		long tMin = ticks/16;
		
		int hours = (int) (tMin/60) + 6;
		int min = (int) (tMin%60);
		
		if( min < 10 ) return hours + ":0" + min;
		else return hours + ":" + min;
		
	}
	
	/*
	private String getCurrentSystemTime() {
		
		Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		
		return dateFormat.format(date);
		
	}
	*/
	
	@Override
	public String getDescription() {
		return "Show the time";
	}

	@Override
	public String getPermission() {
		return "msiri.request.get_time";
	}
	
}
