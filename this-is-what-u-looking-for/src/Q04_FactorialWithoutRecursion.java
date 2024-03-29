public class Q04_FactorialWithoutRecursion {

/*
    4. Implement a Java program to calculate the factorial of a number without using recursion.
*/

    public static void main(String[] args) {
        calFact(5);
        calFact(0);
    }

    static void calFact(int n){
        int ans = 1;

        for (int i = n; i >= 1 ; i--) {
            ans*=i;
        }
        System.out.printf("Factorial of %d = %d %n",n,ans);

    }
}
