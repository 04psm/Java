package oops;

class Cat {
	boolean hasFure ;
	String color ,breed , name ; 
	int legs , eyes ; 
	
	//methods and function are same 
	public void walk() {
		System.out.println(name +" cat is walking");
	}
	public void eat() {
		System.out.println(name +" cat is eating ");
	}
	
	public void description() {
		System.out.println( breed + " breed my and  cat name is "+ name + " and it has " + legs +" legs and it has " + eyes +" Eyes " + hasFure);
	}
}

 

class Dog {
	String name ,breed ; 
	int legs , eyes ; 
	public void run() {
		System.out.println(name + " is running ");
	}
	public void description() {
		System.out.println("my dog name is " + name + "he has " + eyes +" eye and legs  is " + legs );
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Chadu";
		cat1.breed = "Indian";
		cat1.color = "Black";
		cat1.legs = 4; 
		cat1.eyes = 1 ;
		cat1.walk();
		cat1.description();
		
		
		Cat cat2 = new Cat();
		cat2.name = "minu";
		cat2.eat();
		
		
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		husky.name = "Shiro";
		husky.breed = "Husky";
		husky.eyes = 2; 
		husky.legs = 4 ; 
		husky.description();
	}

}
