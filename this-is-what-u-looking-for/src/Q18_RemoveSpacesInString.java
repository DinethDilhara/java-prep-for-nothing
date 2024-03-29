public class Q18_RemoveSpacesInString {

/*
    18. Write a Java program to remove all white spaces from a given string.
*/

    public static void main(String[] args) {
        removeSpaces("my name is dineth dilhara");
        removeSpaces("remove spaces ");
    }

    static void removeSpaces(String str){
        String str1;

        str1 = str.replaceAll("\\s", "");

        System.out.println(str1);
    }

}
