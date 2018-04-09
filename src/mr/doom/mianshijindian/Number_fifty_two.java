package mr.doom.mianshijindian;

public class Number_fifty_two {
	public boolean checkWon(int[][] board) {
		// 对于一个给定的井字棋棋盘，请设计一个高效算法判断当前玩家是否获胜。
		// 给定一个二维数组board，代表当前棋盘，
		// 其中元素为1的代表是当前玩家的棋子，为0表示没有棋子，为-1代表是对方玩家的棋子。
		// write code here
		//行
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += board[i][j];
			}
			if(sum == 3) {
				return true;
			}
		}
		//列
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += board[j][j];
			}
			if(sum == 3) {
				return true;
			}
		}
		//斜对角
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += board[i][i];
			if(sum1 == 3) {
				return true;
			}
		}
		//反斜对角
		int sum2 = 0;
		for (int i = 0; i < 3; i++) {
			sum2 = board[i][2-i];
			if (sum2 == 3) {
				return true;
			}
		}
		
		return false;
    }
}
