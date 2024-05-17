package leetcode.programs;

public class ContainerWithMostWater {

	// https://leetcode.com/problems/container-with-most-water/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 1, 12, 6, 2, 5, 4, 10, 3, 7 };
		int water = 0, left = 0, right = height.length - 1;
		while (left < right) {
			water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else
				right--;
		}
		System.out.println(water);
	}

}
