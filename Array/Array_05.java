package may_exm1;


public class Array_05 {
	  public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {111,222,333,444,555,666,777,888,999};
	      System.out.println(contains(my_array1, 111));
	      System.out.println(contains(my_array1, 2015));
	   }
	}
