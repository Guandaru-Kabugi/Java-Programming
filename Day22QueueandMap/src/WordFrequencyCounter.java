import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph of text:");
        String paragraph = scanner.nextLine();

        String normalizedText = normalizeText(paragraph);
        String[] words = normalizedText.split(" ");
        // a different way of initializing an array
        //we use the method that splits the string into separate words

        HashMap<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
            }
            //example is usage
            //first iteration, the first word in the array is not in the hashmap
            //it is then added with a value of 1
            //if the word is found again, we add plus 1 to it
        }
        //we update tracking based on which word is repeated the most

        String mostFrequentWord = null;
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        if (mostFrequentWord != null) {
            System.out.println("Most frequent word: \"" + mostFrequentWord + "\" with frequency: " + maxFrequency); //added quotations to a variable
        } else {
            System.out.println("No valid words found in the input.");
        }
        scanner.close();
    }

    private static String normalizeText(String text) {
        StringBuilder normalized = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            //Removes punctuation and special characters (keeps only letters, digits, and spaces).
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }
        return normalized.toString();
    }
}
