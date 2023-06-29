package may_exm1;

import java.util.ArrayList;
public class Array_a21 {
	  public static void  main(String[] args)
	  {
		  ArrayList< String> al=new ArrayList<>();
		  al.add("aaa");
		  al.add("bbb");
		  al.add("ccc");
		  al.add("ddd");
		  al.add("eee");
		  
		  String arr[] =new String[al.size()];
		  al.toArray(arr);
		  
		  for(String s:arr) {
			  System.out.println(s);
		  }System.out.println();
	  }
  }
