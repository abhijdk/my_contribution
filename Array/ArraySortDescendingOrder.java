package hacker_rank_codes;

import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String ...strin) {
		Integer [] arr= {0,2,4,5,3,1};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}
