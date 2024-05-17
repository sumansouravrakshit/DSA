package dsa.gfg;

import java.util.ArrayList;
import java.util.List;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 70, 20, 40, 35, 90 };
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				if (input[i] > input[i + 1]) {
					output.add(input[i]);
				}
			} else if (i == input.length - 1) {
				if (input[i] > input[i - 1]) {
					output.add(input[i]);
				}
			} else {
				if (input[i] > input[i + 1] && input[i] > input[i - 1]) {
					output.add(input[i]);
				}
			}
		}
		System.out.println(output);
	}
}
