public class Q13_PrimeNumberChecker {

/*
    13. Implement a Java program to check whether a given number is a prime number or not.
*/


    public static void main(String[] args) {

        int num = 11;
        boolean is = isPrime(num);
        primeChecker(is);

    }

     static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeChecker(boolean is){
        if (is){
            System.out.println("is a prime number ");
        }else {
            System.out.println(" not a prime number");
        }
    }




}
