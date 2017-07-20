package com.rom.practice.algos;

public class DiffinArray {

	
	public static void main(String[] args) {
		
		int[] arr = { -21, -23, 56, -23, 111, 221, 223, 12, -1, 1};
		
		for (int i=0; i < arr.length-1; i++) {
			
			for (int j=i+1; j< arr.length; j++ ) {
				
				if (Math.abs(arr[i] - arr[j]) == 2) {
					System.out.println("Pairs with difference 2 are: " + arr[i] + " & " + arr[j]);
				}
			}
		}
		
		
	}
	
}
