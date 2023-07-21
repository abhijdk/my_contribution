package Demo;

import java.util.Scanner;

public class MonthDay{
	public static void main(String ...d) {
		int day=0;
		String monthName="Unknown";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Month Number:-");
		int month=sc.nextInt();
		
		System.out.print("Enter Year:- ");
		int year=sc.nextInt();
		
		switch (month) {
		case 1:
			monthName="January";
			day=31;
			break;
		case 2:
			monthName="February";
			if((year%400==0) || (year%4 == 0) && year%100!=0) {
				day=29;
			}else
				day=28;
			break;
		case 3:
			monthName="March";
			day=31;
			break;
		case 4:
			monthName="April";
			day=30;
			break;
		case 5:
			monthName="May";
			day=31;
			break;
		case 6:
			monthName="June";
			day=30;
			break;
		case 7:
			monthName="July";
			day=31;
			break;
		case 8:
			monthName="August";
			day=31;
			break;
		case 9:
			monthName="September";
			day=30;
			break;
		case 10:
			monthName="October";
			day=31;
			break;
		case 11:
			monthName="November";
			day=30;
			break;
		case 12:
			monthName="December";
			day=31;
		}
		System.out.println(monthName + " " + year + " has " + day + " days\n");
	}
}
;
