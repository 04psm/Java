package mathod;

public class passByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 23 ; 
		int num2 = 12 ; 
		swap(num1,num2);
		System.out.println("Num1 was 23 but now it is " + num1);
		System.out.println("Num2 was 12 but now it is " + num2);
		
	}

 static	void swap (int a , int b ) {
		int temp = a ; 
		a = b ; 
		b = temp ; 
	}
}
