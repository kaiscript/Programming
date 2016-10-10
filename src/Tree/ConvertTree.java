package Tree;
/**
 * 题目描述

输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *@author Kaiscript
 *
 *2016年8月15日下午4:14:31
 */
public class ConvertTree {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}

	public TreeNode Conver1(TreeNode head){
	    TreeNode lastNodeInList = null;
	    ConvertByInOrder(head,lastNodeInList);
        while (head != null) {
            head = head.left;
        }
        return head;
    }

	/**
	 * 根据中序遍历得思想。递归
	 * @param node
	 * @param lastNodeInList
     * @return
     */
	public void ConvertByInOrder(TreeNode node,TreeNode lastNodeInList){
		if(node==null)
			return;
		TreeNode current = node;
		if (current.left != null) {
			ConvertByInOrder(current.left,lastNodeInList);
		}
		current.left = lastNodeInList; //将当前节点的next指向前面链表的最后一个节点
		if (lastNodeInList != null)  //前面链表的最后一个节点的next指向当前节点
			lastNodeInList.right = current;
		lastNodeInList = current;  //完成一个节点的连接，向前移
		if (current.right != null) {
			ConvertByInOrder(current.right,lastNodeInList);
		}
	}
    /////////////////////////////////////////////////////////////////
	/*解题思路：
	1.将左子树构造成双链表，并返回链表头节点。
	2.定位至左子树双链表最后一个节点。
	3.如果左子树链表不为空的话，将当前root追加到左子树链表。
	4.将右子树构造成双链表，并返回链表头节点。
	5.如果右子树链表不为空的话，将该链表追加到root节点之后。
	6.根据左子树链表是否为空确定返回的节点。*/
	public TreeNode Convert(TreeNode root) {
        if(root==null)
        	return null;
        if(root.left==null && root.right==null)
        	return root;
        
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        while(p!=null && p.right!=null)
        	p = p.right;
        
        if(left!=null){
        	p.right = root;
            root.left = p;
        }
        
        TreeNode right = Convert(root.right);
        if(right!=null){
        	root.right = right;
            right.left = root;
        }
        
        return left!=null?left:root;
    }
	
	///////////////////////////////////////
	TreeNode head = null;
	TreeNode p = null;
	//中序遍历
	public void ConvertSub(TreeNode root){
		if(root==null)
			return;
		ConvertSub(root.left);
		if(head==null){
			head = root;
			p = head;
		}
		else{
			p.right = root;
			root.left = p;
			p = p.right;//p到达了当前的根节点
		}
		ConvertSub(root.right);
		
	}
	
	public TreeNode Convert0(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }
	////////////////////////////////////////////

}
