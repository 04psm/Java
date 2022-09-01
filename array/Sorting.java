package array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
//		 Bubble sort 
		int a [] = {5,2,-1,6,3 };
		int n = a.length ; 
		for(int e : a) {
			System.out.print(e + " " );
		}
		System.out.println(" ");
		System.out.println(" ");
		int count = 0 ; 
		for(int i = 0 ; i<n-1;i++) {
			boolean sorted = true ; 
			for(int j = 0 ;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					count++;
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false ; 
					// checking iterate 
					for(int e : a) {
						System.out.print(e + " ");
					}
					System.out.println(" ");
					//end checking 
				}
			}
			System.out.println(" " + i);
			if(sorted) break ; 
		}
		System.out.println(" ");
		System.out.println(" ");
		
		
		for(int e : a) {
			System.out.print(e + " " );
		}
		System.out.println();
		System.out.println(count);
	}

}
