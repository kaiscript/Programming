package Tree;
/**对于两棵彼此独立的二叉树A和B，请编写一个高效算法，检查A中是否存在一棵子树与B树的拓扑结构完全相同。
 * 给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。
 * 
 * 设置标志位，一旦匹配成功result为true，则剩下不执行
 * 递归思想：根节点相同，则递归调用；根节点不同则判断左子树与Tree2是否相同，判断右子树与Tree2是否相同。
 * 递归的最后一层（递归基）：如果Tree2为空，说明遍历完了，匹配成功；
 * 如果Tree2不为空，Tree1为空，说明匹配不成功；
 * 如果Tree1和tree2都为空，说明匹配成功，接下去分别匹配他们的左子树和右子树
 * 
 *@author Kaiscript
 *
 *2016年9月12日下午4:05:46
 */
public class IdenticalTree {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public boolean chkIdentical(TreeNode A, TreeNode B) {
		boolean result = false;
		if(A!=null && B!=null){
			if(A.val==B.val){
				result = tree1HasTree2(A, B);
			}
			if(!result)
				result = chkIdentical(A.left, B);
			if(!result)
				result = chkIdentical(A.right,B);
			
		}
		return result;
    }
	
	public boolean tree1HasTree2(TreeNode a,TreeNode b){
		if(b==null)
			return true;
		if(a==null && b!=null)
			return false;
		if(a.val!=b.val)
			return false;
		return tree1HasTree2(a.left, b.left) && tree1HasTree2(a.right, b.right);
	}
	
}
