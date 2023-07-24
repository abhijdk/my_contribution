package Demo;

import java.util.*;

public class  Solution2{
	public static void main(String ...stri) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter 1st Number");
			int i=sc.nextInt();
			System.out.println("Enter 2nd Number");
			int j=sc.nextInt();
			System.out.println(i/j);
		}catch(InputMismatchException e) {
		System.out.println("java.util.InputMismatchException");
		}catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}
}
