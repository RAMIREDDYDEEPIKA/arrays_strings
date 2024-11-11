package com.arrays;

public class MinAndMaxElement
{
	public static void main(String[] args)
	{		
		int[] arr=new int[] {2,3,4,5,1};
		 int min=arr[0];
		 for(int i=0;i<=arr.length-1;i++) 
		 {
			 if(min>arr[i])
			 {
				 min=arr[i];
			 }
		 }
		 System.out.println(min+" is the minimum array element");
		 
		 
		 //to find maximum element in the array
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(max<arr[i])
			 {
				 max=arr[i];
			 }
		 }
		 System.out.println(max+" is the maximum element in the array");
	}

}
