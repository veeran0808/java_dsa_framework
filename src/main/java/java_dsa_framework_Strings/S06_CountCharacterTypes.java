package java_dsa_framework_Strings;

/**
 * 📌 **CountCharacterTypes - Analyze Character Types in a String**
 *
 * This program counts and categorizes characters into:
 * - **Uppercase letters (A-Z)**
 * - **Lowercase letters (a-z)**
 * - **Digits (0-9)**
 * - **Special characters (symbols, punctuation, etc.)**
 *
 * 📝 **Key Learning Points**
 *
 * 🔹 **1. Efficient Character Classification**
 * - Uses `Character.isUpperCase(c)`, `Character.isLowerCase(c)`, `Character.isDigit(c)`, and the default case for special characters.
 *
 * 🔹 **2. String Concatenation (`+=` Approach)**
 * - Uses **`+=` instead of `StringBuilder`** to respect the decision of avoiding mutable objects.
 *
 * 🔹 **3. Performance Considerations**
 * - **Time Complexity:** `O(n²)` due to immutable string concatenation.
 * - **Why?** Each `+=` creates a new string instance.
 * - **Suitable For:** Small inputs where performance is not a major concern.
 *
 * 🔹 **4. Input and Output Example**
 * - **Input:** `"Gopikrishna@123gmail.com"`
 * - **Output:**  
 *   ```
 *   Uppercase letters: 1 -> G  
 *   Lowercase letters: 15 -> o p i k r i s h n a g m a i l c o m  
 *   Digits: 3 -> 1 2 3  
 *   Special characters: 3 -> @ .  
 *   ```
 */
public class S06_CountCharacterTypes {
    public static void main(String[] args) {
        
        // Step 1: Define input string
        String input = "Gopikrishna@123gmail.com";

        // Step 2: Counters for different character types
        int upperCase = 0, lowerCase = 0, digits = 0, specialChars = 0;

        // Step 3: Using String variables for concatenation (avoiding StringBuilder)
        String uppercaseLetters = "";
        String lowercaseLetters = "";
        String digitChars = "";
        String specialCharacters = "";

        // Step 4: Iterate through each character in the string
        for (char c : input.toCharArray()) {
            
            // Step 5: Categorize the character and update counters
            if (Character.isUpperCase(c)) {
                upperCase++;
                uppercaseLetters += c + " "; // String concatenation
            } 
            else if (Character.isLowerCase(c)) {
                lowerCase++;
                lowercaseLetters += c + " ";
            } 
            else if (Character.isDigit(c)) {
                digits++;
                digitChars += c + " ";
            } 
            else {
                specialChars++;
                specialCharacters += c + " ";
            }
        }

        // Step 6: Print the categorized characters and their counts
        System.out.println("Uppercase letters: " + upperCase + " -> " + uppercaseLetters.trim());      
        System.out.println("Lowercase letters: " + lowerCase + " -> " + lowercaseLetters.trim());      
        System.out.println("Digits: " + digits + " -> " + digitChars.trim());                    
        System.out.println("Special characters: " + specialChars + " -> " + specialCharacters.trim());  
    }
}
