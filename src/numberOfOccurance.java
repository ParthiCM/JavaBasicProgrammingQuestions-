
public class numberOfOccurance {

	static int getOccurringChar(String s, char c) {
		// Count variable
		int res = 0;

		for (int i = 0; i < s.length(); i++)

			// checking character in string
			if (s.toCharArray()[i] == c)
				res++;
		System.out.println("The number of occurance of " + c + " in given string " + s + "is '" + res+"'");
		return res;

	}

	public static void main(String[] args) {
		getOccurringChar("aaabcd", 'a');
	}

}
