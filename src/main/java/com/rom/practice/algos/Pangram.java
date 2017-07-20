package com.rom.practice.algos;



public class Pangram {

	public static void main(String[] args) {
		String st = "Pack my box with five dozen liquor jugs";
		boolean isP = isPangram(st);
		System.out.print(isP);
		 
				
	}
	
	
	public static boolean isPangram(String str) {
		
		
		str = str.toLowerCase();
		boolean flag = true;
		char[] alph = new char[26];
		char letter = 'a';
		for (int i = 0; i < 26; i++) {
			alph[i] = letter;
			letter++;
		}
		
		
		for (int j = 0; j < 26; j++) {
			if (str.indexOf(alph[j]) < 0 ) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
}
	
	
	
	