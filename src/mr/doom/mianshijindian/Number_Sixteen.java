package mr.doom.mianshijindian;
import java.util.ArrayList;
import java.util.Stack;


public class Number_Sixteen {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
		// ���дһ�����򣬰������ջ�������򣨼����Ԫ��λ��ջ������
		// Ҫ�����ֻ��ʹ��һ�������ջ�����ʱ���ݣ������ý�Ԫ�ظ��Ƶ�������ݽṹ�С�
		// ����һ��int[] numbers(C++��Ϊvector&ltint>)��
		// ���е�һ��Ԫ��Ϊջ�����뷵��������ջ����ע������һ��ջ��
		// ��ζ�������������ֻ�ܷ��ʵ���һ��Ԫ�ء�
    	
    	//�Ƚ�numbers����һ��ջ���������������
    	//��stack1ջ��ֵȡ������int�У���stack2ջ���Ƚϣ�
    	//���int��ֱ�ӷ���stack2
    	//���stack.peak()ֵ����ջ��ֵ����stack1���ٴαȽ�stack2.peak()ֵ��int
    	//Ŀ�ľ��ǰ���stack1����Сֵ�ȷ���stack2ջ�ס�
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
