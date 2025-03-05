package java_dsa_framework_Strings;

import java.util.Arrays;

/**
 * 📌 **Reverse a String Using Two-Pointer Approach**
 *
 * 🔹 **Purpose**:
 *   - Reverse a given string efficiently using a two-pointer approach.
 *
 * 📝 **Learning Points with Syntax**
 * 🔹 **1. Convert String to Character Array**
 *     - `char[] ch = s.toCharArray();` → Converts the string into a character array.
 * 🔹 **2. Two-Pointer Technique for Swapping Characters**
 *     - `while (left < right) { swap(ch[left], ch[right]); left++; right--; }`
 * 🔹 **3. Convert Character Array Back to String**
 *     - `String reversed = new String(ch);`
 * 🔹 **4. Time Complexity: O(n)** (where `n` is the length of the string)
 *
 * **Example**
 * - **Input:** `"automation"`
 * - **Reversed Output:** `"noitamotua"`
 */
public class S10_ReverseString {

    public static void main(String[] args) {
        // Step 1: Define the input string
        String s = "automation";

        // Step 2: Convert the string to a character array
        char[] ch = s.toCharArray(); // 🔹 Syntax: char[] ch = string.toCharArray();

        // Step 3: Initialize two pointers for swapping
        int left = 0;
        int right = ch.length - 1;

        // Step 4: Reverse the character array using the two-pointer approach
        while (left < right) {
            // Swap characters at left and right indices
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        // Step 5: Convert character array back to a string
        String reversed = new String(ch); // 🔹 Syntax: new String(charArray);

        // Step 6: Print the reversed string
        System.out.println("Reversed String: " + reversed); // Expected Output: "noitamotua"
    }
}
