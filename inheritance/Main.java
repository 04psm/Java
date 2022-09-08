package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.name = "Mr. Harry";
		t.walk();
		t.eat();
		
		Singer s = new Singer();
		s.name = "Joy";
		s.eat();
		s.sing();
	}

}
