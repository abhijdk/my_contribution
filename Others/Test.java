package may_exm2;

import java.util.*;
import java.util.function.*;


class FindStudent {
    private String name;
    private int id;
  
    public FindStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }
  
    public String getName() {
        return name;
    }
  
    public int getId() {
        return id;
    }
  
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

public class Test {
    public static void main(String[] args) {
        List<FindStudent> sList = new ArrayList<>();

        sList.add(new FindStudent("Ravi", 1));
        sList.add(new FindStudent("Prasanta", 2));
        sList.add(new FindStudent("HK", 3));
        sList.add(new FindStudent("Amresh", 4));

        List<FindStudent> result = add(sList, student -> student.getId() % 1 == 0);

        for (FindStudent student : result) {
            System.out.println(student);
        }
    }

//    Predicate<Integer> p=ids->ids>18;
//	System.out.println(p.test(11));
	
    public static List<FindStudent> add(List<FindStudent> studentList, Predicate<FindStudent> predicate) {
        List<FindStudent> newList = new ArrayList<>();

        for (FindStudent student : studentList) {
            if (predicate.test(student)) {
                newList.add(student);
            }
        }

        return newList;
    }
}


