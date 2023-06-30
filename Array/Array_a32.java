package may_exm1;


public class Array_a32 {
		public static void main(String[] args) {
			int arr[]= {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
			int num1=30;
			int num2=120;
			
			for(int i=0;i<arr.length;i++) {
				if(num1<arr[i]&&num2>arr[i]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
