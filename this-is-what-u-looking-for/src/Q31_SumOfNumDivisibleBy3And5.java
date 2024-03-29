public class Q31_SumOfNumDivisibleBy3And5 {

/*
    31. Create a Java program to find the sum of natural numbers
    divisible by 3 (or) 5 up to n.
*/

    public static void main(String[] args) {
        sumOfMultiples(10);
    }

    public static void sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                sum += i;
            }
        }

        System.out.println("Sum of natural numbers divisible by 3 or 5 up to " + n + " is: " + sum);
    }


}


