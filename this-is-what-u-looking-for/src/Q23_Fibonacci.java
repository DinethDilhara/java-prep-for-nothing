
public class Q23_Fibonacci {

/*
    23. Create a Java program to find the Fibonacci series up to n terms.
*/


    public static void main(String[] args) {

        fibo(6);
    }

    static void fibo(int n){

        int f1 = 1;
        int f2 = 1;

        int NF;

        System.out.print(f1 + ",");
        System.out.print(f2 + ",");

        for (int i = 1; i <= (n - 2); i++) {
            NF = f1 + f2;
            System.out.print(NF + ",");
            f1 = f2;
            f2 = NF;
        }
        System.out.println("\b");

    }
}
