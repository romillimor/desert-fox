package sortingalgos;

import java.util.Arrays;

public class Sort {

	public static void InsertionSort(int[] a) {

	for (int i=1; i< a.length; i++) {

		int key = a[i];
		int j = i;
		
		do {
		 if (key < a[j-1]) {
		 	a[j] = a[j-1];
		 	a[j-1] = key;
		 }
		 	j--;
		} while (j > 0); 


	}
	}
	
	public static void main(String args[]) {
		int[] arr = {9,3,2,4,7,0};
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
