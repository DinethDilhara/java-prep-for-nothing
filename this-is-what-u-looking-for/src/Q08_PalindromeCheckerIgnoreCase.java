public class Q08_PalindromeCheckerIgnoreCase {

/*
    8. Create a Java program to check whether a given string is a palindrome or not (ignore case).
*/

    public static void main(String[] args) {

        palindromeChecker("dineth");
        palindromeChecker("dinethhtenid");

    }

    static void palindromeChecker(String str){

        StringBuilder revStr = new StringBuilder(str);

        if(str.equalsIgnoreCase(String.valueOf(revStr.reverse()))){
            System.out.printf("%s is a palindrome word %n",str);
        }else {
            System.out.printf("%s is not a palindrome word %n",str);
        }

    }
}
