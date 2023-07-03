package may_exm1;

import java.util.Arrays;

public class Array_a49 {
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1,0 };
        System.out.println("Old Array: "+Arrays.toString(arr));
       int count=0;
       for(int i=0;i<arr.length;i++)
    	   if(arr[i]==0)
        	   count++;
       
       for(int i=0;i<count;i++)
    	   arr[i]=0;
       
       for (int i=count;i<arr.length;i++)
    	   arr[i]=1;
      

	   System.out.println("New Array: "+Arrays.toString(arr));
     }       
   }

/* Out Put
Old Array: [0, 0, 1, 1, 0, 1, 1, 1, 0]
New Array: [0, 0, 0, 0, 1, 1, 1, 1, 1]

/**/
