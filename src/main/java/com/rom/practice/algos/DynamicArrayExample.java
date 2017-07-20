package com.rom.practice.algos;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayExample {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan  =  new Scanner(System.in);
	        int n = scan.nextInt();
	        int d = scan.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scan.nextInt();
	        }
	        
	        while (d > 0) {
	            int[] b = new int[n];
	            for (int j = n-1; j > 0; j--) {
	                b[n-1] = a[0];
	                b[j-1] = a[j];
	            }
	            a = Arrays.copyOf(b, n);
	            d--;
	            
	        }
	        
	        for (int k = 0; k< a.length; k++) {
	            System.out.print(a[k]);
	            System.out.print(" "); 
	            }
	    }
}
