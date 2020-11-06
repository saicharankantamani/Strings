package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Java8Tester  {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list = Arrays.asList(1,2,20,-5,100,50,0,21);
     System.out.println("Print all numbers ");
     eval(list, n-> true);
     System.out.println("print all even numbers ");
     eval(list, n-> n%2==0);
     }
     public static void eval (List<Integer> list ,Predicate<Integer> predicate)
     {
    	 for(Integer n : list)
    	 {
    		 if(predicate.test(n))
    		 {
    			 System.out.println(n + " ");
    		 }
    	 }
     }
}