
public class Number_forty_two {
	 public boolean findMagicIndex(int[] A, int n) {
		// 在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。
		// 给定一个升序数组，元素值各不相同，编写一个方法，判断在数组A中是否存在魔术索引。
		// 请思考一种复杂度优于o(n)的方法。
		// 给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。
	        // write code here
		//顺序查找复杂度o(n)
//		 for (int i = 0; i < A.length; i++) {
//			if(A[i] == i) {
//				return true;
//			}
//		}
		 //二分法复杂度o(log(n))
		int low = 0;
		int high = A.length -1;
		int mid = 0;
		while(low <= high) {
			mid = (low +high)/2;
			if(A[mid] == mid) {
				return true;
			}else if (A[mid] < mid) {
				low = mid + 1;  //low high赋值逻辑
			}else {
				high = mid - 1;
			}
		}
		 return false;
	    }
}
