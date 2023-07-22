package Demo;
import java.util.Scanner;

public class ReadLinesUntilEOF {
    public static void main(String[] args) {
    	System.out.println("Entr Something");
    	Scanner sc=new Scanner(System.in);
    	int line=0;
    	while(sc.hasNext()) {
    		line++;
    		System.out.println(line+" "+sc.nextLine());
    	}
    	sc.close();
    }
}
