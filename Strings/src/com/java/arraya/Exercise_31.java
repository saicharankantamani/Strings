package com.java.arraya;

import java.util.Arrays;

public class Exercise_31 {

	public boolean test(int[] ar) {
		int a = 0;
		int b = 0;
        for (int i = 0; i < ar.length; i++) {
			if (ar[i]==1) {
				a++;
			}
			else if (ar[i]==4) {
				b++;
			}
		}
        if (a>b) {
        	
			System.out.println(a);
			return true;
		}
        else {
        	System.out.println(b);
        	return false;
        }
	}
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
        	
        	Exercise_31 ex = new Exercise_31();
        	int[] nar = {1,1,1,4};
        	System.out.println(ex.test(nar));
        	
        	//Using java streams
        	if(Arrays.stream(nar).filter(s->s==1)
        			.count()>Arrays.stream(nar).filter(s->s==4).count()) {
        		System.out.println("true");
        	}else {
        		System.out.println("false");
        	}
        }
}


