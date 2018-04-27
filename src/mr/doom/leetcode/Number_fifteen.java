package mr.doom.leetcode;

public class Number_fifteen {
    public int searchInsert(int[] A, int target) {
//    	Given a sorted array and a target value, 
//    	return the index if the target is found. If not, 
//    	return the index where it would be 
//    	if it were inserted in order.
//    			You may assume no duplicates in the array.
//    			Here are few examples.
//    			[1,3,5,6], 5 �� 2
//    			[1,3,5,6], 2 �� 1
//    			[1,3,5,6], 7 �� 4
//    			[1,3,5,6], 0 �� 0
    	
    	for (int i = 0; i < A.length; i++) {
			 if (A[i] >= target) {
				return i;
			}
		}
    	
    	return A.length;
    }
}
