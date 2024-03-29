import java.util.Arrays;

public class Q37_SortStringArray {

/*
    37. Write a Java program to sort an array of strings in alphabetical order.
*/
    static String[] strings = {"banana", "apple", "orange", "grape", "kiwi"};

    public static void main(String[] args) {

        Arrays.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }
    }
}


