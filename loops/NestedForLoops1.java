package loops;

import java.util.Scanner;

public class NestedForLoops1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// table  1 to N 
//		int n = sc.nextInt();
//		for(int i = 1; i<=n;i++) {
//			for(int j = 1 ; j<=10;j++) {
//				System.out.println(i+" X "+j+" = "+ i*j );
//			}
//			System.out.println(" ");
//		}
		
		
		// Patterns 1
		/*
		  
		 * * * *
		 * * * * 
		 * * * *
		 * * * * 
		 * * * *
		 
		 */
//		int n = sc.nextInt();
//		for(int i  = 1 ;  i<=n ; i++ ) {
//			for(int j = 0 ; j<=n;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println(" ");
//		}
	
		
		// Patterns 2
		
//		*  
//		* *  
//		* * *  
//		* * * *  
//		* * * * *  
		
//		int n = sc.nextInt();
//		for(int i = 1 ; i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
		

		// Patterns 3
		
//		
//		* * * * * *  
//		  * * * * *  
//		    * * * *  
//		      * * *  
//		        * *  
//		          *  
//		int n = sc.nextInt();
//		for(int i = 1 ; i<=n;i++) {
//			for(int j = 1;j<=i-1;j++) {
//				System.out.print("  ");
//			}
//			for(int j = 0;j<=n-i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
		
		
		// Patterns 4
		
		
//		* * * * * * * 
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
//		int n = sc.nextInt();
//		for(int i = 1; i<=n;i++) {
//			for(int j=0;j<n-i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//		
		
		
		/*

          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
* * * * * * 

		  */
		
//		int n = sc.nextInt();
//		for(int i = 1 ; i<=n;i++) {
//			for(int j = 1; j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j = 1 ; j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
	
		
		
	}

}
