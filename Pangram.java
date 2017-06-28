/*
 * According to wikipedia,
 * A Pangram or holoalphabetic sentence for a given alphabet is a sentence 
 * using every letter of the alphabet at least once.
 * Examples:-
 * 		The quick brown fox jumps over the lazy dog.
 * 		Pack my box with five dozen liquor jugs.
 * 		Jackdaws love my big sphinx of quartz.
 * 		The five boxing wizards jump quickly.
 * 		How vexingly quick daft zebras jump!
 * 		Bright vixens jump; dozy fowl quack.
 */

package com.avi.test;

import java.util.HashSet;

public class Pangram {
	
	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog @Avinash#JavaDeveloper";
		System.out.println(isPangram(input));
	}
	
	
	
	
	public static boolean isPangram(String sentance){
		String input = sentance.replaceAll("[^a-zA-Z]", "");
		if(input.length()<26){
			return false;
		}
		char[] cs = input.toLowerCase().toCharArray();
		HashSet<Character> charSet = new HashSet<>();
		for(int i=0; i<cs.length; i++){
			charSet.add(cs[i]);
		}
		System.out.println(charSet.size());
		return charSet.size()>=26 ? true : false;
	}
}
