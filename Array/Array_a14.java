package may_exm1;
	
	
	public class Array_a14 {
	 
	public static void main(String[] args) {
	
		   String[] arr = {"aaa","bbb","ccc","ddd","eee"};
		   String[] arr2= {"fff","ggg","hhh","iii","ddd"};
		   
		   
		   for(int i=0;i<arr.length-1;i++) {
			   for(int j=0;j<arr.length;j++) {
				   if(arr[i].equals(arr2[j]) && (i!=j)) {
					   System.out.println("Duplicate Element : "+arr2[j]);
				   }
			   }
		   }
		}
	}
