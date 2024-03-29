public class Q24_ReverseStringWordByWord {

/*
    24. Write a Java program to reverse a sentence word by word.
*/

    public static String reverseSentence(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {

        String reversedSentence = reverseSentence("My Name Is Dineth");

        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
