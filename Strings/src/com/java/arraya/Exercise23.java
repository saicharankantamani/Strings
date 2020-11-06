package com.java.arraya;

import java.util.Arrays;

public class Exercise23 {
	 public static void main(String[] args) {
		/*  Object[] arr = { 6, 3,null, 2, 7, 1 };
		    int length=arr.length;
		    System.out.println(Arrays.toString(arr));
		     Object first;
		   int j;
		   first = arr[0];
		   for (j = 0; j < length-1; j++) {
		    // Shift element of array by one
		    arr[j] = arr[j + 1];
		   }
		   arr[j] = first;
		   System.out.println(Arrays.toString(arr));*/
		   
		   Object[] ar = {1,2,3,4,5,6};
		   Object first = ar[0];
		   int i;
		   for (i = 0; i < ar.length-1; i++) {
			   ar[i] = ar[i+1];
			}
		   ar[i] = first;
		   System.out.println(Arrays.toString(ar
				   ));
		   
		   
		   
		   int [] nar = {1,2,3,4,5};
		   int one= nar[0];
		   int j;
		   for (  j = 0; j < nar.length-1; j++) {
			   nar[j] = nar[j+1];
			
		}
		   nar[j] = one;
		   System.out.println(nar[j]);
		   System.out.println(Arrays.toString(nar));
		   
		 }
}
