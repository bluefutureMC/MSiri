package com.command.il.siri.request;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.command.il.siri.IDDictionary;
import com.command.il.siri.Siri;
import com.command.il.siri.SiriUtil;

public class RequestPlaceBlock implements ISiriRequest {
	
	private IDDictionary dict;
	
	public RequestPlaceBlock() {
		dict = new IDDictionary();
	}
	
	@Override
	public void activate(Player player, String msg) {
		
		String[] words = msg.split(" ");
		
		World world = player.getWorld();
		
		Material mat = null;
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			try {
				
				mat = Material.valueOf(words[i].toUpperCase());
				break;
				
			} catch( Exception e ) {}
			
		}
		
		if( mat == null ) {
			
			Siri.sendSiriMessage(player, "I don't seem to understand... Maybe try agian?");
			return;
			
		}
		
		if( SiriUtil.containsWord(msg, "setblock") || SiriUtil.containsWord(msg, "set block") ) {
			
			if( SiriUtil.extractPosition(msg) != null ) {
				
				int[] pos = SiriUtil.extractPosition(msg);
				
				world.getBlockAt(pos[0], pos[1], pos[2]).setType(mat);
				
				Siri.sendSiriMessage(player, "Set " + pos[0] + " " + pos[1] + " " + pos[2] + " to " + mat.name());
				return;
				
			} else {
				
				Block b = player.getTargetBlock(null, 100);
				player.getTargetBlock(null, 100).setType(mat);
				
				Siri.sendSiriMessage(player, "Set " + b.getX() + " " + b.getY() + " " + b.getZ() + " to " + mat.name());
				return;
			}
			
		} else if(SiriUtil.containsWord(msg, "fill")) {
			
			int[] pos1 = SiriUtil.extractPosition(msg);
			int[] pos2 = SiriUtil.extractPosition(msg, 1);
			
			if( pos1 != null ) {
				
				if( pos2 == null ) {
					
					if( SiriUtil.containsWord(msg, "here") || SiriUtil.containsWord(msg, "my") ) {
						
						fill(player.getWorld(), player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ(), pos1[0], pos1[1], pos1[2], mat);
						
						Siri.sendSiriMessage(player, "Filled " + player.getLocation().getBlockX() + " " + player.getLocation().getBlockY() + " " + player.getLocation().getBlockZ() + " to " + pos1[0] + " " + pos1[1] + " " + pos1[2] + " with " + mat.name().toLowerCase());
						
					} else {
						
						Siri.sendSiriErrorMessage(player);
						return;
						
					}
					
				} else {
					
					fill(player.getWorld(), pos1[0], pos1[1], pos1[2], pos2[0], pos2[1], pos2[2], mat);
					
					Siri.sendSiriMessage(player, "Filled " + pos2[0] + " " + pos2[1] + " " + pos2[2] + " to " + pos1[0] + " " + pos1[1] + " " + pos1[2] + " with " + mat.name().toLowerCase());
					
				}
				
			} else {
				
				int[] dim = SiriUtil.extractCubeSize(msg);
				
				if( dim != null ) {
					
					fill(player.getWorld(), player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ(), player.getLocation().getBlockX() + dim[0], player.getLocation().getBlockY() + dim[1], player.getLocation().getBlockZ() + dim[2], mat);
					
					Siri.sendSiriMessage(player, "Filled " + player.getLocation().getBlockX() + " " + player.getLocation().getBlockY() + " " + player.getLocation().getBlockZ() + " to " + (player.getLocation().getBlockX() + dim[0]) + " " + (player.getLocation().getBlockY() + dim[1]) + " " + (player.getLocation().getBlockZ() + dim[2]) + " with " + mat.name().toLowerCase());
					
				} else {
					
					Siri.sendSiriErrorMessage(player);
					return;
					
				}
				
			}
			
			
		} else {
			
			if( SiriUtil.extractPosition(msg) != null ) {
				
				int[] pos = SiriUtil.extractPosition(msg);
				
				world.getBlockAt(pos[0], pos[1], pos[2]).setType(mat);
				
				Siri.sendSiriMessage(player, "Set " + pos[0] + " " + pos[1] + " " + pos[2] + " to " + mat.name());
				return;
				
			} else {
				
				Block b = player.getTargetBlock(null, 100);
				
				double subD = Math.sqrt( Math.pow(b.getX() - player.getLocation().getBlockX(), 2) + Math.pow(b.getZ() - player.getLocation().getBlockZ(), 2) );
				
				double d = Math.sqrt( Math.pow(subD, 2) + Math.pow(b.getY() - player.getLocation().getBlockY(), 2) );
				
				Block block = player.getTargetBlock(null, (int) d+1);
				
				player.getTargetBlock(null, (int) d-1).setType(mat);
				
				Siri.sendSiriMessage(player, "Set " + block.getX() + " " + block.getY() + " " + block.getZ() + " to " + mat.name());
				return;
				
			}
			
		}
		
	}

	@Override
	public String[] getVeriants() {
		String[] v = {"setblock", "set block", "place block", "place", "place a", "fill", "fill with"};
		return v;
	}

	@Override
	public String getDescription() {
		return "Place/Fill an area with some kind of block";
	}

	@Override
	public String getPermission() {
		return "msiri.request.build_block";
	}
	
	private void fill(World w, int x1, int y1, int z1, int x2, int y2, int z2, Material mat) {
		
		int dimX = x2 - x1;
		int dimY = y2 - y1;
		int dimZ = z2 - z1;
		
		for( int xP = 0 ; xP<dimX ; xP++ ) {
			
			for( int yP = 0 ; yP<dimY ; yP++ ) {
				
				for( int zP = 0 ; zP<dimZ ; zP++ ) {
					
					w.getBlockAt(x1 + xP, y1 + yP, z2 + zP).setType(mat);
					
				}
				
			}
			
		}
		
	}
	
}
