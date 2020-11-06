package com.java.streams;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	String name;
	int exp;
	int sala;
	
	public Employee(String ename, int eexp, int esala) {
		// TODO Auto-generated constructor stub
		
		name = ename;
		exp = eexp;
		sala  = esala;
	}
}

public class Predicate_Demo2 {
	
	
   public static void main(String[] args) {
	   
	   ArrayList<Employee> al = new ArrayList<Employee>();
	   Predicate<Employee> p = s->s.sala>30000 && s.exp>3;
	   Predicate<Employee> p1 = s->s.sala>30000&& s.name.startsWith("s");
	   al.add(new Employee("smith", 5, 50000));
	   al.add(new Employee("charan", 5, 20000));
	   al.add(new Employee("john", 7, 70000));
	   al.add(new Employee("Alex", 5, 30000));
	   al.add(new Employee("smitha", 5, 60000));
	   
	   
	   for (Employee employee : al) {
		if (p.and(p1).test(employee)) {
			System.out.println(employee.name+ "" + employee.sala);
		}
	}
	  
	   
	
}
}
