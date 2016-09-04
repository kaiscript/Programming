package Tree;
/**
 * 题目描述<br>
实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 *@author Kaiscript
 *
 *2016年8月7日下午4:52:24
 */
public class CheckBalanceTree {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}

	public boolean isBalance(TreeNode root) {
		if(checkHeight(root)==-1)
			return false;
		else 
			return true;
    }
	
	/**
	 * 运行时间：37ms
		占用内存：651k
	 * @param root
	 * @return
	 */
	public int checkHeight(TreeNode root){
		if(root==null)
			return 0;
		int leftHeight = checkHeight(root.left);
		if(leftHeight==-1)
			return -1;
		int rightHeight = checkHeight(root.right);
		if(rightHeight==-1)
			return -1;
		
		int offsetHeight = Math.abs(rightHeight-leftHeight);
		if(offsetHeight>1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight)+1;
	}	
	
	
	public boolean isBalance0(TreeNode root) {
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		int offsetHeight = Math.abs(leftHeight-rightHeight);
		if(offsetHeight>1)
			return false;
		else
			return isBalance0(root.left) && isBalance0(root.right);
    }
	/**
	 * 运行时间：37ms
		占用内存：777k
	 * @param root
	 * @return
	 */
	public int getHeight(TreeNode root){
		if(root==null)
			return 0;
		else
			return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
