package mar_02_2023;

public class PatternOfNumbersAsString 
{
	public  static String numberPattern4(int i)
	{
		if (i<=-1)
		return "-1";	
		else if(i==0)
		return "-2";
		else
		{
			for (int j=1;j<=i;j++)
			{
				for (int k=1;k<=j;k++)
				{
					System.out.print(j*k+"  ");
				}
				System.out.println();
			}
		}
		
		return null;	
	}
	public static void main(String[] args)
	{
		System.out.println(numberPattern4(5));	
	}
}
