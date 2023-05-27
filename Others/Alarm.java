package mar_02_2023;
import java.util.Scanner;
public class Alarm 
{
	public static String ringAlarm(int day, boolean vacation)
	{
		if(day<=6 && day>=0)
		{
			if (day<=5 && day>=1 && vacation==true)
			{
			
				return "on vacation 10:00";
			}
			else if (day<=5 && day>=1 && vacation==false)
			{
			
				return "not on vacation 07:00";
			}
			else if (day==0 || day==6 && vacation==true)
			{
			
				return "on vacation OFF";
			}
			else if (day==0 || day==6 && vacation==false)
			{
			
				return "not on vacation 10:00";
			}
		}
		else 
		{
			return "Invalid Inputs";
		}
		return null;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number-: ");
		int day=sc.nextInt();
		System.out.println("Enter A String");
		boolean vacation=sc.nextBoolean();
		System.out.println(ringAlarm(day,vacation));
	}
}
