package may_exm1;
	
	
	public class Array_a12 {
	 
	public static void main(String[] args) {
	
		   int[] arr = {8,8,1,6,2,3,1,2,3,4,5};
		   
		   
		   for(int i=0;i<arr.length-1;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   if(arr[i]==arr[j] && (i!=j)) {
					   System.out.println("Duplicate Element : "+arr[j]);
				   }
			   }
		   }
		}
	}
