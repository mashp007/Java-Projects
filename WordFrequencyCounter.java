/*
 * Project Name: Word Frequency Counter

Project Description:

The Word Frequency Counter is a Java application that allows users to input a text document, and it then analyzes and displays the frequency of each word in the document.

Key Features:

User Input: The program prompts the user to input a text document (or paste text) from the console.

Word Tokenization: It tokenizes the input text into words, removing punctuation and converting everything to lowercase for consistency.

Word Frequency Count: The program counts the occurrences of each unique word in the input text.

Display Word Frequency: It displays the list of unique words and their respective frequencies in descending order.

Challenges:

Tokenizing the input text into words.
Counting word frequencies using arrays or data structures like HashMap.
Handling punctuation and case sensitivity.
Sorting and displaying the word frequencies in descending order.

        Sample input and output
Please enter the text to analyze (or type 'exit' to quit):
This is a simple text. This is a sample text for word frequency analysis.
Frequency of each word:
- this: 2
- is: 2
- a: 2
- simple: 1
- text: 2
- sample: 1
- for: 1
- word: 1
- frequency: 1
- analysis: 1

 */



import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word Frequency Counter");
        System.out.println("Enter text (or type 'exit' to quit):");

        String inputText = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            inputText += line + " ";
        }

        if (inputText.trim().isEmpty()) {
            System.out.println("No input provided. Exiting...");
            return;
        }

        // Tokenize the input text into words and remove punctuation
        String[] words = inputText.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Count word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Sort word frequencies in descending order
        List<Map.Entry<String, Integer>> sortedWordFrequency = new ArrayList<>(wordFrequency.entrySet());
        sortedWordFrequency.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display word frequencies
        System.out.println("\nFrequency of each word:");
        for (Map.Entry<String, Integer> entry : sortedWordFrequency) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
