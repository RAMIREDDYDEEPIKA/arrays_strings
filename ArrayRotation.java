package com.advancedArrayProblems;

import java.util.Arrays;

public class ArrayRotation
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		int numberOfRotations=2;
		System.out.println("The original array elements are: "+Arrays.toString(arr));
		System.out.println("After rotating the array elements by specified no. of positions from left are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>numberOfRotations) {
				System.out.print(arr[i]+" ");
			}
		}for(int i=0;i<arr.length;i++) {
			if(arr[i]<=numberOfRotations) {
				System.out.print(arr[i]+" ");
			}
		}
		 
	}

}

