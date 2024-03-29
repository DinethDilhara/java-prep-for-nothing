public class Q06_GreatestCommonDivisor {

/*
    6. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers.
*/

    /*
Condition :

    - If (b) is equal to 0, the GCD is (a).
    - Otherwise, recursively calculate the GCD of (b) and the remainder of (a) divided by (b),
      until (b) becomes 0.
    - The GCD is the value obtained when \(b\) becomes 0."

     */


    public static void main(String[] args) {

        System.out.println(gcdM1(12,4));

        System.out.println(gcdM2(3,10));

    }

    // GCD of two numbers without recursion
     static int gcdM1(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    // GCD of two numbers using recursion
    static int gcdM2(int a, int b) {
        return b == 0 ? a : gcdM2(b, a % b);
    }

}
