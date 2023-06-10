package apr_24_2023_ArrayList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayToList {
    public static List<String> convertToList(String[] inputArray) {
        if (inputArray == null) {
            return null;
        }

        List<String> list = new ArrayList<>(Arrays.asList(inputArray));
        return list;
    }
}

public class TesterArrayToList {
    public static void main(String[] args) {
        // Test case 1: Non-null array
        String[] array1 = {"Apple", "Banana", "Orange"};
        List<String> list1 = ArrayToList.convertToList(array1);
        System.out.println(list1);  // Output: [Apple, Banana, Orange]

        // Test case 2: Null array
        String[] array2 = null;
        List<String> list2 = ArrayToList.convertToList(array2);
        System.out.println(list2);  // Output: null

        // Test case 3: Empty array
        String[] array3 = {};
        List<String> list3 = ArrayToList.convertToList(array3);
        System.out.println(list3);  // Output: []
    }
}
