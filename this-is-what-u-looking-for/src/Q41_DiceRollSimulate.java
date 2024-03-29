import java.util.Random;

public class Q41_DiceRollSimulate {

/*
    41. Write a Java program to simulate a diceroll.
*/

    public static void main(String[] args) {
        diceRoll();
    }

    static void diceRoll(){

        Random random = new Random();

        int result = random.nextInt(1, 7);

        System.out.println("The result of the dice roll is: " + result);

    }


}
