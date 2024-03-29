import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Q46_AgeCalculater {

/*
    46. Write a Java program to calculate a person's age in years, months, and days based on
        their birthdate and the current date.
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth date (yyyy-mm-dd): ");
        String birthDateString = scanner.next();

        LocalDate birthDate = LocalDate.parse(birthDateString);

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");

        scanner.close();
    }
}

