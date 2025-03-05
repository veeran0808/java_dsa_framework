package java_dsa_framework_Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 📌 **Remove Vowels & Capitalize First Letter of Each Word**
 *
 * 🔹 **Purpose**:
 *   - **Remove vowels (`a, e, i, o, u`)** (both lowercase & uppercase).
 *   - **Capitalize the first letter** of each word after vowel removal.
 *
 * 📝 **Key Learning Points**
 *
 * 🔹 **1. Avoiding Inefficient String Concatenation (`+=`)**
 * - Uses **`ArrayList<Character>`** for character storage.
 * - **Why?** `+=` creates multiple string objects (`O(n²)`), while **list operations are `O(1)`**.
 *
 * 🔹 **2. Character Processing**
 * - Uses `vowelSet.contains(c)` for **faster vowel lookup** (`O(1)`) instead of `indexOf()`.
 * - Processes **each word separately** and **capitalizes** the first letter.
 *
 * 🔹 **3. Performance Improvement**
 * - **Time Complexity:** `O(n)`, as we iterate over characters efficiently.
 * - **Memory Efficient:** Avoids unnecessary string objects.
 *
 * 🔹 **4. Example**
 * - **Input:** `"Hello Automation world"`
 * - **Output:** `"Hll Tmtn Wrld"`
 */
public class S08_RemoveVowelsAndCapitalize {
    public static void main(String[] args) {
        
        // Step 1: Define input string
        String input = "Hello Automation world";

        // Step 2: Define vowels set for quick lookup
        String vowels = "aeiouAEIOU";

        // Step 3: Split input string into words
        String[] words = input.split(" ");

        // Step 4: Process each word and store modified words
        List<String> modifiedWords = new ArrayList<>();

        for (String word : words) {
            List<Character> tempList = new ArrayList<>();

            // Step 5: Remove vowels from the word
            for (char c : word.toCharArray()) {
                if (vowels.indexOf(c) == -1) { // Check if it's NOT a vowel
                    tempList.add(c);
                }
            }

            // Step 6: Capitalize first letter (if the word isn't empty)
            String modifiedWord = listToString(tempList);
            if (!modifiedWord.isEmpty()) {
                modifiedWord = Character.toUpperCase(modifiedWord.charAt(0)) + modifiedWord.substring(1);
            }

            // Step 7: Add processed word to the list
            modifiedWords.add(modifiedWord);
        }

        // Step 8: Join modified words and print the final result
        String modifiedString = String.join(" ", modifiedWords);
        System.out.println("Original String  : " + input);
        System.out.println("Modified String  : " + modifiedString);
    }

    /**
     * 🔹 **Convert List<Character> to String**
     * - Uses `String` constructor for efficient conversion.
     */
    private static String listToString(List<Character> list) {
        char[] charArray = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charArray[i] = list.get(i);
        }
        return new String(charArray);
    }
}
