package java_dsa_framework_Strings;

/**
 * 📌 **S3_RemoveVowels - Removing Vowels from a String (Without StringBuilder)**
 * This program removes all vowels (both uppercase and lowercase) from the given string.
 * 
 * 📝 **Key Learning Points**
 * 
 * 🔹 **1. Using Character Arrays (`toCharArray()`)**
 * - Converts the input string into a character array for easy iteration.
 * - Syntax: `char[] charArray = input.toCharArray();`
 * 
 * 🔹 **2. Checking Vowel Membership (`indexOf()`)**
 * - Uses `String.indexOf(char)` to check if a character is a vowel.
 * - Syntax: `if (vowels.indexOf(ch) == -1) { ... }`
 * 
 * 🔹 **3. String Concatenation for Result Formation**
 * - Since `String` is immutable, we build a new string by appending non-vowel characters.
 * - Syntax: `result += ch;`
 * 
 * 🔹 **4. Time Complexity Analysis**
 * - The program runs in **O(n)** time complexity since it iterates through the string once.
 */
public class S03_RemoveVowels {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Hello World! 123 Testing @ Java #2024";

        // Step 2: Define the set of vowels for removal
        String vowels = "aeiouAEIOU";

        // Step 3: Create an empty result string
        String result = "";

        // Step 4: Iterate through each character and filter out vowels
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) == -1) { // If it's not a vowel, add it to result
                result += ch; // String concatenation
            }
        }

        // Step 5: Print the modified string
        System.out.println("Original String: " + input);
        System.out.println("String without vowels: " + result);
    }
}
