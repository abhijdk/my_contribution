package may_exm1;



public class Array_a56{
	public static void main(String [] ab) {
		int sum=0, t=1;
		for(int i=1;i<=100;i++) {
			sum=sum+i*t;
			t=t*-1;
		}
		System.out.println(sum);
	}
}




/* Out Put
-500
*/
