package may_exm1;

import java.util.Arrays;

public class Array_a51 {
    public static void main(String[] args)
    {
    	int[] a = { 1, 5, 6, 7, 8, 10 };
    	int[] b = { 2, 4, 9 };
    	
    	System.out.println("Original Arrays:");
		System.out.println("A: " + Arrays.toString(a));
		System.out.println("B: " + Arrays.toString(b));
		
    	
    	int []c=new int[a.length+b.length];
    	int count=0;
    	for(int i=0;i<a.length;i++) {
    		c[i]=a[i];
    		count++;
    	}
    	for(int i=0;i<b.length;i++) {
    		c[count]=b[i];
    		count++;
    	}
    	
    	Arrays.sort(c);
    	count=0;
    	for(int i=0;i<a.length;i++) {
    		a[i]=c[i];
    		count++;
    	}
    	for(int i=0;i<b.length;i++) {
    		b[i]=c[count];
    		count++;
    	}
    	
		
        
		System.out.println("\nSorted Arrays:");
    	System.out.println("A: " +Arrays.toString(a));
    	System.out.println("B: " +Arrays.toString(b));
     }       
   }

/* Out Put
Original Arrays:
A: [1, 5, 6, 7, 8, 10]
B: [2, 4, 9]

Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]

/**/
