public class Q42_PassWordGenerate {

/*
    42. Write a Java program to generate a random password of a specified length.
*/


    public static void main(String[] args) {
        String passWord = generateRandomPassword(8);
        System.out.printf("Your Password is : %s %n",passWord);

    }

    public static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
