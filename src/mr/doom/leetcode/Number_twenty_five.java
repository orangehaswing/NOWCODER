package mr.doom.leetcode;


public class Number_twenty_five {
    public boolean isBalanced(TreeNode root) {
		// Given a binary tree, determine if it is height-balanced.
		// For this problem, a height-balanced binary tree is defined as
		// a binary tree in which the depth of the two subtrees of every
		// node never differ by more than 1.
		//�ڵ�Ϊ�գ��򵽴�����ڵ㣬����true
    	if (root == null) {
			return true;
		}
    	
    	//�ֱ��ÿ���ڵ�������������������������
    	int left = getDeep(root.left);
    	int right = getDeep(root.right);
    	if (Math.abs(right-left)>1) {
			return false;
		}
    	//�ݹ���ã�����ÿ���ڵ�
    	return isBalanced(root.left)&&isBalanced(root.right);
    }
    
    public int getDeep(TreeNode root) {
    	if (root == null) {
			return 0;
		}
    	
    	int leftDeep = getDeep(root.left)+1;
    	int rightDeep = getDeep(root.right)+1;
    	
    	return leftDeep > rightDeep ? leftDeep:rightDeep;
    }
   
}
