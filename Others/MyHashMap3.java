package may_18_2023;

//Collection vies mathods [keySet(),  values(), entrySet()]
import java.util.HashMap;
import java.util.Map;

public class MyHashMap3 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "C");
		map.put(2, "C++");
		map.put(3,"Java");
		map.put(4, ".net");
		
		map.forEach((x,y)->System.out.println(x+" -> "+y));
		System.out.println("..............................................");
		System.out.println("Return Old Object Vlaue "+ map.put(4, "Python")); //Return Old Object Vlaue .net
		System.out.println("...after insert map.put(4, \"Python\").........");
		for (Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+"->"+m.getValue());
		}
	}
}
