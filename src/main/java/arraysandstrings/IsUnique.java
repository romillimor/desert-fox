package arraysandstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Character are unique " + isUnique(input));

	}

	public static boolean isUnique(String input) {
		boolean result = true;
		ArrayList<Character> check = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (check.contains(input.charAt(i))) {
				result = false;
				break;

			} else {
				check.add(input.charAt(i));
			}
		}
		return result;

	}
}
