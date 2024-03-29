public class Q26_ArmstrongNumberChecker {

/*
    26. Create a Java program to check whether a given number is an Armstrong number or not.
*/


    public static void main(String[] args) {
        armStrongChecker(16);

    }

    static void armStrongChecker(int i){

            double sumOfDigits =0;
            int num = i;
            int len = String.valueOf(num).length();

            while (num > 0) {
                int digit = num % 10;
                sumOfDigits += Math.pow(digit, len);
                num /= 10;
            }

            if (i==sumOfDigits){
                System.out.printf("%d is  an armstrong number",i);
            }else {
                System.out.printf("%d is not an armstrong number",i);
            }


    }

}
