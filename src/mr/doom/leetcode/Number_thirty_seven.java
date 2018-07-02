package mr.doom.leetcode;

public class Number_thirty_seven {
	public boolean hasPathSum(TreeNode root, int sum) {
		// Given a binary tree and a sum, determine if the tree has a
		// root-to-leaf path such that adding up all the values along
		// the path equals the given sum.
		//
		// For example:
		// Given the below binary tree andsum = 22,
		// 5
		// / \
		// 4 8
		// / / \
		// 11 13 4
		// / \ \
		// 7 2 1
		// return true, as there exist a root-to-leaf path5->4->11->2which sum is 22.
		//
		
		if (root == null) {
			return false;
		}
		
		//遍历结束位置，到达子节点同时相加值为sum，表示成功找到路径
		if (root.left == null && root.right == null && (sum - root.val) == 0) {
				return true;
		}else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
		
	}
}
