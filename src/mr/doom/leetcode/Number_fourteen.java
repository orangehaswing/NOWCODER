package mr.doom.leetcode;

public class Number_fourteen {
    public static int sqrt(int x) {
		// Implementint sqrt(int x).
		// Compute and return the square root of x.
    	
    	if (x == 1 ) {
			return 1;
		}
    	
    	int left = 1;
    	int right = x/2;
    	int mid = 0;
    	int lastmid= 0;
    	while (left <= right) {
    		mid = left + (right-left)/2;
    		if (x/mid > mid) {
    			lastmid = mid;
				left = mid + 1;
			}else if(x/mid < mid){
				right = mid -1;
			}else {
				return mid;
			}
    	}
			
    	return lastmid;
    }
    
    
    public static void main(String[] args) {
		int x = sqrt(8);
		System.out.println("x : "  + x);
	}
}
