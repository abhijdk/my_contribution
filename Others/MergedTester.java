package may_exm1;

import java.util.*;

public class MergedTester 
{	
	 public static void main(String[] args) {
	        List<String> list1 = Arrays.asList("Rohit", "Arjun", "Mayank");
	        List<String> list2 = Arrays.asList("Amiya", "Ranjan", "Bala");

	        List<String> mergedList = MergedList.getLists(list1, list2);
	        System.out.println(mergedList);
	    }
}