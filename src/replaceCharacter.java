
public class replaceCharacter {
	public static String replaceChar(String str, char oldChar, char newChar) {
        char[] charArray = str.toCharArray();

        // Iterate through each character of the string
        for (int i = 0; i < charArray.length; i++) {
            // If the current character matches the old character, replace it with the new character
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
	public static void main(String[] args) {
		System.out.println(replaceChar("Paarthi",'a','x'));

	}

}
