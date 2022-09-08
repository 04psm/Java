package string;

public class Anagram {

	public static void main(String[] args) {
		 
			String str1 = "aab";
			String str2 = "abc";
			boolean isAnagram = false;
			boolean checked [] = new boolean[str2.length()];
			if(str1.length() == str2.length()) {
				
				for(int i = 0 ; i <str1.length();i++) {
					 isAnagram = false;
					for(int j = 0 ; j <str2.length();j++) {
						if(str2.charAt(j) == str1.charAt(i) && checked[j]) {
							isAnagram = true;
							break ; 
						}
					}
					if(!isAnagram) { // if any char not present in the string the this condition will break the loop 
						break;
					}
				}
				
			}
			
			if(isAnagram) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagarm");
			}
	}

}
