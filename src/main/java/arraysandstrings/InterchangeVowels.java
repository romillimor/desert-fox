package arraysandstrings;

import java.util.*;

/*java program to interchage continous vowels in a string 
ex:vowels 
becomes vewols 
continuous becomes cintonouus*/


public class InterchangeVowels {
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input = scan.nextLine();
		StringBuilder str = new StringBuilder(input);
		ArrayList<Character> vow = new ArrayList<Character>();
		vow.add('a');
		vow.add('e');
		vow.add('i');
		vow.add('o');
		vow.add('u');
		char tempChar = 0;
		int tempIndex = 0;
		int freeze = 0;
		 
		for (int i = 0; i < input.length(); i++) {
			if (vow.indexOf(str.charAt(i)) > -1 && freeze == 0) {
				tempChar = str.charAt(i);
				tempIndex = i;
				freeze = 1;
			}
			else if (vow.indexOf(str.charAt(i)) > -1 && freeze == 1) {
				str.setCharAt(tempIndex, str.charAt(i));
				str.setCharAt(i, tempChar);
				freeze = 0;
			}
					
		}
		System.out.println(str.toString());

		
		
	}
	
}
