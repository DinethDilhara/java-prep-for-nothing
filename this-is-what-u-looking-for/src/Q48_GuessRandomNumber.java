import java.util.Random;
import java.util.Scanner;

public class Q48_GuessRandomNumber {

    /* Write a program that generates a random number between 1 and 20 and asks the user to guess
    the number. The user should be able to enter a new number if the number is incorrect.
    Note: Use Random to generate a*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int y = random.nextInt(20) + 1; // Random number between 1 and 20
        System.out.println("Random number generated: " + y);

        System.out.println("Enter your guess number between 1-20: ");
        int guessNumber = scanner.nextInt();

        while (y != guessNumber) {
            if (guessNumber < y) {
                System.out.println("Your guess is too low! Try again.");
            } else {
                System.out.println("Your guess is too high! Try again.");
            }
            System.out.println("Enter your guess number between 1-20: ");
            guessNumber = scanner.nextInt();
        }

        System.out.println("Congratulations! You guessed the correct number.");
    }
}

