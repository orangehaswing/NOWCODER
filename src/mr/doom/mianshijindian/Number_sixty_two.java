package mr.doom.mianshijindian;

public class Number_sixty_two {
	public int count(int[] A, int n) {
        // write code here
		// 有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。
		// 请设计一个高效的算法，计算给定数组中的逆序对个数。
		// 给定一个int数组A和它的大小n，请返回A中的逆序对个数。保证n小于等于5000。
		int num = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j < n; j++) {
				if (A[i]>A[j]) {
					num++;
				}
			}
		}

		return num;
    }
}
