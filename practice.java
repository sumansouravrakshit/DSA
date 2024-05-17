package projectWork.projectWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class practice {

	static void print() {
		int n = 6;
		int i, j;
		// outer loop to handle number of rows
		for (i = 1; i <= n; i++) {
			// for printing no of spaces
			for (j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// for printing no of spaces
			for (j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	static void print2() {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void pallindromeTriangle() {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void mainpatt() {

		int n = 6;
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void rotateArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2, k = 0;
		int[] temp = new int[arr.length];
		for (int i = d; i < arr.length; i++) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	static void repeatedletters() {
		String str = "sumansourav";
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!hm.containsKey(ch[i])) {
				hm.put(ch[i], 1);
			} else {
				hm.put(ch[i], hm.get(ch[i]) + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(hm);
		String[] str1 = { "Suman1111", "Sourav" };
		List<String> list = Arrays.asList(str);
		System.out.println("120" + list);
		list.toArray();
		System.out.println("122" + list);
		String x = String.format("suman%ssuman", 1);
		System.out.println("124" + Arrays.toString(str1));
		System.out.println(Arrays.toString(list.toArray()));
		String myStr = "Hello planet earth, you are a great planet.";
		System.out.println("128" + myStr.indexOf("l", 4));
	}

	static void firstletterOfWord() {
		String[] words = "gee dhd jnd".split("\\s");
	}

	static void panagramCheck() {
		boolean panagram = true;
		String str = "Abcdefghijklmnopqrstuvwxyz";
		str = str.toLowerCase();
		for (char ch = 'a'; ch < 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				panagram = false;
			}
		}
		System.out.println(panagram);
	}

	static void sortString() {
		String str = "fdc";
		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length - 1; i++) {
			for (int j = 0; j < chArr.length - 1 - i; j++) {
				if (chArr[j] > chArr[j + 1]) {
					char temp = chArr[j];
					chArr[j] = chArr[j + 1];
					chArr[j + 1] = temp;
				}
			}
		}
		System.out.println(chArr);
	}

	static void reverseStringUsingStack(String str) {
		char[] revStr = new char[str.length()];
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		int i = 0;
		while (!stack.isEmpty()) {
			revStr[i++] = stack.pop();
		}
		System.out.println(revStr);
	}

	static void modifyStringAtSpecificPosition() {
		String str = "he s  fd   ndmd";
		// here + sign will split consecutive spaces also
		String[] strArr = str.split("\\s+");
		System.out.println(strArr.length);
	}

	static void removingDuplicates() {
		int[] input = { 1, 2, 1, 2, 3, 6, 4 };
		List<Integer> uniqueEle = new ArrayList<>();
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueEle.add(input[i]);
			}
		}
		System.out.println(uniqueEle);
	}

	static void readExcel() throws FileNotFoundException {
		// To read any file first load the file
		File file = new File("FilePath");
		// Create a stream
		FileInputStream fis = new FileInputStream(file);
		// Load the workbook

	}

	static void keepBoundaryValues() {
		int mat[][] = new int[][] { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 } };
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == 0 || j == 0 || j == mat[i].length - 1 || i == mat.length - 1) {
					System.out.println(mat[i][j]);
				} else {
					System.out.print(" "); // Print space for non-boundary values
				}
			}
		}
	}

	static void removeAllOccurences() {
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != key) {
				list.add(array[i]);
			}
		}
		System.out.println(list);
	}

	static void reverseWordsInString() {
		String str = "Hello World is he    re";
		String temp = "";
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			temp += str.charAt(i);
			// temp = temp.trim();
			if (str.charAt(i) == ' ' || i == str.length() - 1) {
				ans = temp + ans;
				temp = "";
			}
		}
		System.out.print(ans);
	}

	static void uniqueCharacters() {
		String str = "Susana";
		TreeMap<Character, Integer> hm = new TreeMap<>();
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			}
		}
		System.out.println(hm);
	}

	static void swapStringsWithoutThirdVaribale() {
		String s1 = "Suman";
		String s2 = "Sourav";
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		sb1 = sb1.append(sb2);
		sb2 = new StringBuffer(sb1.substring(0, sb1.length() - sb2.length()));
		sb1 = new StringBuffer(sb1.substring(sb2.length(), sb1.length()));
		System.out.println(sb1.toString() + sb2.toString());
	}

	static void printDuplicateCharacters() {
		String str = "ab abcb d";
		HashMap<Character, Integer> hm = new HashMap<>();
		// o/p- a 2 b 3
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
					count++;
				}
			}
			if (count > 1) {
				hm.put(str.charAt(i), count);
			}

		}
		System.out.println(hm);
	}

	static void anagramStrings() {
		String s1 = "armyy";
		String s2 = "myary";
		// Convert strings to char array then equals
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

	static void useOfTokenizer() {

		// Use this instead of using split function
		String str = "apple  hb fb      hf,orange,banana,mango";

		// Using default delimiter (comma)
		StringTokenizer st1 = new StringTokenizer(str);
		while (st1.hasMoreTokens()) {
			System.out.println("Creating tokens by default delimiter: " + st1.nextToken());
		}

		// Using custom delimiter (comma)
		StringTokenizer st2 = new StringTokenizer(str, ",");
		while (st2.hasMoreTokens()) {
			System.out.println("Creating tokens by comma delimiter: " + st2.nextToken());
		}
	}

	static void reverseWordsInAStringWithoutSplit() {
		String inputString = "Arise! Awake! and stop not until the goal is reached";
		String output = "";
		String temp = "";
		for (int i = 0; i < inputString.length(); i++) {
			temp = inputString.charAt(i) + temp;
			if (inputString.charAt(i) == ' ' || i == inputString.length() - 1) {
				output = output + temp;
				temp = "";

			}
		}
		System.out.println(output);
	}

	static void convertAMtoPM() {

	}

	public static int binarySearch(int[] A, int val) {
		int start = 0;
		int end = A.length - 1;
		while (start < end) {
			int mid = (int) Math.floor((start + end) / 2);

			if (A[mid] >= val) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		if (A[start] == val) {
			return val;
		} else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iterating rows
		int[] array = { 1, 3, 5, 7, 9, 11, 13 };

		// Value to search for
		int searchValue = 4;

		// Call the binarySearch method and store the result
		printDuplicateCharacters();
		// Try to use str.charAt(2) to retrive the character
	}
}
