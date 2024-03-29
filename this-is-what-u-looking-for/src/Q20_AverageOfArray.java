public class Q20_AverageOfArray {

/*
    20. Create a Java program to find the average of an array of numbers.
*/

    static int[] array = {1,2,3,4,5,6,7,8,9,10};


    public static void main(String[] args) {
        avgOfArray();

    }

    static void avgOfArray(){

       double sum = 0;

        for (int i : array){
            sum += i;
        }

        double avg = sum/ array.length;

        System.out.println("Average of Array is "+ avg);
    }


}
