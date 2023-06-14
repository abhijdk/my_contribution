package june_14_2023;

import java.util.Scanner;

public class HappyNumber {
	static double sum=0;
	public static void happyNumber(int num) {
		int a=num;
		sum=0;
		while(a!=0) {
			int mod=a%10;
			int length =(int) (Math.log10(a) + 1);
			sum+=Math.pow(mod, length);
			a/=10;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter An Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		happyNumber(num);
		if((int)sum>9) {
			happyNumber((int)sum);
		}
		if(sum==1) {
			System.out.println(num+" is a Happy Number");
		}else {
			System.out.println(num+" is not a Happy Number");
		}
		sc.close();
	}
}

