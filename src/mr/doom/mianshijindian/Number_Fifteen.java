package mr.doom.mianshijindian;
import java.util.Stack;

public class Number_Fifteen {
	//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
	// 判断第二个栈是否为空，为空就将第一个栈所有的数都放进第二个栈，
   //如果不为空，就依次输出 
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
