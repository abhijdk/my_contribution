package Demo;


public class FindoutSpecialCharacter {
 
  public static void main(String[] args){
	  String s="JAVA , PYTHON & PHP are languages";
	  
	  int count=0;
	  System.out.println("Special character");
	  for(int i=0;i<s.length();i++) {
		  if(!Character.isDigit(s.charAt(i))&&!Character.isAlphabetic(s.charAt(i))&&!Character.isWhitespace(s.charAt(i))) {
			  System.out.println(s.charAt(i));
			  count++;
		  }
	  }
	  System.out.println("\n\n\nTotal No. of special character's are"+count);
    }  
}
