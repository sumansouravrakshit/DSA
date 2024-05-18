package leetcode.programs;

import java.util.TreeMap;

public class SortSentence {

	// is2 a3 This1 sentence4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 a3 This1 sentence4";
		System.out.println(sortString(s));
	}

	public static String sortString(String s) {
		String sortedString = "";
		String[] words = s.split("\\s+");// [is2,a3,This1,sentence4]
		TreeMap<Character, String> map = new TreeMap<>();
		for (String word : words) {
			map.put(word.charAt(word.length() - 1), word.substring(0, word.length() - 1));
		}
		// Fetch all values from the map
//		Collection<String> values = map.values();

		// Print all values
		for (String value : map.values()) {
			System.out.print(value + " ");

		}
		return sortedString;
	}

}
