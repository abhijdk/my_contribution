package mar_10_2023;

import java.util.Arrays;

public class Merge_Two_Array 
{
	public static int [] mergeArrayElements(int [] array1,int [] array2)
	{
		int length=(array1.length+array2.length);
		int newarr[]=new int[length];
		for (int i=0;i<array1.length;i++)
		{
			newarr[i]=array1[i];
		}
		for (int i=0;i<array2.length;i++)
		{
			newarr[i+array1.length]=array2[i];
		}
		return newarr;
	}
	public static void main(String[] args) 
	{
		int[] array1 = {1, 2, 3,5,4,7};
		int[] array2 = {4, 5, 6};
		System.out.println(Arrays.toString(mergeArrayElements(array1,array2)));
	}

}
