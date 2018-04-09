package mr.doom.mianshijindian;
public class Number_Eighteen {
	public boolean isBalance(TreeNode root) {
		// ʵ��һ�����������������Ƿ�ƽ�⣬
		// ƽ��Ķ������£��������е�����һ����㣬�����������ĸ߶Ȳ����1��
		// ����ָ����������ָ��TreeNode* root���뷵��һ��bool������������Ƿ�ƽ��
		// write code here
		
		//�������еĽڵ�
		if (root == null) {
			return true;
		}
		
		//�ݹ���ã��Ӹ��ڵ㿪ʼ���ֱ��ҳ����������ĸ߶�
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);

		if (Math.abs(leftDepth - rightDepth) > 1) {
			return false;
		}
		//�ݹ���ã��ֱ�����������������ڵ�����ж�
		return isBalance(root.left) && isBalance(root.right);
	}

	private int getDepth(TreeNode root) {
		//�ݹ�����㣬������С����
		if (root == null) {
			return 0;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
