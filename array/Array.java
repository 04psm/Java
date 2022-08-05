package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		 int [] marks = {12, 23 , 44, 42 ,14};
//		// System.out.println(marks[2]);
//		 marks[2] = 04 ; 
//		// System.out.println(marks[2]);
//		for(int i = 0 ; i<marks.length;i++) {
//			System.out.println(marks[i]);
//		}
		
		
		// Avg marks of student 
		System.out.println("Enter the number of students : " );
		int n = sc.nextInt(); 
		int [] marks = new int[n];
		
		for(int i = 0 ;i<marks.length;i++) {
			System.out.println("Enter the " + i + " marks");
			marks[i] = sc.nextInt();
		}
		int avgMarks = 0 ; 
		for(int i = 0 ; i<n ; i++) {
			avgMarks += marks[i];
		}
		avgMarks /= n;
		
		System.out.println("The avg marks are " + avgMarks);
	}

}
