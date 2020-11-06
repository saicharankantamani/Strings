package com.java.arraya;

import java.util.Scanner;

public class Exercise_02B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		System.out.println("Enter the multiples range");
		int mul =sc.nextInt();
		for (int i = 0; i <= mul; i++) {
			System.out.println(num+ "*" +i+ "="+ num*i);
			
		}

	}

}
