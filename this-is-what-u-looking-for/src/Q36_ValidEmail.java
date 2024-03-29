public class Q36_ValidEmail {

/*
    36. Implement a Java program to check whether a given string is a valid email address or not.
*/


        public static void main(String[] args) {
            //Method 01
            isValidEmailM1("dineth@yahoo.lk");
            isValidEmailM1("dinethdilhara");

            System.out.println();

            //Method 02
            isValidEmailM2("dineth@yahoo.lk");
            isValidEmailM2("dinethdilhara");
        }

    //Method 01
        public static void isValidEmailM1(String email) {

            boolean isValid = email.contains("@") && email.contains(".");

            if (isValid) {
                System.out.println("The email address \"" + email + "\" is valid.");
            } else {
                System.out.println("The email address \"" + email + "\" is not valid.");
            }

        }

    // Method 02
        public static void isValidEmailM2(String email) {
            String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            boolean isValid = email.matches(regex);
            if (isValid) {
                System.out.println("The email address \"" + email + "\" is valid.");
            } else {
                System.out.println("The email address \"" + email + "\" is not valid.");
            }
        }
}
