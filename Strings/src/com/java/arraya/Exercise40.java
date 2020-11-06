package com.java.arraya;

import java.util.Arrays;

public class Exercise40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar= {1,2,3,5,5,5,7,8,9,3,0};
		
		Arrays.stream(ar).distinct().sorted().forEach(s->System.out.println(s));

	}

}
