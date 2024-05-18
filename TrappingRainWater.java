package leetcode.programs;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 4, 2, 0, 3, 2, 5 };
		// First prepare the from left side what are the tallest buildings
		// [0,1,1,2,2,2,2,3,3,3,3,3]
		// Secondly prepare the tallest buildings from right side
		// [3,3,3,3,3,3,3,3,2,2,2,1]
		// Now the water stored above one building is = minOf(left, right) - height[i]
		System.out.println(trappedWater(height));
	}

	public static int trappedWater(int[] height) {
		int water = 0;
		int length = height.length;
		int[] left = new int[length];
		int[] right = new int[length];
		left[0] = height[0];
		for (int i = 1; i < length; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}
		// System.out.println(Arrays.toString(left));
		right[length - 1] = height[length - 1];
		for (int i = length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], height[i]);
		}
		// System.out.println(Arrays.toString(right));
		for (int i = 0; i < length; i++) {
			water += (Math.min(left[i], right[i]) - height[i]);
		}
		return water;

//		More efficient
//		int answer = 0;
//        int left = 0, right = height.length - 1;
//        int leftMax = height[left], rightMax = height[right];
//        while (left < right) {
//
//            if (leftMax < rightMax) {
//                left++;
//                leftMax = Math.max(leftMax, height[left]);
//                answer += leftMax - height[left];
//            } else {
//                right--;
//                rightMax = Math.max(rightMax, height[right]);
//                answer += rightMax - height[right];
//            }
//        }
//
//        return answer;
	}
}