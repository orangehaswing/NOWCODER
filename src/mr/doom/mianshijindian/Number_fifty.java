package mr.doom.mianshijindian;

public class Number_fifty {
    public int getHeight(int[] men, int n) {
		// 叠罗汉是一个著名的游戏，游戏中一个人要站在另一个人的肩膀上。
		// 同时我们应该让下面的人比上面的人更高一点。
		// 已知参加游戏的每个人的身高，请编写代码计算通过选择参与游戏的人，我们多能叠多少个人。
		// 注意这里的人都是先后到的，意味着参加游戏的人的先后顺序与原序列中的顺序应该一致。
		// 给定一个int数组men，代表依次来的每个人的身高。同时给定总人数n，请返回最多能叠的人数。保证n小于等于500。
    	// write code here
    	int[] dp = new int[n];
    	int max = 0; //记录最长子串
    	
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
