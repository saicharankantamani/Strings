package com.strings.practise;

import java.util.Scanner;

public class Exercise1_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String a = sc.next().toUpperCase();
		System.out.println(a.length());
		
	    for (int i = 0; i < a.length(); i++) {
	    	
	    	if(i%2!=0)
	    	{
	    		System.out.println(a.charAt(i));
	    	}
			
		}

	}

}
