package leetcode.programs;

public class MaxSubArrayProduct {

	// https://www.youtube.com/watch?v=Y6B-7ZctiW8
	// Here we have to traverse from both the direction and keep track of maximum
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 0, 5, -1, -2, 0 };
		int leftTraverse = 1;
		int rightTraverse = 1;
		int max = nums[0];
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			leftTraverse = leftTraverse == 0 ? 1 : leftTraverse;
			rightTraverse = rightTraverse == 0 ? 1 : rightTraverse;
			leftTraverse *= nums[i];
			rightTraverse *= nums[len - i - 1];
			max = Math.max(max, Math.max(leftTraverse, rightTraverse));

		}
		System.out.println(max);
	}

}
