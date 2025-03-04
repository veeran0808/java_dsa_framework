package java_dsa_framework_Strings;

public class S01_CheckPalindromeString {

	public static void main(String[] args) {
		
		String s = "madama";
		int left=0;
		int right=s.length()-1;
		boolean isPalandrom = true;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				isPalandrom=false;
				break;
			}
			left++;
			right--;
		}
		if(isPalandrom) {
			System.out.println("the give string is palandrom : " + s);
		}
		else {
			System.out.println("The given string is not palandrom : " +s);
		}

	}

}
