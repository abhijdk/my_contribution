package mar_08_023;
	import java.util.Arrays;
	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.Scanner;

	public class Array_Duplicate_Elements
	{
		public static void m1(int []arr)
		{//1	2	3	4	1	2	3	4	1	2
			
			for (int i=0;i<arr.length;i++)
			{
				int count=0;
				for (int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						count++;
				}
				if(count==1)
				System.out.println(arr[i]);
				}
			}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner (System.in);
			System.out.print("Enter Array Length");
			int length=sc.nextInt();
			int arr[]= new int[length];
			for (int i=0;i<arr.length;i++)
			{
				System.out.print("\nEnter Array Element ["+i+"]");
				arr[i]=sc.nextInt();
			}
			System.out.println("\n\nArray Elements are\n "+Arrays.toString(arr));
			System.out.println("The Duplicate_Elements of the Array is");
			m1(arr);
			}
	}





