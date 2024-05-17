package leetcode.programs;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {
		// Map to store characters in t and their counts
		Map<Character, Integer> targetMap = new HashMap<>();
		for (char c : t.toCharArray()) {
			targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
		}

		int requiredChars = targetMap.size(); // Number of unique characters in t
		int left = 0, right = 0; // Pointers for the sliding window
		int minLen = Integer.MAX_VALUE; // Length of the minimum window substring
		int minStart = 0; // Start index of the minimum window substring
		Map<Character, Integer> windowMap = new HashMap<>(); // Map to store characters in the current window

		while (right < s.length()) {
			char c = s.charAt(right);
			windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

			// Check if the current window contains all characters of t
			if (targetMap.containsKey(c) && targetMap.get(c).intValue() == windowMap.get(c).intValue()) {
				requiredChars--;
			}

			// Try to minimize the window size by moving the left pointer
			while (requiredChars == 0) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					minStart = left;
				}
				char leftChar = s.charAt(left);
				windowMap.put(leftChar, windowMap.get(leftChar) - 1);
				if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
					requiredChars++;
				}
				left++;
			}

			right++;
		}

		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
	}

	public static void main(String[] args) {
		MinimumWindowSubstring solution = new MinimumWindowSubstring();
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(solution.minWindow(s, t)); // Output: "BANC"
	}
}
