package mar_10_2023;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewElementInTheExistingarray
{
	public static int[] addElement(int [] arr, int ele)
	{
		Scanner sc=new Scanner(System.in);
		int length=arr.length+ele;
		//int k=arr.length;
		int newArr[]=new int[length];
		for (int i=0;i<arr.length;i++)
		{
			newArr [i]=arr[i];
		}
		for(int i=arr.length;i<newArr.length;i++) {
			System.out.print("Enter the element you want to insert");
			int element=sc.nextInt();
			newArr[i]= element;
		}
		
		/*for (int i=0;i<ele;i++)
		{
			System.out.print("Enter element ["+i+"]");
			arr[i]=sc.nextInt();
			newArr [i+arr.length]=arr[i];
		}*/
		
		
		return newArr;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3};
		System.out.println(Arrays.toString(addElement(arr,5)));
	}
}
