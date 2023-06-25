//Find Maximum and Minimum values in an Array in Java

package may_exm1;


public class Array_a10 {
 
public static void main(String[] args) {

	   int[] arr = {11,2,3,1,4,101,-1};
	   int min=arr[0],max=arr[0];

	   for(int i=1;i<arr.length;i++) {
		   if(min>arr[i])
			   min=arr[i];
	   }
	   for(int i=1;i<arr.length;i++) {
		   if(min<arr[i])
		   max=arr[i];
	   }
	   System.out.println(min);
	   System.out.println(max);
	}
}
 
