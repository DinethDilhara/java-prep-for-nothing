public class Q11_ReverseAnArray {

/*
    11. Create a Java program to reverse the elements of an array.
*/
    static int[] array = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        printReverse();
    }

    static void printReverse(){

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+ " ");
        }
    }
}
