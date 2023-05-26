package mar_01_2023;
import java.util.Scanner;
public class Week
{
	public static String GetDayName(int day)
	{
		String dayName="";
		if (1==day)
			dayName= "Monday";
		else if (2==day)
			dayName= "Tuesday";
		else if (3==day)
			dayName= "Wednesday";
		else if (4==day)
			dayName= "Thursday";
		else if (5==day)
			dayName= "Friday";
		else if (6==day)
			dayName= "Saturday";
		else if (7==day)
			dayName= "Sunday";
		else 
		{
			System.out.println("Please Enter Valid Input\n\t\tTry again");
			Week w =  new Week();
		}
		
		
		return dayName;
	}
	
	{
		System.out.print("Input number: ");
		Scanner sc=new Scanner(System.in);
		System.out.println(GetDayName(sc.nextInt()));
	}
	public static void main(String[] args)
	{
		Week w =  new Week();
	}

}