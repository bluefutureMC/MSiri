package com.command.il.siri;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SiriUtil {
	
	public static boolean containsWord(String string, String word) {
		
		boolean con = false;
		
		String[] words = string.split(" ");
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			if( words[i].equalsIgnoreCase(word.toLowerCase()) ) {
				con = true;
				break;
			}
			
		}
		
		return con;
		
	}
	
	public static String piece(String msg, String spliter, int place) {
		
		String[] words = msg.split(spliter);
		
		if( place-1 > words.length ) return null;
		
		return words[place];
		
	}
	
	public static int findPlace(String[] list, String word) {
		
		for( int i = 0 ; i<list.length ; i++ ) {
			
			if( list[i].equals(word) ) return i;
			
		}
		
		return -1;
		
	}
	
	public static int[] extractPosition(String msg) {
		
		int[] pos = null;
		
		String[] words = msg.split(" ");
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			if( i + 3 >= words.length ) break;
			
			pos = new int[3];
			
			String wordX = words[i].replace(",", "").replace(".", "");
			String wordY = words[i+1].replace(",", "").replace(".", "");
			String wordZ = words[i+2].replace(",", "").replace(".", "");
			
			try {
				
				pos[0] = Integer.parseInt(wordX);
				pos[1] = Integer.parseInt(wordY);
				pos[2] = Integer.parseInt(wordZ);
				
				break;
				
			} catch(Exception e) {
				
				pos = null;
				continue;
				
			}
			
		}
		
		return pos;
		
	}
	
	public static int[] extractPosition(String msg, int index) {
		
		int[] pos = null;
		
		String newMsg = msg;
		
		for( int i = 0 ; i<index ; i++ ) {
			
			int[] subPos = extractPosition(newMsg);
			
			if( subPos == null ) return null;
			
			newMsg = newMsg.replace(subPos[0] + " " + subPos[1] + " " + subPos[2], "");
			
		}
		
		pos = extractPosition(newMsg);
		
		return pos;
		
	}
	
	public static Player extractPlayer(JavaPlugin pl, String msg) {
		
		Player player = null;
		
		String[] words = msg.split(" ");
		
		for( int i = 0 ; i<words.length ; i++ ) {
			
			player = pl.getServer().getPlayer(words[i]);
			
			if( player != null ) break;
			
		}
		
		return player;
		
	}
	
	public static int[] extractCubeSize(String msg) {
		
		int[] dim = null;
		String[] words = msg.split(" ");
		
		for( int i = 0 ; i<words.length-4 ; i++ ) {
			
			try {
				
				if( words[i+1].equalsIgnoreCase("by") && words[i+3].equalsIgnoreCase("by") ) {
					
					dim = new int[3];
					
					dim[0] = Integer.parseInt(words[i]);
					dim[1] = Integer.parseInt(words[i+2]);
					dim[2] = Integer.parseInt(words[i+4]);
					
					break;
					
				}
				
			} catch(Exception e) {
				dim = null;
			}
			
		}
		
		return dim;
		
	}
	
}
