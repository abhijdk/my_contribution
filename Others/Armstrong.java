package mar_01_2023;
import java.util.Scanner;
public class Armstrong 
{
public static String m1()
{	
	System.out.print("Enter A Number");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt(),i=num,j=num,amg=0,val=0;
	
	
	int count=0;
	while (i!=0)
	{
		count++;
		i=i/10;
	}
	if (num<=0) 
	{
		amg=-1;
		return ""+amg;
	}
	else if(count==4)
	{
		
		while (j!=0)
		{
			int jj=(j%10);
			amg = amg + ((int)  (Math.pow(jj, 4)));   
			j=j/10;
			
		}
		if (num==amg)
		{
			String s= "Is a Amstrong";
			return ""+s;
		}
		else
		{
			String s= "Is not a Amstrong";
			return ""+s;
		}
		
	}
	else
	{
		amg=-2;
		return ""+amg;
	}
	
}
public static void main(String[] args) 
{
	System.out.println(m1());
//	m1();
}
}
