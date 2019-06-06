package com.command.il.siri.request;

import java.util.ArrayList;
import java.util.HashMap;

public class RequestHandler {
	
	private static final String[] IRALEVENT_WORDS = {"the", "is", "it", "he", "she", "they", "i", "me", "to", "for", "from", "and"};
	
	public ArrayList<ISiriRequest> requests;
	
	public RequestHandler() {
		
		requests = new ArrayList<>();
		
	}
	
	public void registerRequest(ISiriRequest request) {
		
		requests.add(request);
		
	}
	
	public ISiriRequest DecriptMassage(String msg) {
		
		HashMap<ISiriRequest, Integer> chances = new HashMap<>();
		
		for( ISiriRequest r : requests ) {
			
			String[] vs = r.getVeriants();
			
			int chance = 0;
			
			for( int i = 0 ; i<vs.length ; i++ ) {
				
				int sim = similarity(vs[i], msg);
				
				if( sim > chance && sim >= ((double)stripToKeywords(vs[i]).length)/(double)2 ) chance = sim;
				
			}
			
			if(chance > 0) chances.put(r, chance);
			
		}
		
		ISiriRequest winner = null;
		
		for( ISiriRequest r : chances.keySet() ) {
			
			if( winner == null ) winner = r;
			else if( chances.get(r) > chances.get(winner) ) winner = r;
			
		}
		
		return winner;
		
	}
	
	private int similarity(String a1, String a2) {
		
		int sim = 0;
		
		String[] a1Words = stripToKeywords(a1);
		String[] a2Words = stripToKeywords(a2);
		
		for( int i = 0 ; i<a1Words.length ; i++ ) {
			
			for( int ii = 0 ; ii<a2Words.length ; ii++ ) {
				
				if( a1Words[i].toLowerCase().equals(a2Words[ii].toLowerCase()) ) {
					
					sim += 1;
					break;
					
				}
				
			}
			
		}
		
		return sim;
		
	}
	
	private String[] stripToKeywords(String msg) {
		
		String newMsg = msg;
		
		for( int i = 0 ; i<IRALEVENT_WORDS.length ; i++ ) {
			
			newMsg = newMsg.replace(" "+IRALEVENT_WORDS[i]+" ", " ");
			
		}
		
		String[] keywords = newMsg.split(" ");
		
		return keywords;
		
	}
	
}
