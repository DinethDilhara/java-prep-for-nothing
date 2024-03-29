public class Q03_SquareRoot {
/*
    3. Write a Java program to find the square root of a given number.
*/

    public static void main(String[] args) {
        calSquareRoot(64);
        calSquareRoot(16);
    }

    static void calSquareRoot(int number){

        double ans = Math.sqrt(number);

        System.out.printf("square root of %d is %f %n",number,ans);
    }
}
