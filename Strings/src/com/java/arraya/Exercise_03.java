package com.java.arraya;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, end,flag = 1,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number ");
		start = sc.nextInt();
		System.out.println("Enter end number ");
		end = sc.nextInt();
         for ( i = start; i < end; i++) {
        	 
			for ( j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
				
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}
	}

}
