package mr.doom.mianshijindian;

public class Number_sixty_seven {
	public int[] findSegment(int[] A, int n) {
        // write code here
		// 有一个整数数组，请编写一个函数，找出索引m和n，
		// 只要将m和n之间的元素排好序，整个数组就是有序的。
		// 注意：n-m应该越小越好，也就是说，找出符合条件的最短序列。
		// 给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的起点和终点。
		// (原序列位置从0开始标号,若原序列有序，返回[0,0])。保证A中元素均为正整数。
		
		// 进行两次遍历，一次从左到右找出N，一次从右到左找出M
		// （1）从左到右找出N
		// 如果当前元素小于之前的最大元素则说明当前元素应处于[M N]无序序列中
		// 而且当前元素是当前最大下标的无序元素所以更新N为当前元素下标。
		// （2）从右到左找出M
		// 如果当前元素大于之前的最小元素则说明当前元素应处于[M N]无序序列中
		// 而且当前元素是当前最小下标的无序元素所以更新M为当前元素下标
		
		
		int[] arr = {0,0};
		if(A.length == 0 || n <= 0) {
			return null;
		}
		int min = A[0];
		for (int i = 1; i < n; i++) {
			if (min <= A[i]) {
				min = A[i];
			}else {
				arr[0] = i;
			}
		}
		int max = A[n-1];
		for (int i = n-2; i >= 0; i--) {
			if (max >= A[i]) {
				max = A[i];
			}else {
				arr[1] = i;
			}
		}
		
		int[] res = {arr[1],arr[0]};
		return res;
    }
}
