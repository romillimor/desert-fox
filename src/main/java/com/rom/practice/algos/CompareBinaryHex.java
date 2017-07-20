package com.rom.practice.algos;

import java.util.Scanner;

public class CompareBinaryHex {

	public static int convertToDecFromBinary(String binary) {

		char[] bin = binary.toCharArray();
		int ind = bin.length - 1;
		int sum = 0;
		for (int i = 0; i < bin.length; i++) {
			sum = sum + (int) (Character.getNumericValue(bin[i]) * Math.pow(2, ind));
			ind--;
		}

		return sum;
	}

	public static int convertToDecFromHex(String hex) {
		
		char[] h = hex.toCharArray();
		int ind = h.length - 1;
		int sum = 0;
		for (int i = 0; i < h.length; i++) {
			sum = sum + (int)(getNumFromHexChar(h[i]) * Math.pow(16, ind));
			ind--;
		}

		return sum;
	}

	public static int getNumFromHexChar(char h) {
		int num = 0;
		switch (h) {
		case 'A':
			num = 10;
			break;

		case 'B':
			num = 11;
			break;

		case 'C':
			num = 12;
			break;

		case 'D':
			num = 13;
			break;

		case 'E':
			num = 14;
			break;

		case 'F':
			num = 15;
			break;
		default : num = Character.getNumericValue(h);
			break;

		}
		return num;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter hexadecimal number: ");
		String hexa = scan.next();
		System.out.println("Enter binary number: ");
		String binary = scan.next();
		
		boolean result  = false;
		if (convertToDecFromBinary(binary) == convertToDecFromHex(hexa)) result = true;
		else result = false;
		System.out.println(result);
		
	}

}
