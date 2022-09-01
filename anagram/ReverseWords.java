package anagram;
public class ReverseWords {

	public static void main(String[] args) {
        String str= "       I          love    Java,          the         coffee      ", nstr="";
        char ch;
      for (int i=0; i<str.length(); i++) {
        ch= str.charAt(i); //extracts each character
        
        nstr= ch+nstr; //adds each character in front of the existing string
        //eeffoc eht ,avaJ evol I

      }
      String regex = "\\s+";
      String result = nstr.replaceAll(regex, " ");
      System.out.println(result.trim());
		
    }
}
