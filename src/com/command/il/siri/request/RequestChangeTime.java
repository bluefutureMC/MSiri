package com.command.il.siri.request;

import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestChangeTime implements ISiriRequest {

	private Siri pl;
	
	public RequestChangeTime(Siri pl) {
		
		this.pl = pl;
		
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		String messageCont = "";
		
		if( msg.contains("midnight") ) {
			
			player.getWorld().setTime(18000);
			messageCont = "Midnight";
			
		} else if( msg.contains("to day") ) {
			
			player.getWorld().setTime(1000);
			messageCont = "Day";
			
		} else if( msg.contains("night") ) {
			
			player.getWorld().setTime(13000);
			messageCont = "Night";
			
		} else if( msg.contains("noon") ) {
			
			player.getWorld().setTime(6000);
			messageCont = "Noon";
			
		} else {
			
			String[] words = msg.split(" ");
			
			boolean ran = false;
			
			for( int i = 0 ; i<words.length ; i++ ) {
				
				if( words[i].toLowerCase().equals("to") ) {
					
					String time = words[i+1];
					
					long ticks = 0;
					
					pl.debug("TIME = " + time + ", BOOL = " + time.contains(":"));
					
					if( time.contains(":") ) {
						
						int hours = Integer.parseInt(time.split(":")[0]);
						int min = Integer.parseInt(time.split(":")[1]);
						
						if(hours>=6) ticks = ((hours-6)*1000) + (min*16);
						else ticks = ((24-(6-hours))*1000) + (min*16);
						
					}
					
					player.getWorld().setTime(ticks);
					messageCont = time;
					
					ran = true;
					break;
					
				}
				
			}
			
			if( !ran ) {
				
				Siri.sendSiriMessage(player, "I don't seem to understand... Maybe try agian?");
				return;
				
			}
			
		}
		
		Siri.sendSiriMessage(player, "Changing world time to " + messageCont);
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"set time to", "change time to", "make it night", "make it day", "change daytime to", "set daytime to"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Change the time of day";
	}

	@Override
	public String getPermission() {
		return "msiri.request.change_time";
	}
	
}
