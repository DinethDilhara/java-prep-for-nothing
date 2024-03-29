public class Q14_Sumof1st100Even {

/*
    14. Create a Java program to find the sum of all even numbers between 1 and 100.
*/

    public static void main(String[] args) {
        sumOfEven(100);
    }
    static void sumOfEven(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even number between 1-100 : " + sum);
    }
}
