public class Q22_PalindromeCheckerConsiderCase {

/*
    22. Implement a Java program to check whether a given string is a valid palindrome or not (considering case and punctuation).
*/


    public static void main(String[] args) {

        palindromeChecker("dineth");
        palindromeChecker("dinethhtenid");

    }

    static void palindromeChecker(String str){

        StringBuilder revStr = new StringBuilder(str);

        if(str.equals(String.valueOf(revStr.reverse()))){
            System.out.printf("%s is a palindrome word %n",str);
        }else {
            System.out.printf("%s is not a palindrome word %n",str);
        }

    }
}

