package may_18_2023;

//particular key & value is avalable or not in HashMap?
import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("Ravi sir", 1);
		map.put("HK sir", 3);
		map.put("Prasanta sir", null);
		map.put(null, 5);
		
//		map.forEach((x,y)->System.out.println(x+" -> "+y));
		System.out.println("HK sir is avalable or not: "+ map.containsKey("HK Sir"));
		System.out.println("1 is avalable or not as value: "+ map.containsValue(1));
	}
}
