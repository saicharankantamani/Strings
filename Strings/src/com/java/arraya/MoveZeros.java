package com.java.arraya;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar = {2,1,10,20,0,0,5,0,8,100,0};
		
		int [] nar = new int[ar.length];
		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]!=0) {
				nar[index++] = ar[i];
			}
			
		}
		for (int i = 0; i < nar.length; i++) {
			System.out.println(nar[i]);
		}
	}

}
