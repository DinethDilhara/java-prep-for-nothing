public class Q02_MultiplicationTable {

/*
    2. Create a Java program to print the multiplication table of a given number.
*/

    public static void main(String[] args) {
        calTable(10);
        System.out.println();
        calTable(1);
    }

    static void calTable(int n){
        for (int i = 0; i <= 12; i++) {
            System.out.printf("%d X %d = %d %n",i,n,(i*n));
        }
    }
}
