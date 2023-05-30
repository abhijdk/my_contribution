package may_30_2023;

//Nested if
//big among three number
public class BigAmongThreeNumber
{
public static void main(String args[])
	{
		int a =15;
		int b =18;
		int c =29;

		int big=0;   

		if(a>b)  //(Outer if condition)
		{			
			if(a>c)     //Nested If Block (inner if)        
				big=a;
			else
				big=c;
		}
		else    //already confirmed b is greater than a
		{
			if(b>c)   
				big=b;
			else
				big=c;
		}
	System.out.println("The big number is :"+big);
	}
}

//Note :- In the above program to find out the biggest number among three number we need to take the help of nested if condition but the code becomes complex, to reduce the length of the code Logical Operator came into the picture.
//----------------------------------------------------------------------------------------