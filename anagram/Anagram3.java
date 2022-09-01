package anagram;
import java.util.*;
public class Anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  anagram ";
		String s2 = "  nag a ram  ";
		
		s = s.replaceAll("\\s+", "");
		s2 = s2.replaceAll("\\s+", "");
//		System.out.println(s);
//		System.out.println(s2);
		if(s.length() == s2.length()) {
			char[] slen = s.toCharArray();
			char[] s2len = s2.toCharArray();
			Arrays.sort(slen);
			Arrays.sort(s2len);
			if(Arrays.equals(slen, s2len)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not anagram");
			}
			
		}else {
			System.out.println("not Anagram");
		}
	}

}
