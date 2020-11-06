package com.java.arraya;

import java.util.Arrays;



public class Exercise37 {
	
	public static void main(String[] args) {
		int [] ar = {17,20,1,2,4,5,6,10};
		int sum_Even = 0;
	    int sum_Odd = 0;
	    for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) 
				sum_Even = sum_Even+ar[i];
			if (ar[i]%2!=0)
				sum_Odd = sum_Odd+ar[i];
		}
	    System.out.println(sum_Even);
	    System.out.println(sum_Odd);
	    
	   System.out.println( Arrays.stream(ar).filter(s->s%2==0).sum());
	   System.out.println(Arrays.stream(ar).filter(s->s%2!=0).sum());
	}

}
