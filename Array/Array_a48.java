package may_exm1;

import java.util.Arrays;

public class Array_a48{
   public static void main (String[] args) {
	   int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100	};
	   Arrays.sort(arr);
	   int arr2[]=new int[arr.length+1];
	   int newarr[]=new int[arr.length];
	   int c=0;
	   int c1=1;
	   
	   for(int i=arr.length-1;i>-1;i--) {
			  arr2[c]=arr[i];
			  c+=2;
			  if(c==arr.length)
				  break;
	   } 
	   for(int i=0;i<arr.length;i++) {
				  arr2[c1]=arr[i];
				  c1+=2;
				  if(c1==arr2.length)
					  break;
	   }
	   for(int i=0;i<arr.length;i++) {
		   newarr[i]=arr2[i];
	   }

	   System.out.println("Old Array: "+Arrays.toString(arr));
	   System.out.println("New Array: "+Arrays.toString(newarr));
   }
}
/* Out Put
Old Array: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
New Array: [100, 10, 90, 20, 80, 30, 70, 40, 60, 50]

/**/
