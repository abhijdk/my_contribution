

/*
 * Here I create class to test Employ class with main method
 * inside main method I create a object of ArrayList class
 * after that I add some Employ details using add method
 * inside add method I just create Employ class Object
 * after that I just sort the data by using
 * 		 Collections class and sort method
 * 		('Collections' is a class in the Java Collections Framework 
 * 		that provides utility methods for working with collections.)
 * 		('sort' is a static method of the Collections class
 * 		 that sorts the elements of a list in ascending order.)
 * then retrieve the data by using Iterator interface
 * 		('Iterator' is an interface in the java.util package that
 * 			 provides a way to iterate over elements in a collection)
 * 	 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo 
{	
		
	public static void main(String [] args)
	{
		ArrayList <Emp_Comparator> al=new ArrayList<Emp_Comparator> ();
		al.add(new Emp_Comparator(100,"CCC","BBSR"));
		al.add(new Emp_Comparator(102,"BBB","BDK"));
		al.add(new Emp_Comparator(104,"AAA","CTC"));
		al.add(new Emp_Comparator(103,"DDD","THD"));
		al.add(new Emp_Comparator(106,"FFF","HDY"));
		al.add(new Emp_Comparator(105,"EEE","KLK"));
		
		Collections.sort(al, new ComparatorLogic());
		
		Iterator <Emp_Comparator> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

