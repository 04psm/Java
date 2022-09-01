package array;

import java.util.Scanner;

public class ArrayP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num of student ");
		int n = sc.nextInt();
		int [] a = new int [n];
		for(int i = 0 ; i<a.length ; i++) {
		 	a[i] = sc.nextInt();
		}
		int avg = 0 ; 
		for(int i =0 ; i<n ; i++) {
			avg+=a[i];
		}
		System.out.println( " total sum "  + avg);
		System.out.println("avg marks is : " + avg / n );
	}

}
