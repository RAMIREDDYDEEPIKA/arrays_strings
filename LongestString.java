package com.arrays;

import java.util.HashSet;
public class LongestString 
{
	public static void main(String[] args) 
	{
		String input = "abcabcb";
        	int maxLength = 0;
        	int duplicate = 0;
       		HashSet<Character> subString = new HashSet<>();
        	for (int i = 0; i < input.length(); i++) 
        	{
            		char currentChar = input.charAt(i);
            		while (subString.contains(currentChar)) 
			{
                		subString.remove(input.charAt(duplicate));
                		duplicate++;
            		} 
            		subString.add(currentChar);
           		maxLength = Math.max(maxLength, i - duplicate + 1);
        	}
        	System.out.println("The substring length are: "+maxLength);		
	}
}
