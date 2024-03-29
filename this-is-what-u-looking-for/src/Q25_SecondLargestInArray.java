public class Q25_SecondLargestInArray {

/*
    25. Implement a Java program to find the second largest element in an array.
*/

    static int[] array = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        findSecondLargestNum();
    }

    static void findSecondLargestNum() {
        int largest = array[0];
        int secondLargest = array[0];

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == largest) {
            System.out.println("There is no second largest number in the array.");
        } else {
            System.out.println("The second largest number in the array is: " + secondLargest);
        }
    }
}
