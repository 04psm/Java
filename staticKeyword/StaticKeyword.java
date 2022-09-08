package staticKeyword;

import staticKeyword.Test.*;

public class StaticKeyword {
		static {
			System.out.println("in block 1");
		}
		static {
			System.out.println("in block 2");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main");
		System.out.println(Math.PI);
		
		Test obj = new Test();
		
//		Test.A objA = obj.new A(); // without import the class 
		
		A objA = obj.new A(); 
		
		B objB = new Test.B();
	} 


}
