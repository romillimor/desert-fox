package arraysandstrings;

import java.util.Scanner;

public class StringRotation {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String a = scan.next();
		System.out.print("Enter second string: ");
		String b = scan.next();
		StringBuilder str = new StringBuilder();
		boolean res = true;
		
		for (int i = b.length()-1; i >=0; i--) {
			if(!a.contains(b.substring(i, b.length()))){
				str.append(b.substring(i+1));
				str.append(b.substring(0, i+1));
				System.out.println(str.toString());
				break;
			}
		}
		
		if (!a.equals(str.toString())) {
			res = false;
		}
		
		System.out.print("1 String rotation of other? :  " + res);
	}
	
	
	
}
