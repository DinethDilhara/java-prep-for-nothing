public class Q27_CharCaseChecker {

/*
    27. Write a Java program to check whether a given char is a lowercase or uppercase
*/


    public static void main(String[] args) {
        caseChecker('A');
        caseChecker('v');
    }

    static void caseChecker(char Char){

        if (Char >= 'a' && Char <= 'z') {
            System.out.println("The entered character is lowercase.");
        } else if (Char >= 'A' && Char <= 'Z') {
            System.out.println("The entered character is uppercase.");
        } else {
            System.out.println("The entered character is not a valid alphabet character.");
        }

    }
}
