package mathod;

public class MethodIntro {

	public static void main(String[] args) {
		
		float n = 34.12f , n2 = 23.54f ; 
		
		float result = maxOf(n,n2);
		 
		System.out.println(result);
		greeting();
	} 
	
	
static void greeting() {
	System.out.println("hey there ! ");
}

static float maxOf(float a , float b ) {
	return  a>b ? a: b ; 
}

 static	int maxOf(int a , int b) {
		return a > b ? a : b ; 
//		if(a>b) {
//			return a ;
//		}else {
//			return b ; 
//		}
 			
	}
}
