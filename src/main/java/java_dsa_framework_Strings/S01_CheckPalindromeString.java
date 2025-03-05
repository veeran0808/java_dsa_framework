package java_dsa_framework_Strings;

/**
 * ================================
 * **Palindrome String Checker**
 * ================================
 * This program checks whether a given string is a palindrome.
 * A **palindrome** is a word that reads the same forward and backward.
 *
 * --------------------------------
 * **Key Learning Points:**
 * --------------------------------
 * 1. **Using charAt(index):** Retrieves a character at a specific position in a string.
 * 2. **Two-Pointer Approach:** Efficiently checks characters from both ends.
 * 3. **Loop Optimization:** Stops early if a mismatch is found.
 * 4. **Edge Cases Considered:** Handles odd/even length strings, single-character strings.
 * 5. **Time Complexity:** O(n), since each character is checked at most once.
 * 6. **Space Complexity:** O(1), as no extra space is used.
 */

public class S01_CheckPalindromeString {
    
    public static void main(String[] args) {
        
        // Step 1: Define the input string
        String s = "madama"; 
        
        // Step 2: Initialize two pointers
        int left = 0;
        int right = s.length() - 1;
        
        // Step 3: Assume it's a palindrome
        boolean isPalindrome = true;
        
        // Step 4: Check characters using two-pointer technique
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) { // If characters don't match
                isPalindrome = false;
                break; // Stop checking further
            }
            left++;
            right--;
        }
        
        // Step 5: Print the result
        if (isPalindrome) {
            System.out.println("The given string is a palindrome: " + s);
        } else {
            System.out.println("The given string is not a palindrome: " + s);
        }
    }
}
