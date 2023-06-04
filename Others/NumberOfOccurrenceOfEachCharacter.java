package mar_16_2023;
//Write a program to count number of occurrence of each character in the given String.

public class NumberOfOccurrenceOfEachCharacter
{
	public static void main(String[] args)
	{
        String s = "JAVa";
        s=s.toLowerCase();
        int[] count = new int[122];
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            count[c]++;
        }
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] != 0) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}
