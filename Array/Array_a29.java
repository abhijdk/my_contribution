	package may_exm1;

import java.util.Arrays;

public class Array_a29 {
		public static void main(String[] args) {
			int arr[]= {5,1,2,3,4};
			int sum=0;
			Arrays.sort(arr);
			for(int i=1;i<arr.length-1;i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	}
