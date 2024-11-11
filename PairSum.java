package com.advancedArrayProblems;

public class PairSum {

	public static void main(String[] args) {
		 int[] arr= {1,2,4,5,6,3};
		 int pairSum=7;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 if((arr[i]+arr[j])==pairSum) {
					 System.out.println("( "+arr[i]+", "+arr[j]+" )");
					 break;
				 }
			 }
		 }

	}

}
