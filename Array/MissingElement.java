package Demo;


public class MissingElement {
 
  public static void main(String[] args){
	  int [] arr= {1,2,3,4,6,7,8,9,10};
	  int sum=((arr[arr.length-1])*(arr[arr.length-1]+1))/2;
	  int actulSum=0;
	  for(int i=0;i<arr.length;i++) {
			  actulSum+=arr[i];
	  }
	  System.out.println("Missing Number is: "+(sum-actulSum));
    }  
}
