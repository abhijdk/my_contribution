package may_exm1;



public class Array_a39{
 public static void main(String[] args)
    {
      int arr[] = {1110, 9, 14, 2, 15, 0, 9};
      int size = arr.length;
        for (int i = 0; i < size; i++) 
        {
            int j;
            for (j = i + 1; j < size; j++) 
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) 
                System.out.print(arr[i] + " ");
        }
    }
}
