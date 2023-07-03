package may_exm1;

import java.util.Arrays;

public class Array_a50 {
    public static void main(String[] args)
    {
        int arr[] = new int[]{20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int arr2[]=new int[arr.length];
        int c=0;
        System.out.println("Old Array: "+Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        	if(arr[i]%2==0) {
        		arr2[c]=arr[i];
        		c++;
        	}
        
        for(int i=0;i<arr.length;i++)
        	if(arr[i]%2!=0) {
        		arr2[c]=arr[i];
        		c++;
        	}
        	
        	
	   System.out.println("New Array: "+Arrays.toString(arr2));
     }       
   }

/* Out Put

Old Array: [20, 12, 23, 17, 7, 8, 10, 2, 1, 0]
New Array: [20, 12, 8, 10, 2, 0, 23, 17, 7, 1]

/**/
