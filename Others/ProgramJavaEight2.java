package Demo;

import java.util.function.Predicate;

//public class ProgramJavaEight2 {
//	public static boolean predicate(int i) {
//		if(i%2==0)
//			return true;
//		return false;
//	}
//    public static void main(String[] args) {
//    	System.out.println(predicate(2));
//    }
//
//}


public class ProgramJavaEight2 {
	
    public static void main(String[] args) {
    	Predicate<Integer> p=i->i%2==0;
    	System.out.println(p.test(52));
    }

}
