package may_exm1;


import java.util.Arrays; 
public class Exercise_a1 {
public static void main(String[] args){   
    
    int[] my_array1 = {1,5,88,4,41,2};
            
    String[] my_array2 = {"JAGA","MANOJ","MANAS","DEPAK"};        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
