import java.util.Random;

public class Q15_GenerateRandomNumber {

/*
    15. Write a Java program to generate a random number between 1 and 100.
*/
    public static void main(String[] args) {

    Random random = new Random();
    int randomNum = random.nextInt(100) + 1;

    System.out.println("random number between 1-100 is "+ randomNum);

   }

}
