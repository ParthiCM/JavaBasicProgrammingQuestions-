
public class isAnagram {

	public static String sortingGivenString(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		int n = charArray.length;

		// Bubble sort algorithm
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {
					// Swap characters
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}
			}
		}
		str = new String(charArray);
		return str;
	}

	public static boolean checkAnagram(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();

		if (n1 != n2) {
			return false;
		}

		// Compare sorted strings
		for (int i = 0; i < n1; i++) {
			if (str1.toCharArray()[i] != str2.toCharArray()[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "oooo";
		String str2 = "Lisent";
		if (checkAnagram(sortingGivenString(str1), sortingGivenString(str2))) {
			System.out.println("The Given Strings are Anangram");
		} else {
			System.out.println("The Given Strings are not Anangram");
		}

	}

}
