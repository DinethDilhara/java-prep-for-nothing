import java.util.Arrays;

public class Q38_RemoveDupInArray {

/*
    38. Write a Java program to remove duplicates from an array.
*/

    static int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 5, 9};

    public static void main(String[] args) {

            int[] uniqueArray = removeDuplicates(array);

            System.out.println("Array without duplicates:");
            System.out.println(Arrays.toString(uniqueArray));
        }

        public static int[] removeDuplicates(int[] array) {

            Arrays.sort(array);

            int index = 0;
            int n = array.length;

            for (int i = 0; i < n; i++) {
                if (i < n - 1 && array[i] != array[i + 1]) {
                    array[index++] = array[i];
                }
            }

            array[index++] = array[n - 1];

            return Arrays.copyOf(array, index);
        }
    }

