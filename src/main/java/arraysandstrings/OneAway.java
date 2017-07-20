package arraysandstrings;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String a = scan.nextLine();
		System.out.print("Enter second string: ");
		String b = scan.nextLine();
		int editCount = 0;
		boolean res = true;

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i))
					editCount++;
				if (editCount > 1)
					res = false;
			}
		} else if (Math.abs(a.length() - b.length()) > 1)
			res = false;
		else if (Math.abs(a.length() - b.length()) == 1) {
			int j = 0;
			if (a.length() > b.length()) {
				for (int i = 0; i < b.length(); i++) {
					if (a.charAt(i) == b.charAt(j)) {
						j++;
					} else
						editCount++;
				}
				if (editCount > 1)
					res = false;
			} else if (a.length() < b.length()) {
				for (int i = 0; i < a.length(); i++) {
					if (b.charAt(i) == a.charAt(j)) {
						j++;
					} else
						editCount++;
				}
				if (editCount > 1)
					res = false;
			}
		}
		System.out.println("Strings are zero or one edit away? : " + res);
	}

}
