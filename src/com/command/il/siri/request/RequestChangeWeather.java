package com.command.il.siri.request;

import org.bukkit.entity.Player;

import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestChangeWeather implements ISiriRequest {

	@Override
	public void activate(Player player, String msg) {
		
		if( SiriUtil.containsWord(msg, "stop") && (SiriUtil.containsWord(msg, "rain") || SiriUtil.containsWord(msg, "storm") || SiriUtil.containsWord(msg, "thunder") || SiriUtil.containsWord(msg, "weather")) ) {
			
			player.getWorld().setStorm(false);
			player.getWorld().setThundering(false);
			
			player.getWorld().setWeatherDuration(10000);
			player.getWorld().setThunderDuration(0);
			
			Siri.sendSiriMessage(player, "Clearing weather");
			
			return;
			
		} else if( SiriUtil.containsWord(msg, "clear") || SiriUtil.containsWord(msg, "sunny") ) {
			
			player.getWorld().setStorm(false);
			player.getWorld().setThundering(false);
			
			player.getWorld().setWeatherDuration(10000);
			player.getWorld().setThunderDuration(0);
			
			Siri.sendSiriMessage(player, "Clearing weather");
			
			return;
			
		} else if( SiriUtil.containsWord(msg, "rain") && !SiriUtil.containsWord(msg, "storm") && !SiriUtil.containsWord(msg, "thunder") ) {
			
			player.getWorld().setStorm(true);
			
			player.getWorld().setWeatherDuration(10000);
			
			Siri.sendSiriMessage(player, "Starting rain");
			
			return;
			
		} else if( SiriUtil.containsWord(msg, "storm") || SiriUtil.containsWord(msg, "thunder") || SiriUtil.containsWord(msg, "lighting") ) {
			
			player.getWorld().setStorm(true);
			player.getWorld().setWeatherDuration(10000);
			player.getWorld().setThundering(true);
			player.getWorld().setThunderDuration(10000);
			
			Siri.sendSiriMessage(player, "Starting a thunder storm");
			
			return;
			
		} else {
			
			Siri.sendSiriMessage(player, "I don't seem to understand... Maybe try agian?");
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"clear weather", "clear the weather", "start rain", "start a storm", "start a thunder storm", "change weather to", "set weather to", "stop the rain"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Change the weather";
	}

	@Override
	public String getPermission() {
		return "msiri.request.change_weather";
	}
}
