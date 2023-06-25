package may_exm1;

public class Array_6 {
    public static int  findIndex (int[] arr, int t) {
    	int length=arr.length;
    	int i=0;
    	while (i<length) {
    		if(arr[i]==t) {
    			return i;
    		}
    		else {
    			i++;
    		}
		}
    	return -1;
 }
 public static void main(String[] args) {
   int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   System.out.println("Index position of 25 is: " + findIndex(arr, 25));
   System.out.println("Index position of 77 is: " + findIndex(arr, 77));
    }
}

