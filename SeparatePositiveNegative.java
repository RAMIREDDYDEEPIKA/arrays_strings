package com.arrays;

public class SeparatePositiveNegative {

	public static void main(String[] args) {
		 int[] arr= {-1,3,2,4,5,-7};
		 int[] positiveElements=new int[arr.length];
		 int[] negativeElements=new int[arr.length];
		 System.out.println("Positive Elements in the array: ");
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<0) {
				 positiveElements[i]=arr[i];				 
			 } if(positiveElements[i]!=0) {
				 System.out.print(positiveElements[i]+" ");
			 }
		 }
		 System.out.println();
		 System.out.println("Negative Elements in the array: ");
		 for(int j=0;j<arr.length;j++)
		 {
			 if(arr[j]>=0) {
				 negativeElements[j]=arr[j];
			 } if(negativeElements[j]!=0) {
				 System.out.print(negativeElements[j]+" ");
			 }
		 } 
	}

}
