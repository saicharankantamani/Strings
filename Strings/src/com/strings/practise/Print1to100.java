package com.strings.practise;

public class Print1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 100; i++) {
			
			if (i%3 == 0)
				System.out.println(i + "t");
			if (i%5 == 0)
				System.out.println(i + "f");
			if (i%3 == 0 && i%5 == 0)
				System.out.println(i + "tf");
			
			
			
		}

	}

}
