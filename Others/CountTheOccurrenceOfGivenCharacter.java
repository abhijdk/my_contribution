package mar_14_2023;
/*
Write a program to count the occurrence of a given character in the existing String
 */
//import java.util.Scanner;
//
//public class CountTheOccurrenceOfGivenCharacter 
//{
//	public static void string(String s, char ch)
//	{ 
//		int count=0;
//		for (char c: s.toCharArray())
//		{
//			if (c==ch)
//				count++;
//		}
//		System.out.println(" CountTheOccurrence "+ch+ " is "+count );
//	}
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter an Input String: ");
//		String s= sc.next();
//		System.out.print("count a specified character");
//		char ch=sc.next().charAt(0);/**/
//		//String s="back";/**/
//		string(s,ch);
//	}
//}

public class CountTheOccurrenceOfGivenCharacter {
    public static void main(String[] args) {
        String input = "Hello, World!";
        char target = 'o';

        int count = countCharacterOccurrences(input, target);

        System.out.println("Occurrences of '" + target + "': " + count);
    }

    public static int countCharacterOccurrences(String input, char target) {
        int count = 0;

        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character matches the target character
            if (ch == target) {
                count++;
            }
        }

        return count;
    }
}
