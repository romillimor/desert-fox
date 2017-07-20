package arraysandstrings;

import java.util.Scanner;

public class StringCompression {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input = scan.next().toLowerCase();
		StringBuilder str = new StringBuilder();
		int c = 1;
		
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i-1)) {
				c++;
				
			} else {
				str.append(input.charAt(i-1));
				str.append(c);
				c=1;
			}
			if (i == input.length()-1) { 
				str.append(input.charAt(i));
				str.append(c);
			}
		}
		
		if (input.length() == str.length()) System.out.println(input);
		else System.out.println(str.toString());
		
	}
}


//aaabbbccddaa
//a3b3c2d2a2