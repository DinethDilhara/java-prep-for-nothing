public class Q12_FactorialWithRecursion {

/*
    12. Write a Java program to calculate the factorial of a number using recursion.
*/


    public static void main(String[] args) {

        int n = 5;
        long fact = factorialWithRecursion(n);
        System.out.printf("Factorial of %d : %d %n",n,fact);
    }

    public static long factorialWithRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }
    }
}
