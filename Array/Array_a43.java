package may_exm1;


public class Array_a43{
   public static void main (String[] args) {
	   int arr[]= {10,20,30,40,50,3,0,0,13,23,33,43,53,0};
	   
	   for(int i=0;i<arr.length-3;i++) {
		   for(int j=i+1;j<arr.length-2;j++) {
			   for(int k=j+1;k<arr.length-1;k++) {
				   for(int l=k+1;l<arr.length;l++) {
					   if(arr[i]+arr[j]+arr[k]+arr[l]==53) {
						   System.out.println(arr[i]+","+arr[j]+","+arr[k]+","+arr[l]);
					   }
				   }
			   }
		   }
	   }
   }
}
