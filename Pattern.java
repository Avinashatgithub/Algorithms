package com.test.avi;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter height of Pattern(1-99): ");
		Pattern.firstPattern(in.nextInt());
		in.close();
		
	}

	/*
	 *  Write a method to form a pattern like below:-
	 *  	0000000
	 *  	0100000
	 *  	0020000
	 *  	0003000
	 *  	0000400
	 *  	0000050
	 *  	0000006
	 */
	public static void firstPattern(int height){
		for(int i=0; i<=height; i++){
			for(int j=0; j<=((height>=10 && i<=9) ? height+1 : height); j++){
				try {
					Thread.sleep(1);
					if(i==j)
						System.out.print(j);
					else
						System.out.print(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
}
