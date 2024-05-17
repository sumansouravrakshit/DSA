package leetcode.programs;

public class MaxSubArray {
	// nums =[5,4,-1,7,8]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {};
		int sum = 0;
		int max = 0;
		if (nums == null || nums.length == 0) {
			System.out.println(max);
		} else {
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
				max = Math.max(max, sum);
				if (sum < 0) {
					sum = 0;
				}
			}
		}
		System.out.println(max);
	}

}
