package java_dsa_framework_Strings;

public class S14_ReverseSecondWord {

    public static void main(String[] args) {

        String s = "Hell0 automation world"; // Input string

        // Split the string into an array of words
        String[] words = s.split(" ");

        // Check if there is a second word to reverse
        if (words.length < 2) {
            System.out.println("No second word present");
            return;
        }

        // Convert the second word into a character array
        char[] ch = words[1].toCharArray();

        // Pointers for reversing the word
        int left = 0;
        int right = words[1].length() - 1;

        // Reverse the second word
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        // Store the reversed word back in the array
        words[1] = new String(ch);

        // Join the words back into a sentence
        String result = String.join(" ", words);

        // Print the modified sentence
        System.out.println(result); // Expected Output: "Hell0 noitamotua world"
    }
}
