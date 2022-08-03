package loops;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		//Fibonacci number  
		Scanner sc = new Scanner(System.in);
		
//		a b c 
//		0 1 1
//		1 1 2
//		1 2 3
//		2 3 5
//		3 5 8
//		5 8 13
		
//		int n = sc.nextInt();
//		int a = 0 ; 
//		int b = 1 ; 
//		System.out.print(a+" "+ b +" ");
//		for(int i = 0 ;i<n-2;i++) {
//		 int c = a + b ;
//		 System.out.print(c +" ");
//		 a = b;
//		 b = c ; 
//		}
		
		
	
////		power  or  the built in methods is Math.pow()
//		System.out.println("Enter your num");
//		int a = sc.nextInt();
//		System.out.println("Enter the power");
//		int b = sc.nextInt();
//		int power = 1; 
//		// you can run the loop from i = 0 to b OR i = 1 to i<=b both are same 
//		for(int i = 1 ; i<=b;i++) {
//			power *= a;
//		}
//		System.out.println(a +" to the power "+ b+" is : "+power);
//		
////		System.out.println(Math.pow(a, b)); //this is the built in methods
		
		
//		// prime number or not 
//		//What is prime number 
//		// a number that is divisible only by itself and 1
//		int n = sc.nextInt();
//		boolean isPrime = true;
//		
//		if(n<2) isPrime=false;
//		
//		for(int i = 2 ; i*i<n;i++) {
////			System.out.println(i);
//				if(n % i == 0) {
//					isPrime = false ;
//					break;
//				}
//		}
//		System.out.println("is Prime :"+isPrime);
		
		
		
		
//		//1 + 1/2 + 1/3 + 1/4 ... 1/n
//		int n = sc.nextInt();
//		float r = 0 ; 
//		for(float i = 1 ; i<=n;i++) {
//			r += 1/i;
//			System.out.println(r);
//		}
//		
		
//		1-1/2+1/3-1/4+1/5...1/n
//		int n = sc.nextInt();
//		float result = 0 ; 
//		for(float i = 1 ;i<=n;i++) {
//			if(i%2==0) {
//				result -= 1/i ; 
//			}else {
//				result += 1/i ; 
//			}
//		}
//		System.out.println(result);
		
		
//	 // Break 
//		for(int i = 0 ;i<=10;i++) {
//			if(i==5) break;
//			System.out.println(i);
//		}
		
	// Continue 
//		for(int i = 0 ; i<=10;i++) {
//			if(i>=5 && i<=9) continue;
//			System.out.println(i); 
//		}
		
	}

}
