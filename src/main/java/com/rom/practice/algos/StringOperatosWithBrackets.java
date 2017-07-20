package com.rom.practice.algos;

import java.util.*;

public class StringOperatosWithBrackets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input expression: ");
		String input = scan.nextLine();
		System.out.println("Total value of expression: " + evaluateExp(input));

		// ((-32+5*3)*4)+(1150/(200-90))

	}

	public static int evaluateExp(String input) {

		StringBuilder str = new StringBuilder(input);
		int total;
		while (str.indexOf("(") > -1 && str.indexOf(")") > -1) {

			int startIndex = str.lastIndexOf("(");
			int endIndex = startIndex;

			while (endIndex < str.length() - 1) {
				if (str.charAt(endIndex) == ')') {
					break;
				} else
					endIndex++;
			}
			int subSeq = StringOperators.evaluateExpression(str.substring(startIndex, endIndex));
			str.replace(startIndex, endIndex + 1, Integer.toString(subSeq));

		}

		total = StringOperators.evaluateExpression(str.toString());
		return total;

	}

}
