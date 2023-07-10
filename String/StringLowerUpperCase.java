package Demo;


public class StringLowerUpperCase {
 
  public static void main(String[] args){
	  String s="Java is a Language Java is a Language";
	  int mid=s.length()/2;
	  String lowerCaseString="";
	  String upperCashString="";
	  
	  
	  for(int i=0;i<s.length();i++) {
		  if(i>mid) {
			  lowerCaseString+=Character.toLowerCase(s.charAt(i));
		  }else {
			  upperCashString+=Character.toUpperCase(s.charAt(i));
		  }
	  }
	  System.out.println(lowerCaseString+" "+upperCashString);
    }  
}
