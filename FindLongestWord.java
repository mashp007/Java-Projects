/*
 
1. The program first creates a Scanner object to read input from the user.
2. Then, it asks the user to enter a sentence.
3. The program then splits the sentence into words using the `split()` method. The `split()` method returns an array of strings, where each string is a word in the sentence.


String[] words = sentence.split(" ");


4. The program then initializes two variables: `maxLength` and `longestWord`. `maxLength` stores the length of the longest word in the sentence. `longestWord` stores the actual longest word in the sentence.


int maxLength = 0;
String longestWord = "";


5. The program then iterates through the words array. For each word, the program checks if its length is greater than `maxLength`. If it is, then the program updates `maxLength` and `longestWord` to store the length and the word, respectively.


for (String word : words) {
  if (word.length() > maxLength) {
    maxLength = word.length();
    longestWord = word;
  }
}


6. Finally, the program prints the value of `longestWord`.


System.out.println("The longest word is: " + longestWord);



 */


import java.util.Scanner;

public class FindLongestWord {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a sentence:");
    String sentence = scanner.nextLine();

    String[] words = sentence.split(" ");
    int maxLength = 0;
    String longestWord = "";

    for (String word : words) {
      if (word.length() > maxLength) {
        maxLength = word.length();
        longestWord = word;
      }
    }

    System.out.println("The longest word is: " + longestWord);
  }
}
