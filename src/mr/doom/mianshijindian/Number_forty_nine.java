package mr.doom.mianshijindian;

public class Number_forty_nine {
    public int findElement(int[] A, int n, int x) {
		// ��һ���Ź�������飬����n����������������������������һ�����ȵ���λ��
		// ���磬ԭ����Ϊ[1,2,3,4,5,6]��������λ5��λ�ü������[6,1,2,3,4,5],
		// ���ڶ�����λ������飬��Ҫ����ĳ��Ԫ�ص�λ�á������һ�����Ӷ�Ϊlog������㷨����������
		// ����һ��int����A��Ϊ��λ������飬ͬʱ���������Сn����Ҫ���ҵ�Ԫ�ص�ֵx��
		// �뷵��x��λ��(λ�ô��㿪ʼ)����֤������Ԫ�ػ��졣
    	
    	//log ��������> ���ֲ���
    	int low = 0;
    	int high = n - 1;
    	int mid = 0;
    	// write code here
    	//���ַ�ע������  
    	//low <= high �Ⱥ�
    	//if(A[mid] > x) �����ж�ʱ ע��ѡ���ź������һ��
    	//high = mid - 1; low = mid + 1; ��midֵ����1���С1
    	while(low <= high) {
    		mid = (low + high)/2;
    		if(A[mid] > x) {
    			// if-else ����ж��������򲿷���mid����һ��
    			if(A[mid] > A[low] && x < A[low]) {
    				low = mid + 1;
    			}
    			else {
    				high = mid - 1;
    			}
    		}else if (A[mid] < x) {
    			if(A[mid] < A[low] && x > A[high]) {
    				high = mid - 1;
    			}
    			else {
    				low = mid + 1;
    			}
			}else if(A[mid] == x) {
				//������ֵͬ���򷵻�
				return mid;
			}
    	}
  
    	return (Integer) null;
    }
}
