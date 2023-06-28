	package may_exm1;


public class Array_a30 {
		public static void main(String[] args) {
			int arr[]= {5,-1,0,2,3,4};
			int count=1;
			
			
			for(int i=1;i<arr.length;i++) 
				if(arr[i]!=0||arr[i]!=-1) 
					count++;
			
					
			if(count==arr.length)
				System.out.println("Array contain's 0 & -1");
			else 
				System.out.println("Array Doesn't contain 0 & -1");
		}
	}
