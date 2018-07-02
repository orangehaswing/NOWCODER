package mr.doom.leetcode;

public class Number_thirty_two {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		// Given two binary trees, write a function to check
		// if they are equal or not.Two binary trees are considered
		// equal if they are structurally identical and
		// the nodes have the same value.
		
		//�ݹ����
		if (p == null && q == null) {
			return true;
		}
		//�Ѿ��ж�p q��ͬʱΪ��
		if (p == null || q == null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}

		return isSameTree(p.left,q.left)&& isSameTree(p.right, q.right);
	}
}
