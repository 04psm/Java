package constructor;

class Vehicle{
	int wheels , headLight , door, window;
	String Brand , color ; 
	Vehicle(int wheels , int door , int window){
		this.wheels = wheels;
		this.door = door ;
		this.window = window; 
	}
	
	
	Vehicle(int wheels ){
		this.wheels = wheels; 
	}
	
	Vehicle(){
		
	}
	
	Vehicle(int wheels , String color ){
		this.wheels = wheels; 
		this.color = color; 
		headLight = 2 ;
	}
	
}

public class MyConstructor {
		MyConstructor(){
			System.out.println("object created ");
		}
		
		
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		Vehicle car1 = new Vehicle(4 , 4 ,6);
		System.out.println(car1.window + " no of door is " +car1.door+ "no of wheels is " + car1.wheels );
		
		Vehicle scooty = new Vehicle(2);
		System.out.println(scooty.wheels +"  Wheels");
		
		
		Vehicle eRikshaw = new Vehicle(3 , "Red ");
		System.out.println(eRikshaw.color +" color Rikshaw and it has "+ eRikshaw.wheels +" wheel");
	}
	
}
