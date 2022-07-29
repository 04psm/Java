package switchCase;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number ");
		int a = sc.nextInt();
		System.out.println("Enter your second number ");
		int b = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter your arithmetic operation ");
		
		String operation = sc.nextLine();
		
		switch(operation) {
		case "+" :
			System.out.print("Your ans is ");
			System.out.println(+ a + b);
			break;
		case "-":
			System.out.print("Your ans is ");
			System.out.println( a - b );
			break;
		case "*":
			System.out.print("Your ans is ");
			System.out.println(a * b);
			break;
		case "/":
			System.out.print("Your ans is ");
			System.out.println(a/b);
			break;
		case "%":
			System.out.print("Your ans is ");
			System.out.println(a%b);
			break;
		default:
			System.out.println("Enter one of this operation  +  -  /  *  % ");
		}
	}

}
