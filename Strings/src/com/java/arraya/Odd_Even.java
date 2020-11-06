package com.java.arraya;

public class Odd_Even {
	public static void main(String[] args) {
		int[] ar= new int[] {5,9};
		System.out.println(Odd_Even.check(ar));
	}
	public static boolean check(int[] ar) {
		for (int i = 0; i < ar.length-2; i++) {
if(ar[i]%2 == ar[i+1] %2 && ar[i]%2 == ar[i+2]%2)
{
	return true;
}
			
		}
		return false;
		
	}
	

}
