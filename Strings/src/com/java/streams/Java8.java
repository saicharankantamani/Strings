package com.java.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {

		
		List<String> name1 = new  ArrayList<String>();
		name1.add("zen");
		name1.add("xelo");
		name1.add("alto");
		name1.add("bmw");
		name1.add("zenq");
		System.out.println(name1);
		Collections.sort(name1);
		System.out.println(name1);
		Collections.sort(name1, (s1, s2) -> s1.compareTo(s2));
		System.out.println(name1);
		name1.forEach(System.out::println);
		System.out.println(name1.get(1));
	}

}
