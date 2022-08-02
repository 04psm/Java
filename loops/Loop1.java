package loops;

import java.util.*;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0 ; i<=12; i = i + 2) {
//			System.out.println(i);
//		}
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		1+2+3+4...n   n(n+1)/2 
//		int sum = 0 ;
//		for(int i = 1 ; i<=n;i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		for(int i = n ; i>= 0 ; i--) {
//			System.out.println(i);
//		}
		
	
		
//		System.out.println("Table of " + n);
//		for(int i = 1; i<=10;i++) {
//			System.out.println(i+" x "+n+ " = "+ n*i);
//			
//		}
		
		
		//Factorial  5! = 5*4*3*2*1 = 120 
		// n x (n-1)x(n-2).....1
		int sum = 1; 
		for(int i = n ; i>0;i--) {
			sum *= i;
		}
//		for(int i = 1;i<=n;i++) {
//			sum *= i ;
//		}
		System.out.println(sum);
		
		
		
	}

}
