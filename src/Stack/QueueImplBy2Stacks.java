package Stack;

import java.util.Stack;

/**
 * 题目描述

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *@author Kaiscript
 *
 *2016年7月31日下午5:32:48
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
