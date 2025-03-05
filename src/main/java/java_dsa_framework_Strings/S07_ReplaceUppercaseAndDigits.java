package java_dsa_framework_Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 📌 **Replace Uppercase Letters and Digits in a String (Optimized)**
 *
 * 🔹 **Purpose**: Replace:
 *   - **Uppercase letters (A-Z) → '$'**
 *   - **Digits (0-9) → '&'**
 *   - **Other characters remain unchanged**.
 *
 * 📝 **Key Learning Points**
 *
 * 🔹 **1. Using Collections (`ArrayList<Character>`) Instead of `+=`**
 * - **Why?** String concatenation (`+=`) is inefficient (`O(n²)`), so we use a **mutable list**.
 * - **After processing, convert list back to a `String`**.
 *
 * 🔹 **2. Character Processing**
 * - Uses `Character.isUpperCase(c)` for uppercase check.
 * - Uses `Character.isDigit(c)` for digit check.
 *
 * 🔹 **3. Performance Improvement**
 * - **Time Complexity:** `O(n)`, as `ArrayList` operations are `O(1)`.
 * - **Memory Efficient:** Avoids excessive `String` object creation.
 *
 * 🔹 **4. Example**
 * - **Input:** `"Gopikrishna@123gmail.com"`
 * - **Output:** `" $opikrishna@&&&gmail.com"`
 */
public class S07_ReplaceUppercaseAndDigits {
    public static void main(String[] args) {
        
        // Step 1: Define input string
        String input = "Gopikrishna@123gmail.com";

        // Step 2: Use ArrayList to store modified characters
        List<Character> modifiedList = new ArrayList<>();

        // Step 3: Iterate through each character
        for (char c : input.toCharArray()) {

            // Step 4: Apply replacement logic
            if (Character.isUpperCase(c)) {
                modifiedList.add('$'); // Replace uppercase with '$'
            } 
            else if (Character.isDigit(c)) {
                modifiedList.add('&'); // Replace digits with '&'
            } 
            else {
                modifiedList.add(c); // Keep other characters unchanged
            }
        }

        // Step 5: Convert List to String
        String modifiedString = listToString(modifiedList);

        // Step 6: Print results
        System.out.println("Original String  : " + input);
        System.out.println("Modified String  : " + modifiedString);
    }

    /**
     * 🔹 **Convert List<Character> to String**
     * - Uses `String` constructor for efficient conversion.
     * - Avoids multiple string concatenations.
     */
    private static String listToString(List<Character> list) {
        char[] charArray = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charArray[i] = list.get(i);
        }
        return new String(charArray);
    }
}
