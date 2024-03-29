public class Q40_FindElementInArray {
    
/*
    40. Find a given element's position in array
    
*/
    static int[] array = {1,2,3,4,5,6};

    public static void main(String[] args) {
        findElement(3);
        findElement(9);
    }

    static void findElement(int numToFind){

        boolean found = false;
        int position = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numToFind) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + numToFind + " found at position " + position);
        } else {
            System.out.println("Element " + numToFind + " not found in the array");
        }
    }
}

