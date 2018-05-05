package mr.doom.leetcode;

public class Number_twenty_three {
	
	  /*Definition for binary tree with next pointer.
	  public class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }*/
	 
public void connect(TreeLinkNode root) {
		// Populate each next pointer to point to its next right node.
		// If there is no next right node, the next pointer should be set toNULL.
		// Initially, all next pointers are set toNULL.
//	For example,
//	Given the following perfect binary tree,
//
//	         1
//	       /  \
//	      2    3
//	     / \  / \
//	    4  5  6  7
//
//	After calling your function, the tree should look like:
//
//	         1 -> NULL
//	       /  \
//	      2 -> 3 -> NULL
//	     / \  / \
//	    4->5->6->7 -> NULL
//	
	
	//next是什么(TODO)
	
		//递归调用实现
		if (root == null) {
			return;
		}
	
		if (root.left != null && root.right != null ) {
			//next pointer to point to its next right node
			root.left.next = root.right;  
		}
		//TODO
		if (root.right != null && root.next != null) {
			root.right.next = root.next.left;
		}
	
		connect(root.left);
		connect(root.right);
		
		//非递归调用实现(TODO)
		
		
		
		
		
    }
}
