import java.util.InputMismatchException;
import java.util.Scanner;

public class Q43_ValidateIntegerInput {

/*
    43. Validate Integer input between 1-20 .
*/

    public static void main(String[] args) {
        validateInput();
    }

    static void validateInput() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int num = -1;

        while (!isValid) {
            try {
                System.out.print("Enter a number between 1 and 20:");
                num = scanner.nextInt();

                if (num > 0 && num <= 20) {
                    isValid = true;
                } else {
                    System.out.println("Number must be between 1 and 20.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        System.out.printf("input is : %d %n",num);

    }

}
