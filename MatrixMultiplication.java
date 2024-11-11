package com.arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		 int[][] arr= {{1,2,3},{2,4,5},{2,5,7}};
		 int[][] arr2= {{2,3,5},{1,5,3},{6,7,5}};
		 if(arr.length!=arr2.length || arr[0].length!=arr2[0].length) {
			 System.out.println("Check once! matrix must be same length or not");
		 }
		 int[][] matrixMul=new int[arr.length][arr[0].length];
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 matrixMul[i][j]=arr[i][j] * arr2[i][j];
			 } 
		 } 
		 for(int i=0;i<matrixMul.length;i++) {
			 for(int j=0;j<matrixMul.length;j++)
			 {
				 System.out.print(matrixMul[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
