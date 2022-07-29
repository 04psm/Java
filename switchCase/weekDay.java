package switchCase;

import java.util.Scanner;

public class weekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	 Scanner sc = new Scanner(System.in);
    	 int dayOfWeek = sc.nextInt();
    	 
    	 switch(dayOfWeek) {
    	 case 1:
    	 case 2:
    	 case 3:
    	 case 4:
    		 System.out.println("Office Day");
    	     break;
    	 case 5:
    		 System.out.println("I'm on leave");
    		 break;
    	 case 6:
    		 System.out.println("Holi day");
    		 break;
    	 case 7 : 
    		 System.out.println("it's sunday");
    		 break;
    	default:
    		System.out.println(" Pls enter a number 1- 7 ");
    	 }
	}

}
