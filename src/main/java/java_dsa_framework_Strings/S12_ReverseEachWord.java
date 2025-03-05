package java_dsa_framework_Strings;

public class S12_ReverseEachWord {
    public static void main(String[] args) {
        String s = "hello automation world";

        // Split the string into words
        String[] words = s.split(" ");
        String result = "";

        // Iterate using for-each loop
        for (String word : words) {
            char[] ch = word.toCharArray();
            int left = 0, right = ch.length - 1;

            // Reverse the characters within each word
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }

            // Append the reversed word to the result
            result += new String(ch) + " ";
        }

        // Trim the trailing space and print the output
        System.out.println(result.trim()); // Expected Output: "olleh noitamotua dlrow"
    }
}
