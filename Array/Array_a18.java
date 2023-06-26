package may_exm1;

import java.util.Arrays;
public class Array_a18 {
	public static void main(String[] args) {
		int arr[]= {1,1,2,7,2,4,5,6,8,7};
		
		Arrays.sort(arr);
		
		int index=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[1]==arr[i]) {
				index++;
			}
		}
		System.out.println(arr[index]);		
	}
}


