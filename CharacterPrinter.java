/*
 * This program is intended to write a method which takes a string composed of 
 * pair of alphabet(a-z , A-Z) followed by a number n (0<=n<=99) and print alphabet n times
 * as following examples.
 * 
 *  Eg. Input1 : c3d8A2
 *  	Output : cccddddddddAA 	//(c*3 + d*8 + A*2)
 *  
 *  	Input2 : a4b12c3
 *  	Output : aaaabbbbbbbbbbbbccc 	//(a*4 + b*12 + c*3)
 */

package com.test.avi;

public class CharacterPrinter {
	private static void printCharacters(String input) {
		char[] array = input.trim().toCharArray();
		char ch = '\u0000';
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("****************** i : "+i);
			System.out.println("------------");
			System.out.println("ch = "+ch+"\nn = "+n);
			System.out.println("------------");
			int cur = array[i];
			if (isAlphabet(cur)) {
				ch = array[i];
			} else if (isDigit(cur)) {
					do {
						n = n * 10 + Character.getNumericValue(cur);
						if(i<array.length-2){
							cur = array[++i];
							if(isAlphabet(cur)){
								i--;
							}
						}
					} while (isDigit(cur));
			}

			if (ch != '\u0000' && n != 0) {
				for (int j = 0; j < n; j++) {
					System.out.println((j+1)+" : "+ch);
				}
				ch = '\u0000';
				n = 0;
			}

		}

	}

	private static boolean isDigit(int cur) {
		return cur > 48 && cur <= 57;
	}

	private static boolean isAlphabet(int cur) {
		return (cur >= 65 && cur <= 90) || (cur >= 97 && cur <= 122);
	}

	public static void main(String[] args) {
		String input = "A14b3c11d8";
		System.out.println("Input : "+input);
		printCharacters(input);
	}
}