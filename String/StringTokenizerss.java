package hacker_rank_codes;
import java.util.*;
public class StringTokenizerss{
  public static void main(String [] args){
    StringTokenizer st=new StringTokenizer("A/B/C","/");
    while(st.hasMoreElements()){
      System.out.println(st.nextElement());
    }
  }
}
