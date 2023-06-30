package may_exm1;


public class Array_a33 {    
	   public static void main(String[] args) {
	        int nums[] = {1,5,8,7,9,6,1,2,3,5,4,6,8,9,6,5,8,5,8};  
			int index=1;
			for(int i=1;i<nums.length;i++) {
				if(nums[i]!=nums[index]) {
					nums[index++]=nums[i];
				}
			}
			System.out.println("\nThe new length of the array is: "+index);
				
	    }
	}
