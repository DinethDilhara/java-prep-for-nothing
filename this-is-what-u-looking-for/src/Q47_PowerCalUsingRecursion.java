public class Q47_PowerCalUsingRecursion {

/*
    47. Write a Java program to calculate the power of a number using recursion.
*/
    public static void main(String[] args) {

        double result = calculatePower(2, 3);
        System.out.println(result);

    }

    public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        if (exponent < 0) {
            return 1 / (base * calculatePower(base, -exponent - 1));
        }
        return base * calculatePower(base, exponent - 1);
    }
}
