package may_exm1;


import java.util.*;
public class Array_a26 {
	public static void main(String[] args) {
		int arr[]= {1,0,2,0,4,0,2,0};
		int newarr[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newarr[count]=arr[i];
				count++;
			}
		}
		for(int x:newarr) {
			System.out.print(x+", ");
		}
	}
}
