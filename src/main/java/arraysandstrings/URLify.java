package arraysandstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class URLify {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string URL: ");
		String input = scan.nextLine();
		System.out.print("Enter actual length: ");
		int length = scan.nextInt();
		System.out.println("Return URL is: " + convertURL(input, length));
		String output = input.replace(" ", "%20");
		System.out.print(output);
	}
	
	
	public static String convertURL(String input, int length) {
		String output = "";
		ArrayList<Character> arr = new ArrayList<Character>();
		for (int i = 0; i < length; i++) {
			if(input.charAt(i) == ' ') {
			arr.add('%');
			arr.add('2');
			arr.add('0');
			} else {
				arr.add(input.charAt(i));
			}
		}
		 for (Character c : arr) {
			 output = output + c;
		 }
		 
		 return output;
		
	}
	
}
