package inheritance;

public class Teacher extends Person {
		public void teach() {  // this function is related to object 
			System.out.println(name + " is teaching ");
		}
		public void eat() {
			System.out.println("Teacher "+name + " is eating");
		}
		 public static void laughing() { // this is function is related to the class 
			   System.out.println("Teacher is laughing");
		   }
}
