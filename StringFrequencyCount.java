package com.arrays;

import java.util.HashMap;

public class StringFrequencyCount 
{
	public static void main(String[] args)
	{
		String word="apple";
		HashMap<Character,Integer> occurs=new HashMap<>();
		for(char ch:word.toCharArray())
		{
			if(ch!=' ')
			{
				if(occurs.containsKey(ch)) 
				{
					occurs.put(ch, occurs.get(ch)+1);
				}
				else 
				{
					occurs.put(ch, 1);
				}
			}
		}
		System.out.print("Count of each char in the string: "+occurs);		
	}
}
