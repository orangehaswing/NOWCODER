
public class Number_forty_two {
	 public boolean findMagicIndex(int[] A, int n) {
		// ������A[0..n-1]�У�����ν��ħ����������������A[i]=i��
		// ����һ���������飬Ԫ��ֵ������ͬ����дһ���������ж�������A���Ƿ����ħ��������
		// ��˼��һ�ָ��Ӷ�����o(n)�ķ�����
		// ����һ��int����A��int n���������С���뷵��һ��bool�������Ƿ����ħ��������
	        // write code here
		//˳����Ҹ��Ӷ�o(n)
//		 for (int i = 0; i < A.length; i++) {
//			if(A[i] == i) {
//				return true;
//			}
//		}
		 //���ַ����Ӷ�o(log(n))
		int low = 0;
		int high = A.length -1;
		int mid = 0;
		while(low <= high) {
			mid = (low +high)/2;
			if(A[mid] == mid) {
				return true;
			}else if (A[mid] < mid) {
				low = mid + 1;  //low high��ֵ�߼�
			}else {
				high = mid - 1;
			}
		}
		 return false;
	    }
}
