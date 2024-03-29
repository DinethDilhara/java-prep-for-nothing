public class Q29_SumOfDigits {

    public static void main(String[] args) {
        sumOfDigits(123);
        sumOfDigits(111);

    }

    static void sumOfDigits(int num){
        final int number = num;
        int sumOfDigits = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfDigits += digit;
            num /= 10;
        }

        System.out.printf("Sum of digits of %d is %d %n",number,sumOfDigits);

    }
}
