package com.java.arraya;

import java.util.Arrays;

public class Exercise_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar = {6,100,50};
		
		String[] array_num = Arrays.stream(ar).mapToObj(String::valueOf).toArray(String[]::new);
		Arrays.sort(array_num,(String str1 , String str2)->(str2+str1).compareTo(str1+str2));
		System.out.println(Arrays.stream(array_num).reduce((a,b)->a.equals("0")?b:a+b).get());
		
		
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]<ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
		}

	}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

}
	}
