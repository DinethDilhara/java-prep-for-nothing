public class Q32_DecimalToBinary {

/*
    32. Implement a Java program to convert a decimal number to binary.
*/

        public static void main(String[] args) {

            String binary = convertToBinaryM1(10);
            System.out.println("Binary equivalent: " + binary);
        }

        public static String convertToBinaryM1(int decimal) {
            if (decimal == 0) {
                return "0";
            } else if (decimal == 1) {
                return "1";
            } else {
                return convertToBinaryM1(decimal / 2) + (decimal % 2);
            }
        }
}
