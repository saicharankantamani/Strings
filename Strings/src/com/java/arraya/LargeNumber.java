package com.java.arraya;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

class GFH {
	
	static void printLargest(Vector<String> arr) {
		
		Collections.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				// TODO Auto-generated method stub
				
				String XY = X+Y;
				String YX = Y+X;
				
				return XY.compareTo(YX) > 0 ? -1:1;
			}
		});
		
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}


public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> arr;
		arr = new Vector<>();
		
		arr.add("20");
		arr.add("5");
		arr.add("10");
		arr.add("90");
		GFH.printLargest(arr);

	}

}
