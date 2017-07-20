package arraysandstrings;

import java.util.Arrays;
import java.util.Scanner;

public class NxNMatrix {
	
	
	public static void main(String[] args) {
		int[][] mat = new int[][]{
			  { 1,2,3,4},
			  { 5,6,7,8},
			  { 9,10,11,12},
			  {13,14,15,16 }
			  };
			
		int[][] output = rotateMatrixClock(mat);
		System.out.println(Arrays.deepToString(output));
		
		}
	
	public static int[][] rotateMatrixClock(int[][] input) {
		int[][] newmat = new int[4][4];
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				newmat[r][c] = input[c][r];
			}
		
		}
		
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				input[r][c] = newmat[r][3-c];
			}
		}
		return input;
	}
	
}
