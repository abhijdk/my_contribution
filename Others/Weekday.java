package mar_01_2023;
import java.util.Scanner;
public class Weekday
{
	public static String GetDayName(int day)
	{
		String dayName="";
		switch (day)
		{
		case 1:
			dayName= "Monday";
			break;
		case 2:
			dayName= "Tuesday";
			break;
		case 3:
			dayName= "Wednesday";
			break;
		case 4:
			dayName= "Thursday";
			break;
		case 5:
			dayName= "Friday";
			break;
		case 6:
			dayName= "Saturday";
			break;
		case 7:
			dayName= "Sunday";
			break;
		default :
		{
			System.out.println("Please Enter Valid Input\n\t\tTry again");
			Weekday w =  new Weekday();
		}
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
		Weekday w =  new Weekday();
	}
}