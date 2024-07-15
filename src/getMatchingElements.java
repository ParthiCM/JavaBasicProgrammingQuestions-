import java.util.ArrayList;

public class getMatchingElements {
	public static ArrayList<Object> matchingElementsInArray(Object[] array) {
		ArrayList<Object> temp = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j]) && !temp.contains(array[i])) {
					temp.add(array[i]);
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Object[] a = { 1, 2, 3, 4, 5, 2, 3, 4, 5 };
		System.out.println(matchingElementsInArray(a));;
	}

}
