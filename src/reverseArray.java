
public class reverseArray {
	
	public static int[] getReverseArray(int[] arr) {
		int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            // Swap elements from the beginning and end of the array
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		for (int i : getReverseArray(arr)) {
			System.out.print(i);
		}
		
	}

}
