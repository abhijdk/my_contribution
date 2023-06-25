package may_exm1;


import java.util.Arrays;

public class Array_a8 {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		int []a2=new int[a.length];
		for(int i=0;i<a.length;i++) {
				a2[i]=a[i];
		}
		System.out.println("Old array is: "+Arrays.toString(a));
		System.out.println("New Array is: "+Arrays.toString(a2));
	}
}
