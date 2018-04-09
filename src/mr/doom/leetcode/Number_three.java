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
    		//���㲨��Ͳ��ȵĲ�ֵ����Ϊһ��������������
    		//����ÿ����Сֵ�㣬����ά����ֵ����ϴ�ֵ����Сֵ�Ĳ��
    		minnum = Math.min(prices[i], minnum);
    		maxprof = Math.max(prices[i] - minnum, maxprof);
		}
    	
    	return maxprof;
    }
}
