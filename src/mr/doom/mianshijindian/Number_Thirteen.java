package mr.doom.mianshijindian;
import java.util.Stack;


public class Number_Thirteen {
	public boolean isPalindrome(ListNode pHead) {
		// 请编写一个函数，检查链表是否为回文。
		// 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文
		
		// 快慢指针，注意判断链表长度奇偶
		if (pHead == null) {
			return false;
		}
		
		ListNode fast = pHead;
		ListNode slow = pHead;
		
		Stack<Integer> stack = new Stack<Integer>();

		while(fast != null && fast.next != null){
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if (fast != null) {
			slow = slow.next;
		}

		while(slow != null){
			if(stack.pop() != slow.val){
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}

	
//		《方法1》：反转链表
//		       可以将原始链表反转，判断反转以后的链表与原始链表是否完全一致，
//		如果一致便返回true，如果不一致则返回false。反转链表需要额外的存储空间，
//		不是特别优秀的方法。
//		《方法2》：栈实现
//		       我们可以想到从中间节点向两侧开始比较，如果全部相同，则返回true，
//		否则返回false，因为无法获得一个节点的前一个节点，这个时候我们可以想到用栈实现，
//		先将链表前半部分的元素分别压入堆栈，
//		然后在遍历后半部分元素的时候同时和栈顶元素进行比较，
//		如果全部相等则返回true，否则返回false。
//		      特别注意：因为我们不知道链表的的长度，可以通过快慢指针
//		（一个指针每次移动两个，一个指针每次移动一个）来找到中间元素，
//		这样整体只需要遍历链表一次，所需要的栈空间缩小为方法1的一半。
//		《方法3》：递归法
//		       递归方法分为尾部递归和首部递归，还有中间递归，
//		一般的尾部递归都可以用循环来实现，对于我们这道题目，
//		递归的时候无法比较第一个元素和最后一个元素，即使知道最后一个元素，
//		也无法获得最后一个元素的前一个元素。所以我们选择首部递归，
//		先递归直到中间的元素，然后比较中间的元素，把比较结果返回，
//		同时保存后半部分下一个要比较的元素（用引用传递可以，用二级指针也可以），
//		递归返回后，如果是true，则继续比较，如果是false，则直接返回false。
	
}
