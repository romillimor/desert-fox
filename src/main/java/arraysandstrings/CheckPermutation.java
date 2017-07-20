package arraysandstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String a = scan.nextLine();
		System.out.print("Enter second string: ");
		String b = scan.nextLine();
		System.out.println("Are these permutation? " + isPermutation(a, b));
	}

	public static boolean isPermutation(String a, String b) {
		ArrayList<Character> alist = converToArrayList(a);
		ArrayList<Character> blist = converToArrayList(b);
		boolean result = true;
		if (alist.size() != blist.size()) {
			result = false;
		} else {
			for (int i = 0; i < alist.size(); i++) {
				if (!(blist.contains(alist.get(i)))) {
					result = false;
					break;
				} else {
					blist.remove(alist.get(i));
				}
			}
		}
		return result;
	}

	public static ArrayList<Character> converToArrayList(String input) {
		ArrayList<Character> arrlist = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			arrlist.add(input.charAt(i));
		}
		return arrlist;
	}

}