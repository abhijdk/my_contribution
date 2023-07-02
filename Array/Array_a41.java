package may_exm1;

import java.util.Arrays;

public class Array_a41{
   public static void main (String[] args) {
	   int arr[]= {5,2,-1,-1,5,7,2,1,0};
	   
	   Arrays.sort(arr);
	   
	   int c=1;
	   if(arr[0]==arr[c]) {
		   c++;
	   }
	   System.out.println("Smallest element in the given array is: "+arr[0]+"\n And \n Secomd Smallest element in the given array is: "+arr[c]);
   }
}
