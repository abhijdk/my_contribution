package Array;

public class Array3 
{
	public static void main(String[] args) 
	{
		int []x = {55,12,78,45,89,75};
		int []y = {56,12,78,45,89,75};
		boolean b = commonEnd(x, y);
		System.out.println(b);
	}

	public static boolean commonEnd(int[] a, int[] b) 
	{
		if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) 
			return true;
		else
		    return false;
	}

}