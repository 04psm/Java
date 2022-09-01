package anagram;

public class Anagram2 {

	public static void main(String[] args) {
		 String str1 = "acb";
		 String str2 = "abc";
		 boolean isAnagram = true ; 
		 int n = 256 ; 
		 int str1len[] = new int[n];
		 int str2len[] = new int [n];
		 
		 for(char al : str1.toCharArray()) {
			 int index = (int) al;
			 str1len[index]++;
		 }
		 for(char bl : str2.toCharArray()) {
			 int index = (int) bl ; 
			 str2len[index]++;
		 }
		 for(int i = 0 ; i<n; i++) {
			 if(str1len[i] != str2len[i]) {
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
