package com.command.il.siri;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.command.il.siri.request.RequestCancel;
import com.command.il.siri.request.RequestChangeGamemode;
import com.command.il.siri.request.RequestChangeTime;
import com.command.il.siri.request.RequestChangeWeather;
import com.command.il.siri.request.RequestCreatorInfo;
import com.command.il.siri.request.RequestFeed;
import com.command.il.siri.request.RequestGetTime;
import com.command.il.siri.request.RequestGiveItem;
import com.command.il.siri.request.RequestHandler;
import com.command.il.siri.request.RequestHeal;
import com.command.il.siri.request.RequestKill;
import com.command.il.siri.request.RequestList;
import com.command.il.siri.request.RequestLocation;
import com.command.il.siri.request.RequestPlaceBlock;
import com.command.il.siri.request.RequestSummon;

public class Siri extends JavaPlugin {
	
	public static String NAME = "Siri";
	
	public static boolean debugMode = true;
	
	private RequestHandler rh;
	
	@Override
	public void onEnable() {
		
		getServer().getConsoleSender().sendMessage("MSiri has been enabled");
		
		rh = new RequestHandler();
		
		getServer().getPluginManager().registerEvents(new ChatRequestDecriptor(this), this);
		
		registerDefaultRequests();
		
	}
	
	@Override
	public void onDisable() {
		
		getServer().getConsoleSender().sendMessage("MSiri has been disabled");
		
	}
	
	public RequestHandler getRequestHandler() {
		return rh;
	}
	
	private void registerDefaultRequests() {
		
		rh.registerRequest(new RequestChangeTime(this));
		rh.registerRequest(new RequestKill(this));
		rh.registerRequest(new RequestGiveItem());
		rh.registerRequest(new RequestCreatorInfo());
		rh.registerRequest(new RequestGetTime());
		rh.registerRequest(new RequestSummon());
		rh.registerRequest(new RequestChangeWeather());
		rh.registerRequest(new RequestLocation());
		rh.registerRequest(new RequestList(this));
		rh.registerRequest(new RequestPlaceBlock());
		rh.registerRequest(new RequestCancel());
		rh.registerRequest(new RequestHeal(this));
		rh.registerRequest(new RequestFeed(this));
		rh.registerRequest(new RequestChangeGamemode(this));
		
	}
	
	public static void sendSiriMessage( Player player, String msg ) {
		
		player.sendMessage("["+ChatColor.AQUA+""+ChatColor.BOLD+Siri.NAME+ChatColor.RESET+"] " + msg);
		
	}
	
	public static void sendSiriErrorMessage( Player player ) {
		
		sendSiriMessage(player, "I don't seem to understand you... Maybe try agian?");
		
	}
	
	public void debug(String msg) {
		
		if( debugMode ) {
			
			getServer().getConsoleSender().sendMessage("[DEBUG] " + msg);
			
		}
		
	}
	
}
