package apr_24_2023_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Duplicates {
    private List<Integer> numberList;

    // No-argument constructor
    public Duplicates() {
    }

    // Parameter constructor
    public Duplicates(List<Integer> numberList) {
        this.numberList = numberList;
    }

    // Getter for numberList
    public List<Integer> getNumberList() {
        return numberList;
    }

    // Setter for numberList
    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getDuplicatesList() {
        if (numberList == null || numberList.isEmpty()) {
            return null;
        }

        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (Integer number : numberList) {
            if (!uniqueElements.add(number) && !duplicates.contains(number)) {
                duplicates.add(number);
            }
        }

        return duplicates;
    }
}

public class Find_Duplicates_In_an_arrayList {
    public static void main(String[] args) {
        // Test case 1: Non-null numberList with duplicates
        List<Integer> list1 = new ArrayList<>(List.of(33, 45, 67, 89, 33, 47, 21, 45));
        Duplicates duplicates1 = new Duplicates(list1);
        List<Integer> duplicatesList1 = duplicates1.getDuplicatesList();
        System.out.println(duplicatesList1);  // Output: [33, 45]

        // Test case 2: Non-null numberList with no duplicates
        List<Integer> list2 = new ArrayList<>(List.of(66, 77, 88, 99));
        Duplicates duplicates2 = new Duplicates(list2);
        List<Integer> duplicatesList2 = duplicates2.getDuplicatesList();
        System.out.println(duplicatesList2);  // Output: []

        // Test case 3: Empty numberList
        List<Integer> list3 = new ArrayList<>();
        Duplicates duplicates3 = new Duplicates(list3);
        List<Integer> duplicatesList3 = duplicates3.getDuplicatesList();
        System.out.println(duplicatesList3);  // Output: null

        // Test case 4: Null numberList
        Duplicates duplicates4 = new Duplicates();
        List<Integer> duplicatesList4 = duplicates4.getDuplicatesList();
        System.out.println(duplicatesList4);  // Output: null
    }
}
