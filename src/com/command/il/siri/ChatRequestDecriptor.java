package com.command.il.siri;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import com.command.il.siri.request.ISiriRequest;
import com.command.il.siri.request.RequestCancel;

@SuppressWarnings("deprecation")
public class ChatRequestDecriptor implements Listener {
	
	private ArrayList<Player> siriRequesters;
	private Siri pl;
	
	public ChatRequestDecriptor(Siri pl) {
		
		this.pl = pl;
		siriRequesters = new ArrayList<Player>();
	}
	
	@EventHandler
	public void onPlayerChat( PlayerChatEvent event ) {
		
		String msg = event.getMessage().toLowerCase().replace("?", "").replace(",", "").replace(".", "").replace("!", "").replace("whats", "what is");
		Player player = event.getPlayer();
		
		if( siriRequesters.contains(player) ) {
			
			ISiriRequest request = pl.getRequestHandler().DecriptMassage(msg);
			
			if( request == null ) {
				
				Siri.sendSiriMessage(player, "Sorry, I can't do that yet...");
				
			} else {
				
				if(player.hasPermission(request.getPermission()) || request instanceof RequestCancel) request.activate(player, msg);
				else Siri.sendSiriMessage(player, "Sorry, but I am not allowed to do that for you...");
				
			}
			
			event.setCancelled(true);
			siriRequesters.remove(player);
			
		} else if( msg.equals("hi " + Siri.NAME.toLowerCase()) || msg.equals("hey " + Siri.NAME.toLowerCase()) ) {
			
			Siri.sendSiriMessage(player, "How can I help you " + player.getName() + "?");
			siriRequesters.add(player);
			event.setCancelled(true);
			
		}
		
	}
	
}
