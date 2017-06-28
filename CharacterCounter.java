package com.test.avi;

public class CharacterCounter {
	public static void main(String[] args) {

		String str = "sdf578asddf%$#jlkdf09";
		System.out.println("String : " + str);
		countChars(str);
		
	}

	public static void countChars(String input) {
		int digits = 0;
		int alph = 0;
		int special = 0;

		char[] chars = input.toCharArray();
		for (char c : chars) {
			if (isDigit(c))
				digits++;
			else if (isAlphabet(c))
				alph++;
			else if (isSpecialChar(c))
				special++;
		}

		System.out.println("\nDigits : " + digits + "\nAlphabets : " + alph + "\nSpecial : " + special);
	}

	private static boolean isDigit(char c) {
		return c >= 48 && c <= 57;
	}

	private static boolean isAlphabet(char c) {
		return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
	}

	private static boolean isSpecialChar(char c) {
		return !isDigit(c) && !isAlphabet(c);
	}

}
