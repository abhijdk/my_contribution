package may_exm1;


public class Array_a24 {
  public static void  main(String[] args)
  {
	  int arr[]= {1,2,3,4,5,6,7,8,9,11};
	  
	  for(int i=arr[0];i<arr.length-1;i++) {
		  if((arr[i]+1)!=arr[i+1]) {
			  System.out.println("Missing Number is: "+(arr[i]+1));
		  }
	  }
  }
}
