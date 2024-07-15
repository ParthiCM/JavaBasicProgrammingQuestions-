public class convertDecimalToBinary {
	
	static String decToBinary(int n) {
		System.out.println("Decimal - " + n);
		
		String binaryNum = "";

		// counter for binary array
		while (n > 0) {
			// storing remainder in string
			binaryNum = binaryNum + n % 2;
			n = n / 2;
		}
		
		String binaryValue = "";
		// reversing to get the binary digit
		for (int i = binaryNum.length() - 1; i >= 0; i--) {
			binaryValue = binaryValue + binaryNum.charAt(i);
        }
		return binaryValue;
	}
	
	public static void main(String[] args) {
		String val = decToBinary(123);
		System.out.println("Binary - " + val);
	}

}
