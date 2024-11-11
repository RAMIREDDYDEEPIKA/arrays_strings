package com.arrays;

public class PalindromeCheck {

	public static void main(String[] args) {
		 String str="madam";
		 String result="";
		 for(int i=str.length()-1;i>=0;i--) {
		      result=result+str.charAt(i);
		 }
		 if(str.equalsIgnoreCase(result)) {
			 System.out.println(result+" is palindrome");
		 }
		 else {
			 System.out.println(str+" is not palindrome");
		 }
	}

}
