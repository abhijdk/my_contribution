package may_exm1;


import java.util.Arrays;

public class Array_a52{

	public static void main (String[] args)	{
		int[] a = { 1, 5, 6, 7, 8, 10 };
		
		Arrays.sort(a);
		int max=a[a.length-1];
		int s_max=a[a.length-2];
		System.out.print("Pair is (" + max + ", " + s_max + "), Maximum Product: " + (max*s_max));
	}
}





/* Out Put
Pair is (10, 8), Maximum Product: 80

/**/
