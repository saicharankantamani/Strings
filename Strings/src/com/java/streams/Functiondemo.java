package com.java.streams;

import java.util.function.Function;

public class Functiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> fn = f->f*f;
		System.out.println(fn.apply(5));

	}

}
