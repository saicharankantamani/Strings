package com.java.streams;

import java.util.function.Predicate;

public class Predacite {
	public static void main(String[] args) {
		
	
	
	Predicate<Integer> p = s -> (s>20);
	
      System.out.println(p.test(30));
      
      
      Predicate<String> s = h -> h.length()>4;
      
      System.out.println(s.test("sai charan"));
      System.out.println(s.test("myname"));
      System.out.println(s.test("sdss"));
      
      String [] sr = {"John","Max","Smith","Saicharan"};
      for (String str : sr) {
    	  if (s.test(str)) {
			System.out.println(str);
		}
		
	}
	}
}
