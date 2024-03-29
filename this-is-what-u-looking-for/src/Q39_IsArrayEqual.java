import java.util.Arrays;

public class Q39_IsArrayEqual {

/*
    39. Write a Java program to check if two arrays are equal or not.
*/

    static int[] array01 = {1, 2, 3, 4, 5, 6};
    static int[] array02 = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        checkIfTwoArraysEqual();
    }

    static void checkIfTwoArraysEqual() {
        Arrays.sort(array01);
        Arrays.sort(array02);

        boolean isEqual = true;

        if (array01.length == array02.length) {
            for (int i = 0; i < array01.length; i++) {
                if (array01[i] != array02[i]) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("Arrays are Equal !");
        } else {
            System.out.println("Arrays are not Equal !");
        }
    }

}
