package may_exm1;

import java.util.Arrays;

public class Array_a45{
   public static void main (String[] args) {
	   int arr[]= {10,20,30,40,50,3,0,0,13,23,33,43,53,0};
	   int temp=arr[0];
	   
	   arr[0]=arr[arr.length-1];
	   arr[arr.length-1]=temp;
	   System.out.println(Arrays.toString(arr));
   }
}
