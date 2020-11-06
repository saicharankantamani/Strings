package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Sorting {
	@Test(priority = 2)
	public void sort() {
		int[] a = {20,30,40,50,-20,0,100};
		 Arrays.asList(a).stream().sorted().forEach(s->System.out.println(s));
		
		Stream.of(20,30,40,100,45,0,56,-50).sorted().forEach(s-> System.out.println(s));
	}
	//sorting of an string array by removing the duplicates
	@Test
	void stringSort() {
		String s = "saicharan";
		String [] st = s.split("");
		List<String> li = Arrays.asList(st);
		li.stream().distinct().sorted().forEach(si->System.out.println(si));
	}
	@Test(priority = 1)
	void test() {
		ArrayList<Character> l1 = new ArrayList<Character>();
		l1.add('s');
		l1.add('a');
		l1.add('z');
		l1.add('b');
		l1.add('h');
		l1.stream().sorted().forEach(s->System.out.println(s));
		
	}

}
