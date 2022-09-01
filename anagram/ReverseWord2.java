package anagram;

public class ReverseWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "     I love java       " ;
		String ans = "";
		int i = str.length() - 1 ; 
		while(i>=0) {
			while(i >= 0   && str.charAt(i) == ' ' ) {
				i--;
			}
			if (i<0) break ; 
			int j = i ; 
			while(i >= 0 && str.charAt(i) !=  ' ') {
				i--;
			}
			if(ans.isEmpty()) {
			ans = ans.concat(str.substring(i+1 , j+1));
			}else {
				ans = ans.concat(" "+ str.substring(i+1 , j+1));
			}
		}
		System.out.println(ans);
	}

}
