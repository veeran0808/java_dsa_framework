package java_dsa_framework_Strings;

/**
 * 📌 **RemoveNonAlphabets - Filter Only Alphabetic Characters from a String**
 *
 * This program removes all non-alphabetic characters from a given string,
 * preserving only uppercase and lowercase letters.
 *
 * 📝 **Key Learning Points**
 *
 * 🔹 **1. String Traversal Efficiently**  
 * - Uses `toCharArray()` to convert the string into an array for in-place modifications.
 * - Prevents unnecessary object creation, making it memory-efficient.
 *
 * 🔹 **2. Character Filtering Using `Character.isLetter()`**  
 * - Checks if a character is a letter (`A-Z` or `a-z`).
 * - Eliminates numbers, special characters, and spaces.
 *
 * 🔹 **3. Efficient String Construction**  
 * - Uses `new String(chars, 0, index)` to create the final output efficiently.
 * - Avoids using `StringBuilder`, keeping memory usage minimal.
 *
 * 🔹 **4. Time Complexity**  
 * - Operates in **O(n) time complexity** due to a single loop over the string.
 * - Uses a direct index assignment approach to store valid characters.
 */
public class S05_RemoveNonAlphabets {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Hello123 @ Java_2024!";

        // Step 2: Convert the string into a character array for efficient modifications
        char[] chars = input.toCharArray(); // Converts string into char array for in-place modifications
        int index = 0; // Keeps track of valid character positions

        // Step 3: Iterate through the character array
        for (char ch : chars) {
            if (Character.isLetter(ch)) { // Check if character is an alphabet (A-Z or a-z)
                chars[index++] = ch; // Store only valid alphabetic characters
            }
        }

        /**
         * Step 4: Create a new String from the modified character array
         * - `chars` → The modified character array with only letters
         * - `0` → Start from the first index
         * - `index` → The number of valid characters stored
         */
        String output = new String(chars, 0, index);

        // Step 5: Print the results
        System.out.println("Input String: " + input);
        System.out.println("Filtered Output: " + output);
    }
}
