package com.rom.practice.algos;

import java.util.Arrays;

public class ArraySwap {
	
	public static void main(String args[]) {
		
		int[] arr = {-1,0, 0, 8, 16/2};
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) maxIndex = i;
			else if(arr[i] < arr[minIndex]) minIndex = i;
		}
		
		int c = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = c;
		
		System.out.println("Swapped array: " + Arrays.toString(arr));
	}
		

}
