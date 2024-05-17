package leetcode.programs;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [7,1,5,3,6,4]
		int[] prices = { 7, 1, 9, 3, 8, 4 };
		System.out.println("Max Profit is " + maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
		int buy = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < buy) {
				buy = prices[i];
			} else if (profit < prices[i] - buy) {
				profit = prices[i] - buy;
			}
		}

		return profit;
	}

}
