public class Q10_LargestAndSmallestEleInArray {

/*
10. Implement a Java program to find the largest and smallest elements in an array.
*/

    static int[] array = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        largestNumAndSmallestNum();
    }

    static void largestNumAndSmallestNum(){

        int bn = array[0];
        int sn = array[0];

        for (int i : array){
            if(bn < i){
                bn=i;
            }

            if(sn > i){
                sn=i;
            }
        }
        System.out.printf("Largest number is %d %n",bn);
        System.out.printf("Smallest number is %d %n",sn);

    }



}
