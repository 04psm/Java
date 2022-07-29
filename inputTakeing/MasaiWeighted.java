package inputTakeing;

import java.util.Scanner;

public class MasaiWeighted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // (10×7+15×8+25×5+50×2) / (10+15+25+50)
		
//		● E1 - 7 W1 - 10
//		● E2 - 8 W2 - 15
//		● E3 - 5 W3 - 25
//		● E4 - 2 W4 - 50
//		Overall Score - 4.15 (10×7+15×8+25×5+50×2) / (10+15+25+50)
		
//		● Course having 4 evaluations E1, E2, E3 & E4 with the respective weights W1, W2, W3 & W4
//		● Overall Scores - ( (W1 * E1) + (W2 * E2) + (W3 * E3) + (W4 * E4) ) / ( W1 + W2 + W3 + W4 )
		
		Scanner sc = new Scanner(System.in);
		
		double W1 = 10 , W2 = 15 , W3 = 25, W4 = 50; 
		
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
