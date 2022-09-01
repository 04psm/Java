package anagram;

public class Anagram1 {

	public static void main(String[] args) {
		String str1 = "abb";
		String str2 = "abc";
		boolean isAnagram = false;
		boolean visited [] = new boolean[str2.length()];
		if(str1.length() == str2.length()) {
		  for(int i = 0 ;i<str1.length();i++) {
				isAnagram = false;
				for(int j = 0 ;j<str2.length();j++) {
					if(str2.charAt(j) == str1.charAt(i) && visited[j]) {
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) break;
			}
		}
	
		if(isAnagram) 
			System.out.println(" Anagram");
		else
			System.out.println(" not an Anagram");
		
	}

}
