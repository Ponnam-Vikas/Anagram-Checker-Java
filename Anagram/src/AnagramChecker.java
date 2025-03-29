import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    
    // Method to verify if two strings are anagrams
    public static boolean isAnagram(String first, String second) {
        // Convert to lowercase and remove spaces
        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, return false immediately
        if (first.length() != second.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        // Sort both character arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // Compare the sorted arrays
        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        // Check if the words are anagrams and display result
        if (isAnagram(word1, word2)) {
            System.out.println("Result: True (The words are anagrams)");
        } else {
            System.out.println("Result: False (The words are not anagrams)");
        }

        input.close();
    }
}


