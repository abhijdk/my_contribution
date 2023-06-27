package may_exm1;
	
	
	public class Array_a13 {
	 
	public static void main(String[] args) {
	
		   String[] arr = {"aaa","bbb","ccc","ddd","eee","bbb"};
		   
		   
		   for(int i=0;i<arr.length-1;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   if(arr[i].equals(arr[j]) && (i!=j)) {
					   System.out.println("Duplicate Element : "+arr[j]);
				   }
			   }
		   }
		}
	}
