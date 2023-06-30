package may_exm1;

import java.util.*;

public class Array_a34 {    
   public static void main(String[] args) {
        int arr[] = {49, 3, 200, 2, 4, 70, 5};
        int small=arr[0];
        for(int i=1;i<arr.length;i++) {
        	if(small>arr[i]) {
        		small=arr[i];
        	}
        }
        TreeSet<Integer> hs=new TreeSet<>();
       	for(int i=0;i<arr.length;i++)
        	hs.add(arr[i]);
       	
       	int c=0;
       	
       	System.out.println("consecutive elements sequence is:");
       	for(int i:hs) {
       		if(small==i) {
       			small++;
       			c++;
       			System.out.println(i);
       		}
       	}
       	System.out.println("\n\nThe new length of the array is: "+c);	
    }
}
