package Demo;

//public class ProgramJavaEight {
//	public static int squre(int i) {
//		return i*i;
//	}
//    public static void main(String[] args) {
//    	System.out.println(squre(5));
//    }
//
//}

import java.util.function.Function;

public class ProgramJavaEight {
	
    public static void main(String[] args) {
    	Function<Integer, Integer> f=i->i*i;
    	System.out.println(f.apply(5));
    }

}
