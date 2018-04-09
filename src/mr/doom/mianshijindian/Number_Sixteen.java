package mr.doom.mianshijindian;
import java.util.ArrayList;
import java.util.Stack;


public class Number_Sixteen {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
		// 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），
		// 要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。
		// 给定一个int[] numbers(C++中为vector&ltint>)，
		// 其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，
		// 意味着排序过程中你只能访问到第一个元素。
    	
    	//先将numbers放入一个栈，方便后续操作。
    	//将stack1栈顶值取出放入int中，和stack2栈顶比较，
    	//如果int大，直接放入stack2
    	//如果stack.peak()值大，则将栈顶值放入stack1，再次比较stack2.peak()值和int
    	//目的就是按照stack1的最小值先放入stack2栈底。
        // write code here
    	Stack<Integer> stack1 = new Stack<>();
    	Stack<Integer> stack2 = new Stack<>();
    	
     	for (int i = numbers.length-1; i >=0; i--) {
			stack1.push(numbers[i]);
		}
     	
    	
    	while(!stack1.isEmpty()){
    		int a =  stack1.pop();
    		while(!stack2.isEmpty()&&stack2.peek() > a){
    			stack1.push(stack2.pop());
    		}
    		stack2.push(a);
    	}
    	
    	ArrayList<Integer> list = new ArrayList<>();
    	while(!stack2.isEmpty()){
    		list.add(stack2.pop());
    	}
    	
    	return list;
    }
}
