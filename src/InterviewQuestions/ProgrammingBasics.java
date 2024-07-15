package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class ProgrammingBasics {

	public static void CountOfVowelAndConsonant(String str) {
		char[] arrayOfString = str.toLowerCase().toCharArray();
		int countOfVowel = 0;
		int countOfConsonant = 0;
		for (char c : arrayOfString) {
			if(c == 'a'||c == 'e' ||c == 'i'||c == 'o'||c == 'u') {
				countOfVowel ++;
			}else {
				countOfConsonant ++;
			}
		}
		System.out.println("The total number of Vowels are "+countOfVowel+" and Consonant are "+countOfConsonant);
	}
	
	public static void SortTheGivenArrayOfIntegers(int[] arr) {
		int temp ;
		// [2,1,3,5]
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}
	
	public static void PrintFibonisisSeries(int n) { // 0 1 1 2 3 5 8
		int First = 0 , Second = 1, Next;
		System.out.print(First+","+Second+",");
		for(int i = 2; i < n; i++) {
			Next = First+Second;
			System.out.print(Next + ",");
			First = Second;
			Second = Next;
		}
	}
	
	public static void RemoveTheSpecialCharacters(String str) {
		//System.out.println(str.replaceAll("[^a-zA-z0-9//s]", ""));
		StringBuilder string = new StringBuilder();
		for ( char x : str.toCharArray()) {
			if(Character.isLetterOrDigit(x) || Character.isWhitespace(x)) {
				string.append(x);
			}
		}
		System.out.println(string);
	}
	public static void reverseTheNumber(int num) {
		int reversed = 0;
		while(num > 0) {
			reversed = (reversed*10) + (num % 10);
			num = num / 10;
		}
		System.out.println(reversed);
	}
	public static void GetOnlyNumbersStartWithOne(int[] nums){
		List<Integer> li = new ArrayList<Integer>() ;
		for (int i : nums) {
			int temp = i;
			while(i != 0) {
				if(i/10 == 1 || temp == 1) {
					li.add(i);
				}
				i = i / 10;
			}
		}
		for (int i : li) {
			System.out.print(i+ ",");	
		}
	}
		
	public static void swapTwoNUmbers(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = "+a+" b = "+b);
	}
	public static void PrintNumberOfOccuranceOfCharacter(String str) {
		Map<Character, Integer> occur = new HashMap<>();
		for (char x: str.toCharArray()) {
			if(!occur.containsKey(x)) {
				occur.put(x, 1);
			}else {
				occur.put(x, occur.get(x)+1);
			}
		}
		
		for (Map.Entry<Character, Integer> ele : occur.entrySet()) {
			System.out.println(ele.getKey()+" -- > "+ele.getValue());
		}
		
		
	}
	
	public static Boolean checkGivenNumberIsPrimenumber(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i<= Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//CountOfVowelAndConsonant("AEIOUaeiouzxswd");
		//SortTheGivenArrayOfIntegers(new int[]{3,2,4,5,10,1});
		//PrintFibonisisSeries(10);
		//RemoveTheSpecialCharacters("ABC @#$bnv&*hj,.{ 1234}:");
		//reverseTheNumber(123);
		//GetOnlyNumbersStartWithOne(new int[] {111,12,20,0,2,3,1});
		//swapTwoNUmbers(33,3);
		//PrintNumberOfOccuranceOfCharacter("qqwwasdeer");
		System.out.println(checkGivenNumberIsPrimenumber(11));
	}

}
