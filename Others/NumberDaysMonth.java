package mar_01_2023;
import java.util.Scanner;
public class NumberDaysMonth 
{
	public static void m1(int num, int year)
	{
		int day=0;
		String month=""; 
		if (year/4==0) {
		
		
			switch (num)
			{
				case 1:
					day=31;
					month= "Jan";
						break;
				case 2:
					day=29;
					month="Feb";
						break;
				case 3:
					day=31;
					month="Mar";
						break;
				case 4:
					day=30;
					month="April";
						break;
				case 5:
					day=31;
					month="May";
						break;
				case 6:
					day=30;
					month="Jun";
						break;
				case 7:
					day=31;
					month="July";
						break;
				case 8:
					day=31;
					month="Aug";
						break;
				case 9:
					day=30;
					month="Sept";
						break;
				case 10:
					day=31;
					month="Oct";
						break;
				case 11:
					day=30;
					month="Nov";
						break;
				case 12:
					day=31;
					month="Dec";
						break;
			}
			System.out.println(month+ " "+year+" has " + day + " days");
		}
			else 
		{
			switch (num)
			{
			case 1:
				day=31;
				month= "Jan";
					break;
			case 2:
				day=28;
				month="Feb";
					break;
			case 3:
				day=31;
				month="Mar";
					break;
			case 4:
				day=30;
				month="April";
					break;
			case 5:
				day=31;
				month="May";
					break;
			case 6:
				day=30;
				month="Jun";
					break;
			case 7:
				day=31;
				month="July";
					break;
			case 8:
				day=31;
				month="Aug";
					break;
			case 9:
				day=30;
				month="Sept";
					break;
			case 10:
				day=31;
				month="Oct";
					break;
			case 11:
				day=30;
				month="Nov";
					break;
			case 12:
				day=31;
				month="Dec";
					break;
		}
			System.out.println(month+ " " +year+" has " + day + " days");
		}
		
	}

	{
		Scanner sc= new Scanner(System.in);	
		System.out.print("Enter Month Number");
		int num=sc.nextInt();
		System.out.print("Enter Year");
		int year= sc.nextInt();
		if (year<=0) {
			System.out.println("Enter valid Input");
		NumberDaysMonth n= new NumberDaysMonth();
		}
		else if(num<=12)
			m1(num, year);
		else
		{
			System.out.println("Enter valid Input");
		NumberDaysMonth n= new NumberDaysMonth();
		}
		
	}
	
public static void main(String[] args)
{
	NumberDaysMonth n= new NumberDaysMonth();
}
}
	

