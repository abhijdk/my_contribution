package june.month;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		System.out.print("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=num,k=num;
		int sumPls=0, sumMul=1;
		while(i!=0) {
			int j=(i%10);
			sumPls+=j;
			i=i/10;
		}
		
		while(k!=0) {
			int j=(k%10);
			sumMul*=j;
			k=k/10;
		}
		
		if(sumPls==sumMul) {
			System.out.println(num+" is a Spy Number");
		}else {
			System.out.println(num+" is not a Spy Number");
		}
	}
}
