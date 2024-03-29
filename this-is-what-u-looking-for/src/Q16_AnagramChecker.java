import java.util.Arrays;

public class Q16_AnagramChecker {

/*
    16. Implement a Java program to check whether a given string is an anagram of another string.
*/


    public static void main(String[] args) {
        areAnagrams("sing","sign");

        areAnagrams("dineth","dilhara");
    }

     static void areAnagrams(String str1, String str2) {
        // Remove whitespace and convert strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Sort the characters in both strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean result =Arrays.equals(charArray1, charArray2);


        if (result) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }




}
