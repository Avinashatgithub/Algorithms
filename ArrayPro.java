package com.avi.test;

import java.util.HashMap;

public class ArrayPro {
	
	public static void main(String[] args) {
		int[] arr = {3,7,5,9,7,8,6,7,2,8,8,8};
		System.out.println(getMostFrequentNo(arr));
	}
	
	
	public static int getMostFrequentNo(int[] input) {
		HashMap<Integer,Integer> charMap = getCharMap(input);
		int key = 0;
		int value = 0;
		for (int k : charMap.keySet()) {
			if(charMap.get(k)>value){
				key = k;
				value = charMap.get(k);
			}
		}
		return key;
	}

	public static HashMap<Integer, Integer> getCharMap(int[] arg) {
		HashMap<Integer, Integer> charMap = new HashMap<>();
		for (int i = 0; i < arg.length; i++) {
			int key = arg[i];
			if (charMap.containsKey(key)) {
				charMap.put(key, charMap.get(key) + 1);
			} else {
				charMap.put(key, 1);
			}
		}
		return charMap;
	}
}