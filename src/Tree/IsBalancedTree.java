package Tree;

/**
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。左右子树的深度差不超过1，那么它就是一颗平衡二叉树。
 * <br>
 * 左右子树的深度不超过1，可以递归求解左右子树的高度，相减判断。但这样节点会重复地计算。
 * 用Java的话，可以用一个类去保存每个节点的高度。
 *@author Kaiscript
 *
 *2016年9月8日下午9:24:52
 */
public class IsBalancedTree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public boolean IsBalanced_Solution(TreeNode root) {
		return isBalanced(root, new NodeHeight());
    }
	
	public class NodeHeight{
		int height;
	}
	
	public boolean isBalanced(TreeNode node,NodeHeight h){
		if(node==null)
			return true;
		
		NodeHeight l = new NodeHeight(),r = new NodeHeight();
		if(isBalanced(node.left, l) && isBalanced(node.right, r)){
			if(Math.abs(l.height-r.height)>1)
				return false;
			
			h.height = l.height>r.height?l.height+1:r.height+1;
			return true;
		}
		return false;
	}
	
}
