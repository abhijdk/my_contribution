package Demo;

import java.util.*;
import java.text.*;

public class DateTimePrinting {
    public static void main(String[] args) {
    	SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
    	Date d=new Date();
    	String s=sdf.format(d);
    	System.out.println(s);
    }
}
