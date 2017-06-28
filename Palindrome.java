import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		// Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string: ");
		String input = in.readLine();

		long timeMillis = System.currentTimeMillis();
		boolean result = isPalindromePossibleOnRearrangement(input);
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(input + " is palindrome: " + result);
		System.out.println("Total time invested: " + (int) (currentTimeMillis - timeMillis)+" millis.");

		long timeMillis2 = System.currentTimeMillis();
		boolean possibility = checkPalindromPossibility(input);
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println("is palindrom using counter: " + possibility);
		System.out.println("Total time invested: " + (int) (currentTimeMillis2 - timeMillis2));

		long timeMillis3 = System.currentTimeMillis();
		Set<String> permutation = getUniqueOfPermutation(input);
		long currentTimeMillis3 = System.currentTimeMillis();
		System.out.println("Total exhausted time in millis to calculate: " + (currentTimeMillis3 - timeMillis3));
		System.out.println("Total permutations:- " + permutation.size());
		
		for (String string : permutation) {
			System.out.print(string + "\t");
		}
	}

	/*
	 * Test whether input String is a Palindrome. return true for possible
	 * palindrome otherwise false.
	 */
	public static boolean isPalindrome(String input) {
		input = input.toLowerCase().replace(" ", "");
		char[] cs = input.toCharArray();
		int l = cs.length;
		int loop = l % 2 == 0 ? l / 2 - 1 : l / 2;
		boolean result = true;
		for (int i = 0; i <= loop; i++) {
			if (cs[i] != cs[l - (i + 1)]) {
				result = false;
				break;
			}
		}
		return result;
	}

	/*
	 * Test whether input number is a palindrome. return true for possible
	 * palindrome otherwise false.
	 */
	public static boolean isPalindrome(Long input) {
		return isPalindrome(input.toString());
	}

	/*
	 * Verify that given string contains palindrome on any rearrangement of it's
	 * characters. Eg. "damma" is possible palindrome on an arrangement of
	 * "madam". Return 1 if possible otherwise -1
	 */
	public static boolean isPalindromePossibleOnRearrangement(String input) {
		int length = input.length();
		boolean result = false;
		if (isPalindrome(input)) {
			result = true;
		} else {
			for (int i = 1; i < length - 1; i++) {
				input = input.substring(1).concat(input.charAt(0) + "");
				if (isPalindrome(input)) {
					result = true;
					System.out.println("Palindrom sequence: " + input);
					break;
				}
			}
		}
		return result;
	}

	/*
	 * checks only the possibility to arrange as Palindrome but cannot tell
	 * which of the combinations are Palindrome. Returns true if possible
	 * otherwise false.
	 */
	public static boolean checkPalindromPossibility(String arg) {
		// get charmap of input string
		HashMap<Character, Integer> charMap = getCharMap(arg);
		int count = 0;
		for (Integer value : charMap.values()) {
			if (value % 2 != 0)
				count++;
		}
		return count == 0 || count == 1 ? true : false;
	}

	/*
	 * prepare a map of Charactere as key and Integer as occurences of a
	 * character in given String, and return the map.
	 */
	public static HashMap<Character, Integer> getCharMap(String arg) {
		String input = arg.replace(" ", "").toLowerCase();
		HashMap<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char key = input.charAt(i);
			if (charMap.containsKey(key)) {
				charMap.put(key, charMap.get(key) + 1);
			} else {
				charMap.put(key, 1);
			}
		}
		return charMap;
	}

	public static Set<String> getUniqueOfPermutation(String input) {
		return new HashSet<String>(Palindrome.permutation(input));
	}

	public static List<String> permutation(String input) {
		return permutation("", input);

	}

	private static List<String> permutations = new ArrayList<>();

	private static List<String> permutation(String perm, String word) {

		if (word.isEmpty()) {
			// System.err.print(perm + "\t");
			permutations.add(perm);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
		return permutations;
	}

	/*
	 * private static void permutation(String perm, String word) { if
	 * (word.isEmpty()) { System.err.println(perm + word);
	 * 
	 * } else { for (int noMore = 0; noMore <= 1; noMore++) { if (noMore == 0) {
	 * for (int i = 0; i < word.length(); i++) { permutation(perm +
	 * word.charAt(i), word.substring(i + 1, word.length())); } } else {
	 * permutation(perm, ""); } } }}
	 */
}
