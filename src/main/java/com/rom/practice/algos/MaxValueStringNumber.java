package com.rom.practice.algos;

import java.util.Scanner;

public class MaxValueStringNumber {

	
		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter number value: ");
			String num = scan.next();
			
		
			int sum = 0;
			int product = 1;
			
			for (int i = 0; i < num.length(); i++ ) {
				
				sum = sum + Character.getNumericValue(num.charAt(i));
				product = product * Character.getNumericValue(num.charAt(i));
			}
			
			
			if(sum >= product) System.out.println("Max value is sum: " + sum);
			else System.out.println("Max value is product: " + product);
			
		}
}
