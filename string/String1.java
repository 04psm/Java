package string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cat = "minu";
		String dog = new String("minu");
		String cat2 = "minu ";
		System.out.println(cat); // minu
		System.out.println(dog ); // minu
		System.out.println(dog == cat2); // false
		
		
		String name = "Partha Sarathi Manna";
		System.out.println(name.charAt(0)); // P
		System.out.println(name.length()); // 20
		
		
		System.out.println(name.substring(5)); //a Sarathi Manna
		System.out.println(name.substring(5,8));//a S
		 
		
		System.out.println(name.contains("P")); // true
		System.out.println(name.contains("Z"));// false
		
		
		System.out.println(dog.equals(cat)); // true 
		System.out.println(dog.equals(cat2)); // false coz in cat2 there is a space 
		
		String nill = ""; 
		String nill2 = "hey there !"; 
		System.out.println(nill.isEmpty()); // true
		System.out.println(nill2.isEmpty());// false
		
		
		String concat = "Partha" ; 
		concat += " Sarathi";
		System.out.println(concat); // Partha Sarathi
		System.out.println(concat.concat(" Manna")); // Partha Sarathi Manna
		
		
		System.out.println(concat.replace('a', 'J')); // PJrthJ SJrJthi
		 
		String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";
		String allCars [] = cars.split(",");
		for(String car: allCars) {
			System.out.print(car + " "); // Hyundai Maruti Swift Wagonr Ferrari Lamborghini
		}
		
		String position = "Kolkata";
		System.out.println(position.indexOf("a"));// 4
		
		
		System.out.println(cars.toLowerCase()); // hyundai,maruti,swift,wagonr,ferrari,lamborghini
		System.out.println(cars.toUpperCase()); // HYUNDAI,MARUTI,SWIFT,WAGONR,FERRARI,LAMBORGHINI
		
		
		String trim = "    hey there     ";
		System.out.println(trim.trim().toUpperCase()); // HEY THERE
	}

}
