package array;

import java.util.Scanner;

public class MultiArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int array [][] = new int [5][3]; // here is 5 row and 3 col
		
//		int array [][] = {
//				{12,43,45,65,31},
//				{23,45,65,3},
//				{2,4,56,7},
//				{12,34,42,34}
//	    	};
//
//		System.out.println(array[2][2]);
		
		System.out.println("Enter dimension ");
		int row = sc.nextInt() ; 
		int col = sc.nextInt() ; 

		int a [][] = new int[row][col];
		int b [][] = new int[row][col];
		
		System.out.println("Enter Array  A  :");
		for(int i = 0 ;i<row ; i++) {
			for(int j = 0 ;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter Array B : ");
		for(int i = 0 ; i<row ; i++) {
			for(int j = 0 ; j<col ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		
		int c [][] = new int [row][col];
		for(int i=0 ; i<row ; i++) {
			for(int j = 0 ; j<col ; j++) {
				c [i][j] = a[i][j] + b [i][j]; 
			}
		}
		
		
		System.out.println("Sum of two mat is : ");
		for(int i = 0 ; i<row ; i++) {
			for(int j = 0 ;j<col;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
