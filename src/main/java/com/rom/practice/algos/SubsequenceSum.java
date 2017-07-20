package com.rom.practice.algos;

public class SubsequenceSum {

	
	public static void main(String[] args) {
	
	int[] arr = {1, 3 -3, 21, -21, 2, 9, 11, -9};
	int sum = 0;
	for(int i = 0; i < arr.length-1; i++) {
		sum = sum + arr[i];
		
		for(int j = i + 1; j < arr.length; j++) {
			
			sum = sum + arr[j];
			if (sum == 0) System.out.println(arr[i] + ", " + arr[j] );
			
		}
	}
	
}
}
