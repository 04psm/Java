package inputTaking;

import java.util.Scanner;

public class ForJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		double W1 = 25 , W2 = 25 , W3 = 25, W4 = 25; 
		
		double E1 = sc.nextInt();
		System.out.println("your E1 socre is " + E1 * W1 );
		
		double E2 = sc.nextInt();
		System.out.println("You E2 score is " + E2 * W2 );
		
		double E3 = sc.nextInt();
		System.out.println("your E3 socre is " + E3 * W3 );
		
		double E4 = sc.nextInt();
		System.out.println("You E4 score is " + E4 * W4 );
		
		System.out.println();
		double totalPoint = ( (W1 * E1) + (W2 * E2) + (W3 * E3) + (W4 * E4) ) / ( W1 + W2 + W3 + W4 ) ; 
		
		System.out.println("Your final Eval points is " + totalPoint);
	}	

}
