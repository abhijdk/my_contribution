package Demo;


public class StringToByteArray {
 
  public static void main(String[] args){
	  String s="This is Java";
	  
	  byte [] arr=s.getBytes();
	  
	  String s1=new String(arr);
	  
	  System.out.println(s1);
    }  
}
