package mr.doom.leetcode;

public class Number_thirty_six {
	public int removeDuplicates(int[] A) {
		// Given a sorted array(有序数列), remove the duplicates in place
		// such that each element appear only once and return the new length.
		// Do not allocate extra space for another array, you must do this in place with
		// constant memory.
		//
		// For example,
		// Given input array A =[1,1,2],
		// Your function should return length =2, and A is now[1,2].
		
		//TODO A的值修改成不重复的问题没有解决
		//记录不重复元素值
		if (A.length == 0) {
			return 0;
		}
		
		int count = 1; //至少有一个值
		
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i -1]) {
				//如果不相等，将后一个值插入count计数器所指向的位置，重复值将会被替代为之后不重复的值
				A[count++] = A[i];
			}
		}
		
		return count;
	}
}
