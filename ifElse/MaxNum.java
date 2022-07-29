package ifElse;

import java.util.*;

public class MaxNum {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt() , b = sc.nextInt() ,c= sc.nextInt();
		
		
		int result = a > b ? a > c ? a : c : b > c ? b : c ; 
		System.out.println(result);
		
		
//		if(a>b) {
//			if(a>c) {
//				System.out.println(a);
//			}else {
//				System.out.println(c);
//			}
//		}else {
//			if(b>c) {
//				System.out.println(b);
//			}else {
//				System.out.println(c);
//			}
//		}
		
		
	}
}
