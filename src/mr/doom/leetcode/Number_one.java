package mr.doom.leetcode;

public class Number_one {
	public int maxDepth(TreeNode root) {
		// Given a binary tree, find its maximum depth.
		// The maximum depth is the number of nodes along the longest path
		// from the root node down to the farthest leaf node.
		// µÝ¹éµ÷ÓÃ

		if (root == null) {
			return 0;
		}

		int leftdepth = maxDepth(root.left);
		int rigthdepth = maxDepth(root.right);

		int maxDepth = leftdepth > rigthdepth ? leftdepth + 1 : rigthdepth + 1;

		return maxDepth;
	}
}
