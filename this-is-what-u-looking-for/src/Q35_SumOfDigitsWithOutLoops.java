public class Q35_SumOfDigitsWithOutLoops {

/*
    35. Implement a Java program to find the sum of digits of a number without using loops.
        using Recursion
*/

    public static void main(String[] args) {
            int sum = sumOfDigits(123);
            System.out.println("Sum of digits of the number: " + sum);
        }

        public static int sumOfDigits(int number) {
            if (number < 10) {
                return number;
            }
            return (number % 10) + sumOfDigits(number / 10);
        }
    }


