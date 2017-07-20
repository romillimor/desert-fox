package com.rom.practice.algos;

import java.util.*;

public class StringOperators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input expression: ");
		String input = scan.nextLine();
		System.out.println("Total value of expression: " + evaluateExpression(input));

	}

	public static int evaluateExpression(String input) {

		int total = 0;
		ArrayList<String> arr = convertToArray(input);
		//System.out.println(arr);
		int tempVal;
		while (arr.indexOf("/") > -1) {
			int divIndex = arr.indexOf("/");
			tempVal = Integer.valueOf(arr.get(divIndex - 1)) / Integer.valueOf(arr.get(divIndex + 1));
			arr.set(divIndex - 1, Integer.toString(tempVal));
			arr.remove(divIndex);
			arr.remove(divIndex);
		}
		while (arr.indexOf("*") > -1) {
			int mulIndex = arr.indexOf("*");
			tempVal = Integer.valueOf(arr.get(mulIndex - 1)) * Integer.valueOf(arr.get(mulIndex + 1));
			arr.set(mulIndex - 1, Integer.toString(tempVal));
			arr.remove(mulIndex);
			arr.remove(mulIndex);
		}

		for (String s : arr) {
			total = total + Integer.valueOf(s);
		}
		return total;

	}

	public static boolean isNumeric(char ch) {
		if ((int) ch >= 48 && (int) ch <= 57)
			return true;
		else
			return false;
	}

	public static ArrayList<String> convertToArray(String input) {
		ArrayList<String> sarr = new ArrayList<String>();
		String seq = "";
		int i = 0;
		while (i < input.length()) {
			if (!isNumeric(input.charAt(i)) && seq != "") {
				sarr.add(seq);
				seq = "";
			}
			if (isNumeric(input.charAt(i)) || input.charAt(i) == '-') {
				seq = seq + input.charAt(i);
			}

			if (input.charAt(i) == '/' || input.charAt(i) == '*' ) {
				sarr.add(Character.toString(input.charAt(i)));
			}
			i++;
		}
		if (seq != "")
			sarr.add(seq);
		return sarr;
	}

}
