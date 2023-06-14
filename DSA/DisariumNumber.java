package june_14_2023;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		System.out.print("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num;
		double sum=0;
		while(a!=0) {
			int mod=a%10;
			int length =(int) (Math.log10(a) + 1);
			sum+=Math.pow(mod, length);
			a/=10;
		}
		if(sum==num) {
			System.out.println(num+" is a Disarium Number");
		}else {
			System.out.println(num+" is not a Disarium Number");
		}
		sc.close();
	}
}

