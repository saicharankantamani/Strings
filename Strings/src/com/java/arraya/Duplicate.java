package com.java.arraya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hcl-tech";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] carray = str.toCharArray();
		Set <Character> setChar = 	new Set <Character>(); //initialize the set up here
		for (char c : carray)
		{
		    if (map.containsKey(c))
		    {
		        map.put(c, map.get(c) +1);
		        setChar.add(c); //just add to set when a char already exists
		    }
		    else
		    {
		        map.put(c, 1);
		    }
		}

		return setChar.size();

	}
	

}
