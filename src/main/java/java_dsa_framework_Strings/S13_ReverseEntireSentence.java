package java_dsa_framework_Strings;

public class S13_ReverseEntireSentence {

    public static void main(String[] args) {
        
        // Step 1: Define the input string
        String s = "Hello automation world";
        
        // Step 2: Convert the string into a character array
        char[] ch = s.toCharArray();
        
        // Step 3: Initialize two pointers for reversing the character array
        int left = 0;
        int right = ch.length - 1;
        
        // Step 4: Reverse the characters using a two-pointer swapping technique
        while (left < right) {
            // Swap the characters at 'left' and 'right' indices
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
        
        // Step 5: Convert the modified character array back to a string
        String result = new String(ch);
        
        // Step 6: Print the reversed sentence
        System.out.println(result);
    }
}
