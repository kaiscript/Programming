package Tree;

import java.util.Scanner;
import java.util.Stack;

/**
 * ��������ǰ�к���ķǵݹ鷽ʽ
 *@author Kaiscript
 *
 *2016��9��9������3:07:24
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
	 * �ݹ��ջ��ʵ�ǿ����໥ת���ġ�
	 * ����������ǣ���-��-�ҡ���ô������һ���ڵ�û�����ӣ���������м������Ȼ���ٽ�����������ӵ�ջ����ողŵ�����˼·���������Ƴ���һ��ջ
	 * ��ά����
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
	 *	ǰ��������� ��-��-�� 
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
