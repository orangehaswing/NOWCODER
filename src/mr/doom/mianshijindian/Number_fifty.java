package mr.doom.mianshijindian;

public class Number_fifty {
    public int getHeight(int[] men, int n) {
		// ���޺���һ����������Ϸ����Ϸ��һ����Ҫվ����һ���˵ļ���ϡ�
		// ͬʱ����Ӧ����������˱�������˸���һ�㡣
		// ��֪�μ���Ϸ��ÿ���˵���ߣ����д�������ͨ��ѡ�������Ϸ���ˣ����Ƕ��ܵ����ٸ��ˡ�
		// ע��������˶����Ⱥ󵽵ģ���ζ�Ųμ���Ϸ���˵��Ⱥ�˳����ԭ�����е�˳��Ӧ��һ�¡�
		// ����һ��int����men��������������ÿ���˵���ߡ�ͬʱ����������n���뷵������ܵ�����������֤nС�ڵ���500��
    	// write code here
    	int[] dp = new int[n];
    	int max = 0; //��¼��Ӵ�
    	
    	for (int i = 0; i < n; i++) {
    		dp[i] = 1;
    		for (int j = 0; j < i; j++) {
				if(men[j] <= men[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
    		max = Math.max(max, dp[i]);
		}
    	return max;
    
    }
}
