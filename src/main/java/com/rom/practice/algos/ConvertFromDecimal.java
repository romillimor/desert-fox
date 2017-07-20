package com.rom.practice.algos;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertFromDecimal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integer value: ");
		int input = 0, conv = 0;
		try {
			input = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter an Integer value!");
		}
		System.out.print("Enter conversion value: ");
		conv = scan.nextInt();
		scan.close();
		convertFromDecimal(input, conv);

	}

	public static void convertFromDecimal(int input, int conv) {
		int decimal = Math.abs(input);
		ArrayList<Character> arr = new ArrayList<Character>();
		int q = decimal;
		int rem;
		int i = 0;
		while (q > 0) {
			rem = q % conv;
			q = q / conv;
			if (conv == 16 && rem > 9) {
				arr.add(i, getHexFromNum(rem));
			} else
				arr.add(i, Character.forDigit(rem, 10));
			i++;
		}

		String result = "";
		for (int j = arr.size() - 1; j >= 0; j--) {
			result = result + arr.get(j);
		}

		if (input > 0) {
			System.out.println("Conversion is: " + result);
		}

		else if (input == 0) {
			System.out.println("Conversion is: 0");
		}

		else if (input < 0) {
			System.out.println("Conversion is: -" + result);
		}
	}

	public static char getHexFromNum(int num) {
		char hex = 0;
		switch (num) {
		case 10:
			hex = 'A';
			break;

		case 11:
			hex = 'B';
			break;

		case 12:
			hex = 'C';
			break;

		case 13:
			hex = 'D';
			break;

		case 14:
			hex = 'E';
			break;

		case 15:
			hex = 'F';
			break;

		}
		return hex;

	}

}
