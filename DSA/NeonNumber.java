package june_14_2023;


import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		System.out.print("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double sqr=Math.pow(num, 2);
		int sqr2=(int)sqr,sum=0;
		while(sqr2!=0) {
			int mod=sqr2%10;
			sum+=mod;
			sqr2/=10;
		}
		if(sum==num) {
			System.out.println(num+" is a Neon Number");
		}else {
			System.out.println(num+" is not a Neon Number");
		}
		sc.close();
	}
}

