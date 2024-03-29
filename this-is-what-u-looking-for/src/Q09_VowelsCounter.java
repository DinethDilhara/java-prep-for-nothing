public class Q09_VowelsCounter {

/*
    9. Write a Java program to count the number of vowels and consonants in a given string.
*/

    static char[] vowels ={'A','E','I','O','U'};

    public static void main(String[] args) {
        vowelCounter("dineth");
        vowelCounter("aeiou");

    }

    static void vowelCounter(String str){
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            for ( char j : vowels ){
                if(str.toUpperCase().charAt(i)==j){
                    counter +=1;
                }

            }
        }
        System.out.printf("%s has %d number of vowels %n",str,counter);

    }
}
