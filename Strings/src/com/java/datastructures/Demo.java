package com.java.datastructures;
@FunctionalInterface
interface inter
{
	public void test(int a ,int b);
	public static void demo(int a, int b) {
		System.out.println(a+b);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    inter i = (a,b)->System.out.println(a*b);
    i.test(20, 30);
    inter.demo(20, 30
    		);
	}

}
