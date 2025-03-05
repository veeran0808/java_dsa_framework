package java_dsa_framework_Strings;
import java.util.ArrayList;
import java.util.List;

public class S2_CharacterCounter {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Hello World! 123 Testing @ Java #2024";

        // Step 2: Initialize counters and collections
        int vowelCount = 0, consonantCount = 0, spaceCount = 0, numberCount = 0, specialCharCount = 0;
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();
        List<Character> specialChars = new ArrayList<>();

        // Step 3: Define the set of vowels for quick lookup
        String vowelSet = "aeiouAEIOU";

        // Step 4: Iterate through each character
        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                spaceCount++; // Count spaces
            } else if (Character.isLetter(ch)) { // Check if it's an alphabet
                if (vowelSet.indexOf(ch) != -1) {
                    vowelCount++;
                    vowels.add(ch);
                } else {
                    consonantCount++;
                    consonants.add(ch);
                }
            } else if (Character.isDigit(ch)) {
                numberCount++;
                numbers.add(ch);
            } else {
                specialCharCount++;
                specialChars.add(ch);
            }
        }

        // Step 5: Print the results
        System.out.println("Input String: " + input);
        System.out.println("Vowel Count: " + vowelCount + " | Vowels: " + vowels);
        System.out.println("Consonant Count: " + consonantCount + " | Consonants: " + consonants);
        System.out.println("Space Count: " + spaceCount);
        System.out.println("Number Count: " + numberCount + " | Numbers: " + numbers);
        System.out.println("Special Character Count: " + specialCharCount + " | Special Characters: " + specialChars);
    }
}
