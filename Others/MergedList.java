package may_exm1;

import java.util.*;

public class MergedList 
{
    public static List<String> getLists(List<String> list1, List<String> list2) 
    {
        Collections.sort(list1);
        Collections.sort(list2);

        List<String> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int size1 = list1.size();//3
        int size2 = list2.size();//3

        while (i < size1 && j < size2) {
            if (list1.get(i).compareTo(list2.get(j)) <= 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < size1) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < size2) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}