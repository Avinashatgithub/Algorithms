package com.hackerearth.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgorithmCrush {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer capacity = in.nextInt();
		int operations = in.nextInt();

		List<Long> list = new ArrayList<>(capacity);

		while (operations-- > 0) {
			int firstIndex = in.nextInt();
			int lastIndex = in.nextInt();
			Long num = in.nextLong();
			for (int i = firstIndex - 1; i <= lastIndex - 1; i++) {
				list.set(i, list.get(i)+num);
			}
		}
		
		in.close();
		// finding the maximum number of the final list
		long max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		System.out.println("Max = "+max);
	}
}
