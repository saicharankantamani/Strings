package com.java.arraya;

import java.util.Arrays;

public class Exercise_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {5,10,13,12,0,2,100,3,3,7,10};
		/*Arrays.parallelSort(ar);
		System.out.println(Arrays.toString(ar));*/
		int j=-1,temp;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0) {
				j++;
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
