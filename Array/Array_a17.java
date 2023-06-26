package may_exm1;

import java.util.Arrays;
public class Array_a17 {
	public static void main(String[] args) {
			int[] arr = {1,2,2,1,5,4,6,6,5};
			Arrays.sort(arr);
			
			int index=arr.length-1;
			
			while(arr[index]==arr[arr.length-1]) {
				index--;
			}
			System.out.println(arr[index]);
	}
}
