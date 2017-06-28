/*
 *  A word is said a magical word, if it consists of alphabets whose ASCII value is 
 *  a prime no.
 *  	Here we have to write an algorithm to convert any word to a magical word.
 *   i.e., replace the alphabet with non-prime ASCII value to a nearest alphabet with prime ASCII
 *   value. 
 *   	Note:- If there are two nearest alphabet with prime ASCII value, use alphabet
 *   of lower ASCII value.
 *   
 *   List of characters with prime ASCII code:-
 *   	UpperCase: C(67), G(71), I(73), O(79), S(83), Y(89)
 *   	LowerCase: a(97), e(101), g(103), k(107), m(109), q(113)
 *   	Digit	:	5(53)
 */

package com.hackerearth.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicalWords {

	public static void main(String[] args) throws IOException {
		System.out.println("List of characters with prime ASCII code:-\n"
				+ "\tUpperCase: C(67), G(71), I(73), O(79), S(83), Y(89)\n"
				+ "\tLowerCase: a(97), e(101), g(103), k(107), m(109), q(113)\n" + "\tDigit	:	5(53)");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your word: ");
		String input = in.readLine();
		long timeMillis = System.currentTimeMillis();
		String magical = makeMagical(input);
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("Your Input: " + input);
		System.out.println("Magical Word: " + magical);
		System.out.println("Total Calculation Time(in millis): " + (currentTimeMillis - timeMillis));
	}

	public static String makeMagical(String input) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("Either null or empty input error:");
		}
		StringBuffer magicalWord = new StringBuffer();
		if (isMagicalWord(input)) {
			System.out.println("Already magical");
			magicalWord.append(input);
		} else {
			String text = input; //.replace(" ", "");
			for (int i = 0; i < text.length(); i++) {
				char c = nearestPrimeChar(text.charAt(i));
				magicalWord.append(c);
			}
		}
		return magicalWord.toString();
	}

	/*
	 * This method is responsible to return nearest magical character.
	 */
	private static char nearestPrimeChar(char ch) {
		if (ch >= 65 && ch <= 90) {
			if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E') {
				ch = 'C';
			} else if (ch == 'F' || ch == 'G' || ch == 'H') {
				ch = 'G';
			} else if (ch == 'I' || ch == 'J' || ch == 'K' || ch == 'L') {
				ch = 'I';
			} else if (ch == 'M' || ch == 'N' || ch == 'O' || ch == 'P' || ch == 'Q') {
				ch = 'O';
			} else if (ch == 'R' || ch == 'S' || ch == 'T' || ch == 'U' || ch == 'V') {
				ch = 'S';
			} else {
				ch = 'Y';
			}
		} else if (ch >= 97 && ch <= 122) {
			if (ch == 'a' || ch == 'b' || ch == 'c') {
				ch = 'a';
			} else if (ch == 'd' || ch == 'e' || ch == 'f') {
				ch = 'e';
			} else if (ch == 'g' || ch == 'h' || ch == 'i') {
				ch = 'g';
			} else if (ch == 'j' || ch == 'k' || ch == 'l') {
				ch = 'k';
			} else if (ch == 'm' || ch == 'n' || ch == 'o') {
				ch = 'm';
			} else {
				ch = 'q';
			}
		} else if (ch >= 48 && ch <= 57) {
			ch = '5';
		}

		return ch;
	}

	/*
	 * Check whether a word in magical or not.
	 */
	public static boolean isMagicalWord(String input) {
		String text = input.replace(" ", "");
		boolean magical = true;
		for (int i = 0; i < text.length(); i++) {
			if (NumberUtil.isPrime(text.codePointAt(i)) == false) {
				magical = false;
			}
		}
		return magical;
	}
}
