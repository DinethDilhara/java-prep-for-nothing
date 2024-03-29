import java.util.Scanner;
public class Q49_PassWordGuess {
    public static void main(String[] args) {

        /*Write a program that checks if a passcode is correct. The user has 4 attempts to input the
        passcode correctly. The passcode is 486251. To read an int, you can use input.nextInt(). If
        the user enters the passcode correctly should display a message saying “Correct passcode” and
        the program should end.
        Note: Think about which control structure you will use to allow the user inserting a maximum of 4
        passcodes. Do not repeat your code 4 times. Will you use an if, a for loop, a while loop, a switch?
        Think about the most adequate control structure.*/

        Scanner scanner = new Scanner(System.in);

        final int Pc = 486251 ;

        System.out.println("------------------------------");
        System.out.println("You only have 4 chances only !");
        System.out.println("------------------------------");

        for (int i =1; i<=4; i++) {

            System.out.println("This is ur "+ i +" chance");
            System.out.print("enter 6 pin passcode : ");
            int Tn = scanner.nextInt();

            String pc = Integer.toString(Tn);

            int length = pc.length();

            if (length==6){
                if(Pc == Tn){
                    System.out.println("Correct Passcode !");
                    break;
                }else {
                    System.out.println("Incorrect Passcode !");
                }
            }else {
                System.out.println("Incorrect Passcode !");
                System.out.println("passcode must have 6 integers ");
            }

            System.out.println();

            if (i==4 && Pc!=Tn){
                System.out.println("Horek Horek !");
            }
        }
    }
}

