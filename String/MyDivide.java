package Demo;

public class Main {
    public static void main(String[] args) {
       String s="ABCDEFGHIJKLMNOP";
       double sqrt=Math.sqrt(s.length());
       char ch[]=s.toCharArray();
       int count=0;
       for(int i=0;i<sqrt;i++) {
    	   String news="";
    	   for(int j=0;j<sqrt;j++) {
    		   news+=ch[count];
    		   count++;
    	   }
    	   System.out.println(news);
    	   news="";
       }
    }
}
