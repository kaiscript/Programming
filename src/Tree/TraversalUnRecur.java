package Tree;

import java.util.Scanner;
import java.util.Stack;

/**
 * 二叉树的前中后序的非递归方式
 *@author Kaiscript
 *
 *2016年9月9日下午3:07:24
 */
public class TraversalUnRecur {
	
	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}
	
	/**
	 * 递归和栈其实是可以相互转换的。
	 * 中序遍历就是，左-中-右。那么，假如一个节点没有左孩子，按照输出中间的数。然后再将其右子树添加到栈里，按照刚才的那种思路。便可以设计出来一个栈
	 * 来维护。
	 */
	public void inOrderUnRecur(Node node){
		if(node!=null){
			Stack<Node> stack = new Stack<>();
			while(!stack.isEmpty() || node!=null){
				if(node!=null){
					stack.push(node);
					node = node.left;
				}
				else{
					Node n = stack.pop();
					System.out.print(n.value+" ");
					node = node.right;
				}
			}
		}
		
	}
	
	/**
	 *	前序遍历就是 中-左-右 
	 */
	public void preOrderUnRecur(Node node){
		if(node!=null){
			Stack<Node> stack = new Stack<>();
			stack.push(node);
			while(!stack.isEmpty()){
				node = stack.pop();
				System.out.println(node.value+" ");
				if(node.right!=null)
					stack.push(node.right);
				if(node.left!=null)
					stack.push(node.left);
			}
			
		}
	}
	
	public void posOrderUnRecur(Node node){
		if(node!=null){
			Stack<Node> stack = new Stack<>();
			
		}
	}
	
}
