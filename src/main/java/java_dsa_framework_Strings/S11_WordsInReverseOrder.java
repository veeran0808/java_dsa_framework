package java_dsa_framework_Strings;

import java.util.Arrays;

/**
 * 📌 **Reverse Words in a Sentence Using Two-Pointer Approach**
 *
 * 🔹 **Purpose**:
 *   - Reverse the order of words in a given sentence efficiently.
 *
 * 📝 **Learning Points with Syntax**
 * 🔹 **1. Split String into Words (Array)**
 *     - `String[] words = s.split(" ");` → Splits the string based on spaces.
 * 🔹 **2. Two-Pointer Technique for Swapping**
 *     - `while (left < right) { swap(words[left], words[right]); left++; right--; }`
 * 🔹 **3. Join Words Back into a String**
 *     - `String reversedWordsString = String.join(" ", words);`
 * 🔹 **4. Time Complexity: O(n)** (where `n` is the number of words)
 *
 * **Example**
 * - **Input:** `"Hello automation world"`
 * - **Reversed Output:** `"world automation Hello"`
 */
public class S11_WordsInReverseOrder {

    public static void main(String[] args) {
        // Step 1: Define the input string
        String s = "Hello automation world";

        // Step 2: Split the string into an array of words based on spaces
        String[] words = s.split(" "); // 🔹 Syntax: String[] words = s.split(" ");

        // Step 3: Initialize two pointers for swapping
        int left = 0;
        int right = words.length - 1;

        // Step 4: Reverse the words using the two-pointer technique
        while (left < right) {
            // Swap words at 'left' and 'right' indices
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Step 5: Join the reversed words array back into a single string
        String reversedWordsString = String.join(" ", words); // 🔹 Syntax: String.join(" ", words);

        // Step 6: Print the final reversed string
        System.out.println("Reversed Words: " + reversedWordsString); // Expected Output: "world automation Hello"
    }
}
