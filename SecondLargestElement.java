package com.advancedArrayProblems;

public class SecondLargestElement {

	public static void main(String[] args) {
		 int[] arr= {1,2,5,4,6};
		 int largest=arr[0];
		 int secondLargest=0;
		 for (int i = 0; i < arr.length; i++)
		 {  	
			    if (largest<arr[i]) 
	            {
	                secondLargest = largest;   
	                largest = arr[i];   
	            }
		        else if (secondLargest<arr[i] && arr[i] != largest)
	            {
	                secondLargest = arr[i];   
	            }
	      }System.out.println(secondLargest);
	}

}
