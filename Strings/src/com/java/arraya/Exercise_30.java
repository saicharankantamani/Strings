package com.java.arraya;

public class Exercise_30 {
public static void main(String[] args) {
	
	/*int[] ar = {0,5,0,3};
	int index = -1 ,oddHigh = 0;
	for (int i = 0; i < ar.length; i++) {
		{
			for (int j = i; j < ar.length; j++) {
				if (ar[j]==0&&index==-1) {
					index=j;
				}
				if (index>=0 && ar[j]%2 != 0) {
					if (oddHigh<ar[j]) {
						oddHigh = ar[j];
					}
				}
			}
			if (oddHigh != 0) {
				ar[index] = oddHigh;
			}
			oddHigh = 0;
			index = -1;
		}
		for (int k = 0; k< ar.length; i++) {
			System.out.println(ar[k]);
		
	}
}*/
	 int p[] = { 0, 5, 0, 3 };
	    int index = -1, oddHigh = 0;
	    for (int i = 0; i < p.length; i++) {
	      for (int j = i; j < p.length; j++) {
	        if (p[j] == 0 && index == -1) {
	          index = j;
	          System.out.println("index is :"+ index);
	        }
	        if (index >= 0 && p[j] % 2 != 0) {
	          if (oddHigh < p[j]) {
	            oddHigh = p[j];
	            System.out.println("odd high :"+ oddHigh);
	          }

	        }
	      }
	      if (oddHigh != 0) {
	        p[index] = oddHigh;
	      }
	      oddHigh = 0;
	      index = -1;
	    }
	    for (int i = 0; i < p.length; i++)
	      System.out.println(p[i]);
	    }
}
