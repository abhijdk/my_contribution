import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String input1 = "Mam";
        String input2 = "Morning";

        boolean isAnagram1 = checkAnagram(input1.toLowerCase(), input1.toLowerCase());
        boolean isAnagram2 = checkAnagram(input2.toLowerCase(), input2.toLowerCase());

        System.out.println(input1 + " - " + (isAnagram1 ? "It's an Anagram" : "Not an Anagram"));
        System.out.println(input2 + " - " + (isAnagram2 ? "It's an Anagram" : "Not an Anagram"));
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
