package com.rom.practice.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input value: ");
		int input = scan.nextInt();
		scan.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int div = 2;
		int q = input;
		int i = 0;
		int rem = 0;

		while (div <= Math.abs(q)) {
			rem = q % div;
			if (rem != 0)
				div++;
			else {
				q = q / div;
				arr.add(i, div);
				i++;
			}
		}
		
		System.out.print("Prime factors are: " + arr.toString());
	}
}
