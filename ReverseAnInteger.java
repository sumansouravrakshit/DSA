package leetcode.programs;

public class ReverseAnInteger {
	public static int revInt(int num) {
		boolean isNegative = false;
		int reversedInt = 0;
		if (num < 0) {
			isNegative = true;
		}
		long number = Math.abs(num);
		while (number > 0) {
			reversedInt = (int) (reversedInt * 10 + number % 10);
			number = number / 10;
		}
		if (isNegative) {
			reversedInt = -reversedInt;
		}
		return reversedInt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revInt(123));
		System.out.println(revInt(-321));
	}

}
