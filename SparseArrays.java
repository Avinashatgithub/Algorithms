
/*
 * For Details of this program follow the link:-
 * https://www.hackerrank.com/challenges/sparse-arrays
 */

package com.hackerearth.basic;

import java.util.Scanner;

public class SparseArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfWords = in.nextInt();
		String[] words = new String[noOfWords];
		for(int i=0; i<noOfWords; i++){
			words[i] = in.next();
		}
		
		int noOfQueries = in.nextInt();
		while(noOfQueries>0){
			String query = in.next();
			System.out.println(findOccurance(words, query));
			noOfQueries--;
		}
		in.close();
	}

	private static int findOccurance(String[] words, String query) {
		int count = 0;
		for (String word : words) {
			int wordLen = word.length();
			int queryLen = query.length();
			if(wordLen >= queryLen){
				for(int i = 0; i < (wordLen - queryLen + 1); i++){
					boolean flag = true;
					for(int j=0; j<queryLen; j++){
						if(!(word.charAt(i+j) == query.charAt(j))){
							flag = false;
							break;
						}
					}
					if(flag == true){
						count++;
					}
				}
			}
		}
		return count;
	}
}