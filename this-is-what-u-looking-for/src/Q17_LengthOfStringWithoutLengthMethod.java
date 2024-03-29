public class Q17_LengthOfStringWithoutLengthMethod {

/*
    17. Create a Java program to find the length of a string without using the length() method.
*/
    static void findLength(String str) {
        int length = 0;

        for (char c : str.toCharArray()) {
            /*System.out.print(c +" ");*/
            length++;
        }

         System.out.println("Length of the string: " + length);    }

    public static void main(String[] args) {
        String str = "Dineth ";
        findLength(str);
    }
}
