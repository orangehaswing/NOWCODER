package mr.doom.mianshijindian;

public class Number_forty_nine {
    public int findElement(int[] A, int n, int x) {
		// 有一个排过序的数组，包含n个整数，但是这个数组向左进行了一定长度的移位，
		// 例如，原数组为[1,2,3,4,5,6]，向左移位5个位置即变成了[6,1,2,3,4,5],
		// 现在对于移位后的数组，需要查找某个元素的位置。请设计一个复杂度为log级别的算法完成这个任务。
		// 给定一个int数组A，为移位后的数组，同时给定数组大小n和需要查找的元素的值x，
		// 请返回x的位置(位置从零开始)。保证数组中元素互异。
    	
    	//log ————> 二分查找
    	int low = 0;
    	int high = n - 1;
    	int mid = 0;
    	// write code here
    	//二分法注意事项  
    	//low <= high 等号
    	//if(A[mid] > x) 条件判断时 注意选择排好序的哪一侧
    	//high = mid - 1; low = mid + 1; 对mid值增加1或减小1
    	while(low <= high) {
    		mid = (low + high)/2;
    		if(A[mid] > x) {
    			// if-else 语句判断其中有序部分在mid的哪一边
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
				//发现相同值，则返回
				return mid;
			}
    	}
  
    	return (Integer) null;
    }
}
