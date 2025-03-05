package java_dsa_framework_Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 📌 **S2_CharacterCounter - Analyze Characters in a String**  
 * This class counts and categorizes characters in a given string, including:
 * - Vowels
 * - Consonants
 * - Spaces
 * - Numbers
 * - Special Characters
 * 
 * 📝 **Key Learning Points**
 * 
 * 🔹 **1. String Traversal**
 * - Uses `toCharArray()` to efficiently iterate over characters.
 * 
 * 🔹 **2. Character Classification Methods**
 * - `Character.isWhitespace(ch)`: Identifies spaces.
 * - `Character.isLetter(ch)`: Differentiates letters from numbers and symbols.
 * - `Character.isDigit(ch)`: Identifies numeric characters.
 * 
 * 🔹 **3. Efficient Vowel Lookup**
 * - Uses `String.indexOf(ch) != -1` for quick vowel checking instead of a loop or list lookup.
 * 
 * 🔹 **4. Storing Categorized Characters**
 * - Uses `ArrayList<Character>` to dynamically store vowels, consonants, numbers, and special characters.
 * 
 * 🔹 **5. Performance Considerations**
 * - Implements a **single-loop approach** (O(n) complexity), making it efficient.
 * - Avoids unnecessary object creation, using primitive `int` counters.
 * 
 * 🔹 **6. Extensibility**
 * - Can be easily modified to support additional character sets (e.g., separating uppercase/lowercase).
 */
public class S02_CharacterCounter {
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
        String vowelSet = "aeiouAEIOU";  // String.indexOf() is used for efficient lookup

        // Step 4: Iterate through each character
        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) { // Check for spaces
                spaceCount++;
            } else if (Character.isLetter(ch)) { // Check if it's an alphabet
                if (vowelSet.indexOf(ch) != -1) { // Check if it's a vowel
                    vowelCount++;
                    vowels.add(ch);
                } else {
                    consonantCount++;
                    consonants.add(ch);
                }
            } else if (Character.isDigit(ch)) { // Check for numbers
                numberCount++;
                numbers.add(ch);
            } else { // If it's not a letter, digit, or space, it is a special character
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
