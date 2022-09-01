package anagram;

public class OptiAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abb" ; 
		String b = "abn" ;
		int n = 256 ; 
		boolean isAnagram = true ; 
		
		int alen[] = new int[n];
//		int blen[] = new int [n];
		for(char i : a.toCharArray()) {
			int index =  (int) i ; 
			alen[i]++;
		}
		
		for(char i : b.toCharArray()) {
			int index = (int) i ; 
			alen[i]--;
		}
		for(int i = 0 ; i<n;i++) {
			if(alen[i] != 0) {
				isAnagram = false ; 
				break;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("not an Anagram");
	}

}
