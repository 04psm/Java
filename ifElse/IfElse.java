package ifElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int noOfPetals = sc.nextInt(); 
		
		if(noOfPetals % 2 == 0) {
			System.out.println("She loves  me ");
		}else {
			System.out.println(" she loves me not");
		}
		
// Short hand
		String outcome =  (noOfPetals % 2 == 0  ) ? "She loves me "  :"She loves me not ";
		System.out.println(outcome);
		
		
		
		
//		int time = sc.nextInt();
//		String result = (time < 18) ? "Good day." : "Good evening.";
//		System.out.println(result);
		
	}

}
