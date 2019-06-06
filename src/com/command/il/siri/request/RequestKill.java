package com.command.il.siri.request;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.command.il.siri.Siri;

public class RequestKill implements ISiriRequest {

	private Siri pl;
	
	public RequestKill(Siri pl) {
		
		this.pl = pl;
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void activate(Player player, String msg) {
		
		String[] words = msg.split(" ");
		
		boolean isPlayer = false;
		String playerName = "";
		
		boolean isMob = false;
		EntityType mobType = null;
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			for( Player p : pl.getServer().getOnlinePlayers() ) {
				
				if( words[i].equalsIgnoreCase(p.getName().toLowerCase()) ) {
					isPlayer = true;
					playerName = p.getName();
					break;
				}
				
			}
			
			if( isPlayer ) break;
			
			try {
				
				String mob = "";
				
				if(words[i].endsWith("s")) {
					
					char[] mobC = words[i].toCharArray();
					
					for(int ii = 0 ; ii<mobC.length ; ii++) {
						if( ii != (mobC.length-1) ) mob += mobC[ii];
					}
					
				} else {
					mob = words[i];
				}
				
				mobType = EntityType.valueOf(mob.toUpperCase());
				isMob = true;
				break;
				
			} catch( IllegalArgumentException e ) {
				
				isMob = false;
				
			}
			
			if( msg.equalsIgnoreCase("kill me") || msg.equalsIgnoreCase("murdar me") ) {
				
				player.setHealth(0);
				
				Siri.sendSiriMessage(player, "Killed you");
				
				return;
				
			}
			
		}
		
		if( isPlayer ) {
			
			pl.getServer().getPlayer(playerName).setHealth(0);
			
			Siri.sendSiriMessage(player, "Killed " + playerName);
			
		} else if( isMob ) {
			
			for( Entity e : player.getWorld().getEntities() ) {
				
				if( e.getType() == mobType ) {
					
					if( e instanceof Damageable ) {
						Damageable en = (Damageable) e;
						en.setHealth(0);
					} else {
						e.remove();
					}
					
				}
				
			}
			
			Siri.sendSiriMessage(player, "Killed all " + mobType.getName() + "s");
			
		} else {
			
			Siri.sendSiriMessage(player, "I don't seem to understand... Maybe try agian?");
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		
		String[] v = {"kill player", "murdar player", "kill mob", "kill all", "murdar all", "murdar mob"};
		
		return v;
		
	}

	@Override
	public String getDescription() {
		return "Kill a specific type of mob or player";
	}

	@Override
	public String getPermission() {
		return "msiri.request.kill";
	}
	
}
