package mr.doom.leetcode;

public class Number_seventeen {
    public static void sortColors(int[] A) {
		// Given an array with n objects colored red, white or blue,
		// sort them so that objects of the same color are adjacent,
		// with the colors in the order red, white and blue.
		// Here, we will use the integers 0, 1, and 2 to represent the color red,
		// white, and blue respectively.
    	
    	//һ������ �ѵ���0�ķŵ���ߣ��ѵ���2�ķŵ��ұ�
    	//TODO
    	int left = 0;
    	int right = A.length-1;
    	int temp = 0;
    	for (int i = 0; i < A.length;) {
			if (A[i] == 0) {
				A[i] = A[left];
				A[left] = 0;
				left++;
				i++;
			}else if(A[i] == 2) {
				A[i] = A[right];
				A[right] = 2;
				right--;
				i--;
			}else {
				i++;
			}
		}
    	
    	//ת�����ַ���ƴ�ӣ�Ȼ��ת������
//    	StringBuffer bfRed = new StringBuffer();
//    	StringBuffer bfWhi = new StringBuffer();
//    	StringBuffer bfBlu = new StringBuffer();
//    	
//    	for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				bfRed.append(A[i]);
//			}else if(A[i] == 1) {
//				bfWhi.append(A[i]);
//			}else if (A[i] == 2) {
//				bfBlu.append(A[i]);
//			}
//		}
//    	
//    	String str = bfRed.append(bfWhi.append(bfBlu)).toString();
//    	
//    	for (int i = 0; i < str.length(); i++) {
//    		A[i] = (int)(str.charAt(i)-48);
//    		System.out.println(A[i]);
//		}
    }
    
   

	public static void main(String[] args) {
    	int[] A = {0,0,2,1,1,0,0,1,2,1};
		sortColors(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
