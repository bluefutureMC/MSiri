package com.command.il.siri.request;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestHeal implements ISiriRequest {

	Siri pl;
	
	public RequestHeal(Siri pl) {
		
		this.pl = pl;
		
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		Player healAble = SiriUtil.extractPlayer(pl, msg);
		
		if( healAble == null ) {
			player.setHealth(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
			player.removePotionEffect(PotionEffectType.POISON);
			player.removePotionEffect(PotionEffectType.WITHER);
			
			Siri.sendSiriMessage(player, "Healed you");
		} else {
			
			healAble.setHealth(healAble.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
			healAble.removePotionEffect(PotionEffectType.POISON);
			healAble.removePotionEffect(PotionEffectType.WITHER);
			
			Siri.sendSiriMessage(player, "Healed " + healAble.getName());
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		String[] vs = {"heal", "heal me", "fill health"};
		return vs;
	}

	@Override
	public String getDescription() {
		return "Heal a player";
	}

	@Override
	public String getPermission() {
		return "msiri.request.heal";
	}
	
}
