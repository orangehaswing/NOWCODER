package mr.doom.mianshijindian;

public class Number_Thirty_nine {
	public int countWays(int n) {
		// write code here
		// 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
		// 请实现一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod 1000000007
		// 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
		//Fibonacci sequence f(n) = f(n-1)+f(n-2)+f(n-3); And f(1)=1,f(2)=2,f(3)=4
		//对于上k级台阶,当k>3时，由于每次可以上1,2,3级，则最后一次应该是上1,2,3中的一个
		//case1，最后一次上1级，也即前面上了k-1级，k-1级的可能情况为：A[k-1]次
		//同理 case2,A[k-1], case3 A[k-3]
		//从而有： A[k] = A[k-3] + A[k-2] + A[k-1]
		int[] arr = {1,2,4};
		if(n<=0) {
			return 0;
		}else if(n<=3) {
			return arr[n-1];
		}else {
			for (int i = 4; i <= n; i++) {
				int temp = ((arr[0]+arr[1])%1000000007+arr[2])%1000000007;
				arr[0] = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
			}
		}
		return arr[2];
	}
}
