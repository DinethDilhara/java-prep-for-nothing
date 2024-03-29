public class Q28_ReverseDigit {

/*
    28. Implement a Java program to find the reverse of a number.
*/


    public static void main(String[] args) {
        reverseDigitM1(1456);
        reverseDigitM2(123);
    }

    // Method 01
    static void reverseDigitM1(int num){

        String numStr = String.valueOf(num);

        StringBuilder reversedStr = new StringBuilder(numStr).reverse();

        int reversedNum = Integer.parseInt(reversedStr.toString());

        System.out.println("Reverse of " + num + " is: " + reversedNum);

    }

    // Method 02
    static void reverseDigitM2(int num){
        final int number = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse of " + number + " is: " + reversedNum);

    }
}
