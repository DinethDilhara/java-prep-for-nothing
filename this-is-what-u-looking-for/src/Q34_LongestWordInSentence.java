public class Q34_LongestWordInSentence {

/*
    34. Implement a Java program to find the longest word in a given sentence.
*/

        public static void main(String[] args) {

            String longestWord = findLongestWord("My name is dineth dilhara");
            System.out.println("Longest word : " + longestWord);

        }

        public static String findLongestWord(String sentence) {
            String[] words = sentence.split("\\s+");

            String longestWord = "";
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "");

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            return longestWord;
        }

}
