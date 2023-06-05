package mar_17_2023;
//Write a Program to prove that StringBuilder is faster than StringBuffer.
public class StringBuilderIsFasterThanStringBuffer 
{
	public static void main(String[] args)
	{
		long x=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder("ABHI");
		for (int i=0;i<99999;i++)
		{
			sb.append("JAVA");
		}
		long y=System.currentTimeMillis();
		System.out.println("StringBuilder time: "+ (y-x));
		
		long x1=System.currentTimeMillis();
		StringBuffer sb1=new StringBuffer("ABHI");
		for (int i=0;i<99999;i++)
		{
			sb1.append("JAVA");
		}
		long y1=System.currentTimeMillis();
		System.out.println("StringBuffer time: "+ (y1-x1));
		
		//Who will take less time
		if((y-x)<(y1-x1))
			System.out.println("StringBuilder is faster than StringBuffer");
		else
			System.out.println("StringBuffer is faster than StringBuilder");
	}
}
