package Tree;
/**
 * 题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。 
 *@author Kaiscript
 *
 *2016年8月11日下午8:36:08
 */
public class Mirror {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public void Mirror(TreeNode root) {
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			return;
		TreeNode tmp = root.left; //交换root的左右两个子树
		root.left = root.right;
		root.right = tmp;
		
		if(root.left!=null) //如果有左孩子，则去root的左孩子进行交换
			Mirror(root.left);
		if(root.right!=null) //如果有右孩子，则去root的右孩子进行交换
			Mirror(root.right);
		
    }

	/**
	 * 从根节点开始，交换当前节点的左右孩子。再递归地遍历左右孩子。
	 * 也系阔以滴
	 * @param root
     */
    public void Mirror0(TreeNode root){
		if (root == null) {
			return;
		}
		if (root.left!=null || root.right!=null) {
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;

		}
		Mirror0(root.left);
		Mirror0(root.right);
	}

	public static void main(String[] args) {
		
	}

}
