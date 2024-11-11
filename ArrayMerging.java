package com.advancedArrayProblems;

import java.util.Arrays;

public class ArrayMerging {

	public static void main(String[] args) {
		 int[] arr1= {4,3,7,5};
		 int[] arr2= {5,3,2,6};
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 int[] result=new int[arr1.length+arr2.length];
		 int i=0,j=0;
		 for(int k=0;k<result.length;k++)
		 {
			 if(i<arr1.length && (j>=arr2.length || arr1[i]<arr2[j])) {
				 result[k]=arr1[i++];
			 }else {
				 
				 result[k]=arr2[j++];
			 }
		 }
		 for(int num:result) {
			  
			 System.out.print(num+" ");
			 
		 }

	}

}
