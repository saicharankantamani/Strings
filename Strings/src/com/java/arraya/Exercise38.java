package com.java.arraya;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise38 {

	public static void main(String[] args) {
		
	
	int [] ar = {1,2,3,3,2};
	int count;
	for(int i = 0; i<ar.length;i++) {
		count =0;
		for (int j = 0; j < ar.length; j++) {
			if (ar[i]==ar[j] && i!=j ) 
				count++;
		}
			if (count == 0) 
				System.out.println(ar[i]);
		}
	//Using Java Streams
	
	
	/*List<int[]> numbers = Arrays.asList(ar).stream().collect(Collectors.toList());
	
	numbers.stream().filter(s->Collections.frequency(numbers, s==1)*/
	
	
	}
}
	


