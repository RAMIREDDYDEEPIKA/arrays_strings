package com.arrays;

public class CountEvenOdd {

	public static void main(String[] args) {
		 int[] arr= {1,2,3,4,5,6,7,8};
		 int evenCount=0,oddCount=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 System.out.println(arr[i]+" ");
				 evenCount++;
			 }
		 }System.out.println("Even elements present in the array are: "+evenCount);
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2!=0) {
				 System.out.println(arr[i]+" ");
				 oddCount++;
			 }
		 }
		 System.out.println("Odd elements count: "+oddCount);
		 

	}

}
