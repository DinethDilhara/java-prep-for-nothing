public class Q30_AmrstorngInFirst500 {

/*
    30. print first armstrong number between 1-500.
*/


    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            double sumOfDigits = 0;
            int num = i;
            int len = String.valueOf(num).length();
            while (num > 0) {
                int digit = num % 10;
                sumOfDigits += Math.pow(digit, len);
                num /= 10;
            }

            if (i == sumOfDigits) {
                System.out.println("this is a ars num " + i);
            }
        }

    }
}
