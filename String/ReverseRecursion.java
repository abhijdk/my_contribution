import java.util.*;
class ReverseRecursion {
 void reverseString(String str1) {
  if ((str1 == null) || (str1.length() <= 1))
   System.out.println(str1);
  else {
   System.out.print(str1.charAt(str1.length() - 1));
   reverseString(str1.substring(0, str1.length() - 1));
  }
 }
 public static void main(String[] args) {
  String str1 = "The quick brown fox jumps";
  System.out.println("The given string is: " + str1);
  System.out.println("The string in reverse order is:");
  Main obj = new Main();
  obj.reverseString(str1);
 }
}
