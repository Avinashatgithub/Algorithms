/*
 * Write a program to split odd and even integer from given array.
 */

package com.avi.test;

import java.util.ArrayList;
import java.util.Iterator;

public class SplitEvenOddList {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(5);
		numList.add(15);
		numList.add(14);
		numList.add(18);
		numList.add(19);
		numList.add(24);
		numList.add(41);

		
		Iterator<Integer> iterator = numList.iterator();
		ArrayList<Integer> oddList = new ArrayList<>();
		ArrayList<Integer> evenList = new ArrayList<>();
		
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num % 2 == 0) {
				evenList.add(num);
			}else{
				oddList.add(num);
			}
		}
		
		System.out.println("Number List: "+numList);
		System.out.println("Even List: "+evenList);
		System.out.println("Odd List: "+oddList);
	}
}
