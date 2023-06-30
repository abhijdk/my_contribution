	package may_exm1;


public class Array_a31 {
		public static void main(String[] args) {
			int arr[]= {10,20,50,50,80,10,10,5,100};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==10) {
					sum+=arr[i];
				}
			}
			if(sum==30)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
