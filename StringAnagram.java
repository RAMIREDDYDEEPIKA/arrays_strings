package com.arrays;

import java.util.Arrays;

public class StringAnagram 
{
	public static void main(String[] args)
	{
		 String word="listen";
		 String result="silent";
		 if(word.length() != result.length()) 
		 {
			 System.out.println("Given two Strings must be same length to chack it is anagram or not");
		 }
		 else 
		 {
			 char[] charArray1=word.toCharArray();
			 char[] charArray2=result.toCharArray();
			 Arrays.sort(charArray1);
			 Arrays.sort(charArray2);
			 if(Arrays.equals(charArray1, charArray2)) 
			 {
				 System.out.println(word+" is anagram string");
			 }
			 else 
			 {
				 System.out.println(word+" is not Anagram string");
			 }
		 }
	}
}
