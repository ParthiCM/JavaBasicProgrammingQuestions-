
public class isPalindrome {
	
	public static boolean CheckIsPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        String rev = "";

        // Initializing a new boolean variable for the
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

	public static void main(String[] args) {
		if(CheckIsPalindrome("Amma")) {
			System.out.println("The given string is Palindrome");
		}else {
			System.out.println("The given string is not a Palindrome");
		}
	}

}
