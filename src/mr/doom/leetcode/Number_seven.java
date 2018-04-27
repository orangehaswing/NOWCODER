package mr.doom.leetcode;

public class Number_seven {
    public boolean hasCycle(ListNode head) {
		// Given a linked list, determine if it has a cycle in it.
		// Follow up:
		// Can you solve it without using extra space?
    	//¿ìÂıÖ¸Õë
    	if (head == null) {
			return false;
		}
    	
    	ListNode fast = head;
    	ListNode slow = head;
    	
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		if(slow == fast) {
    			return true;
    		}
    	}
    	
    	return false;
    }
}
