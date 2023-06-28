package may_exm1;


public class Array_a27 {
	public static void main(String[] args) {
		int arr[]= {14,2,6,41,7,5,8};
		int odd=0;
		int eve=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				eve++;
			} else {
				odd++;
			}
		}
		System.out.println("No. of odd number is: "+odd);
		System.out.println("No. of even number is: "+eve);
	}
}
