package Stack;

import java.util.Stack;

/**
 * ��Ŀ����

������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 *@author Kaiscript
 *
 *2016��7��31������5:32:48
 */
public class QueueImplBy2Stacks {
	
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	     
	    public void push(int node) {
	        stack1.push(node);
	    }
	     
	    public int pop() {
	         
	        if(stack2.isEmpty()){
	            while(!stack1.isEmpty()){
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.pop();
	    }
	
}
