public class Q33_PascalTriangle {
/*
    33. Write a Java program to print the Pascal's triangle up to n rows.
*/

        public static void main(String[] args) {
            generatePascalsTriangle(6);
        }

        public static void generatePascalsTriangle(int numRows) {
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numRows - i - 1; j++) {
                    System.out.print(" ");
                }
                int value = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(value + " ");
                    value = value * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
}
