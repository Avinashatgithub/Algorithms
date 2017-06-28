package com.avi.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/*
 *  Two or more Strings are called Anagram if those all comprised of same characters.
 *  Example- (dog, god), (tea, eat, ate)...etc. 
 */
public class Anagram {
	/*
	 *  Write an algorithm to find total no of group of anagrams from a list of words.
	 *  For Example: 
	 *  	input:  {"tea","eat","java","apple","ate","cut","vaja","utc","tuc"};
	 *  	output: 4
	 *  
	 *  where, the four groups of anagrams from given input are: 
	 *  		{("tea","eat","ate"), ("java","vaja"), ("apple"), ("cut","utc","tuc")}
	 */
	public static int anagramGroupCount(String[] words){
		int len = words.length;
		HashSet<String> setOfWords = new HashSet<>();
		for(int i=0; i<len; i++){
			setOfWords.add(sortChars(words[i]));
		}
		return setOfWords.size();
	}
	
	/*
	 *  Returns a String in sorted order of given String's characters.
	 */
	private static String sortChars(String word){
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	/*
	 * Returns all possible groups of anagrams.
	 */
	public static String[] groupsOfAnagram(String[] words){
		// TO DO
		return null;
	}
	
	/*
	 * Check for two strings if those are Anagram.
	 */
	public static boolean isAnagram(String text1, String text2){
		text1 = text1.replace(" ","");
		text2 = text2.replace(" ","");
		
		if(text1.length()!=text2.length()){
			return false;
		}
		
		char[] chars1 = text1.toLowerCase().toCharArray();
		char[] chars2 = text2.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
			
		return  Arrays.equals(chars1, chars2);
	}
	
	//  T   E   S   T
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] words = {"tea","eat","java","apple","ate","cut","vaja","utc","tuc","vaaj","appel","raj","jar","avi","via"};
		System.out.println("No of group: "+anagramGroupCount(words));
		in.close();
	}
}