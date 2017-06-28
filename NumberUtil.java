package com.hackerearth.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberUtil {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Minimum range: ");
		int min = in.nextInt();
		System.out.print("Maximum range: ");
		int max = in.nextInt();
		showPrimesInRange(min, max);
		
		
		in.close();
	}

	// display all primes in range
	public static void showPrimesInRange(int min, int max) {
		ArrayList<Integer> primes = primesInRange(min, max);
		System.out.println("List of prime number: "+primes.size());
		for (int i : primes) {
			System.out.print(i + "\t");
		}
	}

	/*
	 * Return all primes between two given numbers.
	 */
	public static ArrayList<Integer> primesInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Enter valid 'Min' and 'Max' value: ");
		}
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	/*
	 * Check if a number is a prime number.
	 */
	public static boolean isPrime(int num) {
		if(num==1){
			return false;
		}
		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0 ) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
