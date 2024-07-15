
public class secondLargestNumber {
	public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
	public static void main(String[] args) {
		int[] nums = {1,222,34,41,5,6};
		System.out.println(findSecondLargest(nums));

	}

}
