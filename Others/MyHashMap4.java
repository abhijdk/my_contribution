package may_18_2023;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap4 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>(10,8.5f);
		map.put("Omm",1);
		map.put(new String("Omm"),353);
		System.out.println(map);
		System.out.println(map.size());
		
		
		String s1="Omm";
		String s2=new String("Omm");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("..............................................");
		String s3="Omm";
		String s4=new String("Omm");
		s3=s4.intern();
		System.out.println(s3==s4);
		}
	}

