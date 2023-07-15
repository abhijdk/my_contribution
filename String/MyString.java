package Demo;

public class MyString {
 public static void main(String[] args) {
  String s="ABCDABCDEF";
  char []arr=s.toCharArray();
  String add="";
  for(char ch:arr) {
	  if(add.indexOf(ch)==-1) {
		  add+=ch;
	  }
  }
  System.out.println(add);
 }
}
