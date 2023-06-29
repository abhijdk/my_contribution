package may_exm1;


public class Array_a23 {
  public static void  main(String[] args)
  {
	  int arr1[]= {1,2,3,4,5,8,7};
	  int arr2[]= {1,2,3,4,5,8,7};
	  
	  int c=0;
	  for(int i=0;i<arr1.length;i++) {
		  if(arr1[i]==arr2[i])
		  {
			  c++;
		  }
	  }
	  if(c==arr1.length)
		  System.out.println("==");
	  else
		  System.out.println("!=");
  }
}
