package arraysandstrings;

import java.util.*;

public class PalindromePermutation {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = scan.nextLine();
		s = s.replace(" ", "").toLowerCase();
		boolean result = true;
		HashMap<Character, Integer> smap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (smap.containsKey(s.charAt(i))) {
				int v = smap.get(s.charAt(i));
				smap.replace(s.charAt(i), v + 1);
			} else {
				smap.put(s.charAt(i), 1);
			}
		}
		int cntOdd = 0;
		if (s.length() % 2 != 0) {
			for (Integer v : smap.values()) {
				if (v % 2 != 0) {
					cntOdd++;
				}
			}
			if (cntOdd > 1) {
				result = false;
			}
		} else {
			for (Integer v : smap.values()) {
				if (v % 2 != 0) {
					result = false;
					break;
				}
			}
		}
		
	System.out.println("Is Palindrome Permutation? : " + result);

	}
}
