package may_exm1;


import java.util.Arrays;

public class Array_a53{

	public static void main (String[] args)	{
		int[] a = { 1, 5, 6, 7, 8, 10 };
		System.out.println("Shuffle Array: "+Arrays.toString(a));
		int length=a.length;
		int half=length/2;
		
		for(int i=0;i<length/2;i++) {
			int temp=a[i];
			a[i]=a[half];
			a[half]=temp;
			half++;
		}
		System.out.println("Shuffle Array: "+Arrays.toString(a));
	}
}





/* Out Put
 * Shuffle Array: [1, 5, 6, 7, 8, 10]
 * Shuffle Array: [7, 8, 10, 1, 5, 6]
 */
/**/
