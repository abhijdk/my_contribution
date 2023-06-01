package mar_14_2023;
/*
Write a program to print all the duplicate characters and count
 how many duplicate characters are present in the given String
 */
import java.util.*;

//import java.util.Scanner;
//
//public class Duplicate_Characters_String 
//{
//	public static void string(String s)
//	{
//
//		s = s.toLowerCase();
//		
//		String dup="";
//		char [] c=s.toCharArray();
//		for (int i=0;i<c.length;i++)
//		{
//			int count=0;
//			for (int j=i+1;j<c.length;j++)
//			{
//				if(c[i]==c[j])
//				{
//					count++;
//				}
//				if(count>1)
//					System.out.println(c[i] +" is " + count+" times ");
//			}
//			
//		}
//	}
//	public static void main(String[] args) 
//	{
//
//		/*Scanner sc=new Scanner(System.in);
//		System.out.print("Enter an Input String: ");
//		String s= sc.next();/**/
//		String s="JAVA IS JAVA";/**/
//		string(s);
//	}
//}

public class Duplicate_Characters_String {
    public static void main(String[] args) {
        String input = "JAVA IS BEST";
        
        // Convert the string to lowercase to treat uppercase and lowercase characters as same
        input = input.toLowerCase();
        
        // Create a map to store the character count
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Ignore non-alphabetic characters
            if (!Character.isAlphabetic(ch)) {
                continue;
            }
            
            // If the character is already present in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Otherwise, add the character to the map with count 1
                charCountMap.put(ch, 1);
            }
        }
        
        // Print the duplicate characters and their counts
        System.out.println("Duplicate characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
