package mr.doom.mianshijindian;
import java.util.Stack;

public class Number_Fifteen {
	//������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
	// �жϵڶ���ջ�Ƿ�Ϊ�գ�Ϊ�վͽ���һ��ջ���е������Ž��ڶ���ջ��
   //�����Ϊ�գ���������� 
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
