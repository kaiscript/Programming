package Stack;

import java.util.Stack;

/**
 *@author Kaiscript
 *
 *2016年8月12日下午3:56:07
 */
public class MinStack {
	
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> help = new Stack<>();
	
	public void push(int node) {
        if(stack.isEmpty() && help.isEmpty()){
        	stack.push(node);
            help.push(node);
        }
        else{
        	int top = help.peek();
        	if(node<top)
        		help.push(node);
        	else
        		help.push(top);
        	stack.push(node);
        }
        
    }
    
    public void pop() {
        stack.pop();
        help.pop();
    }
    
    public int top() {
        return stack.pop();
    }
    
    public int min() {
        return help.peek();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
