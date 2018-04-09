package mr.doom.mianshijindian;
public class Number_Eighteen {
	public boolean isBalance(TreeNode root) {
		// 实现一个函数，检查二叉树是否平衡，
		// 平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
		// 给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡
		// write code here
		
		//找完所有的节点
		if (root == null) {
			return true;
		}
		
		//递归调用，从根节点开始，分别找出左、右子树的高度
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);

		if (Math.abs(leftDepth - rightDepth) > 1) {
			return false;
		}
		//递归调用，分别对左子树和右子树节点进行判断
		return isBalance(root.left) && isBalance(root.right);
	}

	private int getDepth(TreeNode root) {
		//递归结束点，返回最小子树
		if (root == null) {
			return 0;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
