package may_exm1;

import java.util.*;

public class MyArrayList_Duplicates
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(al);
		System.out.println(lhs);
	}
}
