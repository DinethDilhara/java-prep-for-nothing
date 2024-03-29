public class Q07_SwapTwoNumWithoutTemp {

/*
    7. Implement a Java program to swap two numbers without using a temporary variable.
*/

    public static void main(String[] args) {
        swapTwoNum(10,5);
        System.out.println();
        swapTwoNum(2,4);
    }

    static void swapTwoNum(int num1, int num2){

        System.out.printf("Before Swap number 1 : %d and number 2 : %d %n",num1,num2);

                             // num1 = 10  num2 = 5
        num1 = num1 + num2;  // num1 = 10 + 5 => num1 = 15
        num2 = num1 - num2;  // num2 = 15 - 5 => num2 = 10
        num1 = num1 - num2;  // num1 = 15 - 10 => num1 =5

        System.out.printf("After Swap number 1 : %d and number 2 : %d %n",num1,num2);

    }

}
