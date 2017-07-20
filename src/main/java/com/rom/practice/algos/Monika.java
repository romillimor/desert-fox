package com.rom.practice.algos;

import javax.naming.CommunicationException;

public class Monika {
	
	public static void main(String[] args) {
		
		String a = "aauunsunasunssssst";
		String b = "";
		char t;
		int count=0;
		int l = a.length();
		
		t= a.charAt(0);
		//b= Character.toString(a.charAt(0));
		
		for (int i=0;i<l;i++){
			if (t== a.charAt(i)){
				count++;
			}
			else{
				b= b + Character.toString(t) + count;
				t=a.charAt(i);
				count=1;
				}
		}
		b= b + Character.toString(t) + count;
		System.out.println(b);
		}
		
	
		
}