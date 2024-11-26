package com.arrays;

import java.util.Arrays;

public class ArrayReverse
{
	public static void main(String[] args)
	{
		 int[] arr= {1,4,3,2,5};
		 System.out.println("The original array elements are: "+Arrays.toString(arr));
		 System.out.print("The reversed array elements are: ");
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.print(arr[i]+" ");
		 }

	}

}

