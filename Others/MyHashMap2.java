package may_18_2023;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap2 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>(10,8.5f);
		map.put(1, "C");
		map.put(2, "C++");
		map.put(3,"Java");
		map.put(4, ".net");
		System.out.println("..............................................");

		String val=(String) map.get(4);
		System.out.println("Value for key 4 is: "+val);
		System.out.println("..............................................");
		
		map.remove(4);
		
		String val1=(String) map.get(4);
		System.out.println("Value for key 4 is: "+val1);
		System.out.println("..............................................");
		map.forEach((x,y)->System.out.println(x+" -> "+y));
		}
	}

