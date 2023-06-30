package may_exm1;

import java.util.*;

public class Array_a35 {
    public static void main(String[] args) {
        Integer arr[]= {2,6,4,5,1};
        Set<Integer> ts=new TreeSet<>(Arrays.asList(arr));
        
        List<Integer> al=new ArrayList<>(ts);
        
        Integer large=(al.get(al.size()-1));
        
        for(int i=1;i<arr.length;i++) {
        	if((al.get(i)+al.get(i-1))==large) {
        		System.out.println("Both elements are "+al.get(i-1)+" & "+al.get(i));
        	}
        }
    }
}

