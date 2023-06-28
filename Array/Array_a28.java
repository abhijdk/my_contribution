	package may_exm1;
	
	
	public class Array_a28 {
		public static void main(String[] args) {
			int arr[]= {14,2,6,41,7,5,8};
			
			int odd=0;
			int even=0;
			
			
			for(int i=1;i<arr.length;i++) {
				if(arr[i]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			
			System.out.println("No Of even Number"+even);
			System.out.println("No Of odd Number"+odd);
		}
	}
