package com.java.arraya;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	LeftShift lf = new LeftShift();
	int [] ay = {2,5,6};
	System.out.println(lf.test(ay));
	}
	
	public int[] test(int[] nar)
	{
		int[] ar = new int[nar.length];
		ar[nar.length-1] = nar[0];
		for (int i = 0; i < ar.length-1; i++) {
			ar[i] = nar[i+1];
		}
		return ar;*/
		
		int[] ar = {1,2,3,4,5,};
		int[] nar = new int[ar.length];
		nar[ar.length-1] = ar[0];
		for (int i = 0; i < nar.length-1; i++) {
			nar[i] = ar[i+1];
			}
		for (int i = 0; i < nar.length; i++) {
			System.out.println(nar[i]);
		}

	}

}
