package com.strings.practise;

import java.util.Scanner;

public class Exercise1_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = sc.next().toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			if(i%2 != 0)
			{
				System.out.print(s.charAt(i));
			}
			
		}

	}

}
