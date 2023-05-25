package may_25_2023;

/*
 We have two classes named as FindStudent and Test
For FindStudent class
Instance Variables:
name: String
id: int
Methods:
Two parameterized constructor
FindStudent(String, int) : initialize instance variables
getName(): String
getId() : int
toString() : @Override
For class Test
This class contains main method to test all the solutions for classes and methods and add() method
for main method
Local variable:
studenList : List< FindStudent >
result: List<FindStudent>
print result
for add() method
add(List, Predicate): List< FindStudent >: public: static
Local variable:
newList :  List< FindStudent >
By using for each if pradicate.test of student so, add the elements to newList then return newList
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
        List<FindStudent> studentList = createStudentList();
        List<FindStudent> result = add(studentList, student -> student.getId() > 100);
        printResult(result);
    }

    public static List<FindStudent> add(List<FindStudent> studentList, Predicate<FindStudent> predicate) {
        List<FindStudent> newList = new ArrayList<>();
        for (FindStudent student : studentList) {
            if (predicate.test(student)) {
                newList.add(student);
            }
        }
        return newList;
    }

    private static List<FindStudent> createStudentList() {
        List<FindStudent> studentList = new ArrayList<>();
        studentList.add(new FindStudent("Jaga", 101));
        studentList.add(new FindStudent("Kalia", 102));
        studentList.add(new FindStudent("Depak", 103));
        studentList.add(new FindStudent("Manoj", 104));
        studentList.add(new FindStudent("Manas", 105));
        return studentList;
    }

    private static void printResult(List<FindStudent> result) {
        for (FindStudent student : result) {
            System.out.println(student);
        }
    }
}
