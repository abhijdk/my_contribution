package may_exm1;

import java.util.Arrays;

public class Array_a46{
   public static void main (String[] args) {
	   int arr[]= {-10,10,-20,20,-30,30,-40,40};
	   int arr2[]=new int[arr.length];
	   int c=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]<=-1) {
			   arr2[c]=arr[i];
			   c++;
		   }
	   }
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]>=-1) {
			   arr2[c]=arr[i];
			   c++;
		   }
	   }
	   System.out.println("Old Array: "+Arrays.toString(arr));
	   System.out.println("New Array: "+Arrays.toString(arr2));
   }
}
/*
OUT PUT
  Old Array: [-10, 10, -20, 20, -30, 30, -40, 40]
New Array: [-10, -20, -30, -40, 10, 20, 30, 40]
*/
