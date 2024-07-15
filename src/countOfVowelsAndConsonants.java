
public class countOfVowelsAndConsonants {
	public static int[] getCountOfVowelsAndConsonants(String str) {
		int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        String lowerCaseInput =  str.toLowerCase();

        // Iterate through each character of the string
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is an alphabet
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
            // Ignoring non-alphabetic characters like spaces, punctuation, etc.
        }

        return new int[]{vowelCount, consonantCount};
	}

	public static void main(String[] args) {
		for (int i : getCountOfVowelsAndConsonants("Parthi")) {
			System.out.print(i);
		}
	}

}
