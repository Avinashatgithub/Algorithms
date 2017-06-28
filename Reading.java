package com.test.avi;


public class Reading {
	
	public static void main(String[] args) {
		/*int digits[] = {5,0,3,4,2,8,0,1};
		System.out.println("Digits: ");display(digits);
		System.out.println("Number: "+read(digits));
		System.out.println("Number from 3: "+readFrom(digits, 3));*/
		
		String string = "avi254k31jr7";
		
		String str = "102154";
		System.out.println("String is: "+str+"\tNumber is : "+ read(str));
		System.out.println("String is: "+str+"\tNumber is : "+ readFrom(str,3));
	}
	
	
	// write a method to read int[] digits = {1,5,3,9,3}; and return the number like, 15393
	public static int read(int[] digits){
		int num = 0;
		int i = 0;
		while(i<digits.length){
			int digit = digits[i];
			num = num * 10 + digit;
			i++;
		}
		return num;
	}
	
	public static long read(String str){
		char[] chars = str.trim().toCharArray();
		long num = 0;
		int i = 0;
		while(i<chars.length){
			int digit = Character.getNumericValue(chars[i]);
			num = num * 10 +digit;
			i++;
		}
		
		return num;
	}
	
	public static long readFrom(String str,int i){
		char[] chars = str.trim().toCharArray();
		long num = 0;
		while(i<chars.length){
			int digit = Character.getNumericValue(chars[i]);
			num = num * 10 +digit;
			i++;
		}
		
		return num;
	}
	
	public static int readFrom(int[] digits, int j){
		int num = 0;
		int i = j;
		while(i<digits.length){
			int digit = digits[i];
			num = num * 10 + digit;
			i++;
		}
		return num;
	}
	
	private static void display(int[] digits){
		for (int o : digits) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
}
