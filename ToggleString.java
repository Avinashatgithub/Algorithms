/*
 * You have been given a String 'S'.
'S' consisting of uppercase and lowercase English alphabets. 
You need to change the case of each alphabet in this String. 
That is, all the uppercase letters should be converted to lowercase and 
all the lowercase letters should be converted to uppercase. 
You need to then print the resultant String to output.
 */

package com.hackerearth.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your inputS string: ");
		String name = in.readLine();
		System.out.println("Original Name: "+name);
		long timeMillis = System.currentTimeMillis();
		System.out.println("After Toggling: "+toggleString(name));
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("Total time exhausted: "+(currentTimeMillis - timeMillis)+" millis");
	}
	
	public static String toggleString(String input){
		int length = input.length();
		char[] chars = new char[length];
		for(int i=0; i<length; i++){
			int c = input.charAt(i);
			if(c>=65 && c<=90){
				chars[i] = (char) (c+32);
			}else if(c>=97 && c<=122){
				chars[i] = (char) (c-32);
			}else{
				chars[i] = (char) c;
			}
		}
		return new String(chars);
	}
}
