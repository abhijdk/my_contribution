package may_18_2023;

// IdentityHashMap is Internally use == Operator
import java.util.IdentityHashMap;

public class MyHashMap5 {
	public static void main(String[] args) {
		IdentityHashMap<String, Integer> map=new IdentityHashMap<String, Integer>();
		map.put("Omm",1);
		map.put(new String("Omm"),353);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println("..............................................");
		}
	}

