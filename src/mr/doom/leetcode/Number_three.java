package mr.doom.leetcode;

public class Number_three {
    public int maxProfit(int[] prices) {
		// Say you have an array for which the i th element is the price of a given
		// stock on day i.
		// If you were only permitted to complete at most one transaction
		// (ie, buy one and sell one share of the stock),
		// design an algorithm to find the maximum profit.
    	if (prices.length == 1) {
			return 0;
		}
    	
    	int maxprof = 0;
    	int minnum = prices[0];
    	
    	for (int i = 0; i < prices.length; i++) {
    		//计算波峰和波谷的差值，就为一次买进的最大利益
    		//保存每个最小值点，更新维护该值后面较大值和最小值的差即可
    		minnum = Math.min(prices[i], minnum);
    		maxprof = Math.max(prices[i] - minnum, maxprof);
		}
    	
    	return maxprof;
    }
}
