package may_exm1;


public class Array_a27 {
	public static void main(String[] args) {
		int arr[]= {14,2,6,41,7,5,8};
		
		int small=0;
		int large=0;
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[small]>arr[i]) {
				arr[small]=arr[i];
			}
		}
		small=arr[small];
		for(int i=1;i<arr.length;i++) {
			if(arr[large]<arr[i]) {
				arr[large]=arr[i];
			}
		}
		
		System.out.println("Difference between the largest and smallest values of the said array: "+(arr[large]-small));
	}
}
