package may_exm1;


import java.util.Arrays;

public class Array_a7 {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		int remove=3;
		
		int []a2=new int[a.length-1];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=remove) {
				a2[c]=a[i];
				c++;
			}
		}
		System.out.println("Old array is: "+Arrays.toString(a));
		System.out.println("Removing element is: "+remove);
		System.out.println("New Array is: "+Arrays.toString(a2));
	}
}
