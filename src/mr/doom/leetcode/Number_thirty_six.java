package mr.doom.leetcode;

public class Number_thirty_six {
	public int removeDuplicates(int[] A) {
		// Given a sorted array(��������), remove the duplicates in place
		// such that each element appear only once and return the new length.
		// Do not allocate extra space for another array, you must do this in place with
		// constant memory.
		//
		// For example,
		// Given input array A =[1,1,2],
		// Your function should return length =2, and A is now[1,2].
		
		//TODO A��ֵ�޸ĳɲ��ظ�������û�н��
		//��¼���ظ�Ԫ��ֵ
		if (A.length == 0) {
			return 0;
		}
		
		int count = 1; //������һ��ֵ
		
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i -1]) {
				//�������ȣ�����һ��ֵ����count��������ָ���λ�ã��ظ�ֵ���ᱻ���Ϊ֮���ظ���ֵ
				A[count++] = A[i];
			}
		}
		
		return count;
	}
}
