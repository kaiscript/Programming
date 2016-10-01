package Tree;
/**
 * 题目描述
给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *@author Kaiscript
 *
 *2016年9月26日下午3:04:52
 */
public class GetNext {
	
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode.right!=null)
        	return getMin(pNode.right);
        TreeLinkNode y = pNode.next;
        while(y!=null && y.right==pNode){
        	pNode = y;
        	y = y.next;
        }
        return y;
    }
	
	public TreeLinkNode getMin(TreeLinkNode node){
		if(node==null)
			return null;
		while(node.left!=null)
			node = node.left;
		return node;
	}
	
}
