package may_exm1;

import java.util.Arrays;

public class Array_a16 {public static void main(String[] args) 
    {        
         int[] arr= {1,1,2,3,4,2};
         int unic=unic(arr);
         int[] temp=new int[unic];
         int c=0;
         for(int i=0;i<arr.length-1;i++) {
        	 if(arr[i]!=arr[i+1]) {
        		 temp[c]=arr[i];
        		 c++;
        	 }
         }
         System.out.println(Arrays.toString(temp));
      }


	static int unic(int [] arr) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
       	 if(arr[i]!=arr[i+1]) {
       		 count++;
       	 }
        }
		
		return count;
	}
}
