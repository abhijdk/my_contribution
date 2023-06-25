package may_exm1;


import java.util.Arrays; 
public class Array_a9 {
 
public static void main(String[] args) {

   int[] arr = {1,2,3,4};
   int c=0;
   
   int Index_position = 2;
   int newValue    = 5;
   
   int[] arr2=new int[arr.length+1];
   arr2[Index_position]=newValue;

   
  for(int i=0;i<arr2.length;i++){
	  if(arr2[i]!=arr2[Index_position]) {
		  arr2[i]=arr[c];
		  c++;
	  }
   }
  
  System.out.println("Old Array: "+Arrays.toString(arr));
   System.out.println("New Array: "+Arrays.toString(arr2));
 }
 }
 
