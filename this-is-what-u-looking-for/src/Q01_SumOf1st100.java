public class Q01_SumOf1st100 {

/*
    1. Write a Java program to calculate the sum of the first 100 natural numbers.
*/

    public static void main(String[] args) {
        sumOfFirstDigits(100);
        sumOfFirstDigits(5);
    }

    static void sumOfFirstDigits(int n){
        int sum = 0;

        for (int i = 0; i <= n ; i++) {
            sum+=i;
        }

        System.out.printf("Sum of first %d number is %d %n",n,sum);
    }
}
