package hacker_rank_codes;
import java.util.*;
public class StringTokenizers{
  public static void main(String ... s){
	  StringTokenizer st=new StringTokenizer("A B C");
	  
      while(st.hasMoreTokens())
        System.out.println(st.nextToken());
  }
}
