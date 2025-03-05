package java_dsa_framework_Strings;

/**
 * 📌 **Remove Spaces from a String (Optimized)**
 *
 * 📝 **Key Learning Points with Syntax**
 *
 * 🔹 **1. Using `toCharArray()` for Efficient Traversal**
 *   ```java
 *   char[] chars = input.toCharArray();
 *   ```
 * 
 * 🔹 **2. Using `char[]` to Store Non-Space Characters**
 *   ```java
 *   char[] result = new char[input.length()];
 *   ```
 * 
 * 🔹 **3. Constructing a New String from `char[]`**
 *   ```java
 *   String output = new String(result, 0, index);
 *   ```
 * 
 * 🔹 **4. Single Loop Approach (O(n) Complexity)**
 *   - Avoids multiple passes, making it efficient.
 */
public class S04_RemoveSpaces {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Hello World! 123 Testing Java";

        // Step 2: Convert to character array
        char[] chars = input.toCharArray();
        int index = 0; // Tracks position for non-space characters

        // Step 3: Traverse and store only non-space characters
        for (char ch : chars) {
            if (ch != ' ') {
                chars[index++] = ch; // Store non-space character
            }
        }

        // Step 4: Create the final string from non-space characters
        String output = new String(chars, 0, index);

        // Step 5: Print result
        System.out.println("Original String: " + input);
        System.out.println("String Without Spaces: " + output);
    }
}
