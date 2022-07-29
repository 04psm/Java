package inputTakeing;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The principal amount : ");
		int principal = sc.nextInt(); 
		System.out.println("Rate is : ");
		float rate = sc.nextFloat();
		System.out.println("Total time or Duraiton : ");
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate  * time / 100 ; 
		System.out.println(simpleInterest);
		
	}

}
