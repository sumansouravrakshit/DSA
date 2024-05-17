package leetcode.programs;

import java.util.HashSet;
import java.util.Set;

/**
 * Example 1: Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc",
 * with the length of 3.
 * 
 * Example 2: Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with
 * the length of 1.
 * 
 * Example 3: Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke",
 * with the length of 3. Notice that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * @author SSRAKSHI
 *
 */
class lengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		// Create a map to store the last index of each character encountered
//		Map<Character, Integer> lastIndexMap = new HashMap<>();
//		int maxLength = 0;
//		int start = 0; // Start index of the current substring
//
//		for (int end = 0; end < s.length(); end++) {
//			char currentChar = s.charAt(end);
//			// If the current character is already in the map and its index is after the
//			// start of the current substring,
//			// update the start index to the next index of the previous occurrence of the
//			// character
//			if (lastIndexMap.containsKey(currentChar) && lastIndexMap.get(currentChar) >= start) {
//				start = lastIndexMap.get(currentChar) + 1;
//			}
//			// Update the last index of the current character
//			lastIndexMap.put(currentChar, end);
//			// Update the maximum length of the substring
//			maxLength = Math.max(maxLength, end - start + 1);
//		}
//
//		return maxLength;

		int start = 0;
		int end = 0;
		int maxLength = 0;

		if (s.isEmpty()) {
			return 0;
		}

		Set<Character> seq = new HashSet<>();
		while (end < s.length()) {
			if (!seq.contains(s.charAt(end))) {
				seq.add(s.charAt(end++));
				System.out.println("Line 56\n" + seq);
				// end++;
				maxLength = Math.max(maxLength, seq.size());
			} else {
				// System.out.println(s.charAt(start));
				seq.remove(s.charAt(start));
				// By the time start equals end value, the set will be empty so again it will
				// satisfy condtion and will increment end by 1
				// seq.remove(Character.valueOf(s.charAt(start))); //Use this if arraylist is
				// used instead of set
				System.out.println("After Removal" + seq);
				start++;
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		lengthOfLongestSubstring solution = new lengthOfLongestSubstring();
		System.out.println(solution.lengthOfLongestSubstring("abbbbbb")); // Output: 3
		// System.out.println(solution.lengthOfLongestSubstring("bbbbb")); // Output: 1
		// System.out.println(solution.lengthOfLongestSubstring(" ")); // Output: 3
	}
}
