package mr.doom.mianshijindian;

public class Number_Twenty_eight {
	public int[] getCloseNumber(int x) {
		// 有一个正整数，请找出其二进制表示中1的个数相同、且大小最接近的那两个数。(一个略大，一个略小)
		// 给定正整数int x，请返回一个vector，代表所求的两个数（小的在前）。保证答案存在。
        // write code here
		int count = getcout(x);
		int a = x+1;
		int b = x-1;
		//累加累减逐个遍历
		while(count != getcout(a)) {
			a++;
		}
		while(count != getcout(b)) {
			b--;
		}
		
		int[] number = {b,a};
		return number;
    }
	
	 private int getcout(int result) {
		 //快速法求二进制1的个数，去掉最右边的1
		 //i.e 8（1000）= 7（0111）+ 1（0001）
		 int i = 0;
		 for (; result != 0; i++) {
			result &= (result -1);
		}
		 return i;
	}
}
