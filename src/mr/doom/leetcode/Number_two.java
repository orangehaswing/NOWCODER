package mr.doom.leetcode;

public class Number_two {
    public int maxProfit(int[] prices) {
		// Say you have an array for which the i th element is the price of a given
		// stock on day i.
		// Design an algorithm to find the maximum profit.
		// You may complete as many transactions as you like
		// (ie, buy one and sell one share of the stock multiple times).
		// However, you may not engage in multiple transactions at the same time
		// (ie, you must sell the stock before you buy again).
    	int maxprof = 0;
    	if (prices.length == 1) {
			return 0;
		}
    	for (int i = 1; i < prices.length; i++) {
			//利润最大化，就是统计后一天和前一天的差值为正数的累加和
    		int sum = prices[i] - prices[i-1];
    		if(sum > 0) {
    			maxprof += sum;
    		}
		}
    	return maxprof;
    }
}
