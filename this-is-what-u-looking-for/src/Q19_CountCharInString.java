public class Q19_CountCharInString {

/*
    19. Implement a Java program to count the frequency of each character in a given string.
*/


    public static void main(String[] args) {
        charCounter("my name is dineth",'e');
        charCounter("hello world !",'l');
    }

    static void charCounter(String str , char a){


        int counter = 0;

        for (char i : str.toLowerCase().toCharArray()){
            if(i == a){
                counter+=1;
            }
        }
        System.out.printf("In %s there are %d , char of %s %n",str,counter,a);
    }

}
