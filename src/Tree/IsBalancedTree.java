package Tree;

/**
 * ��Ŀ����
 * ����һ�ö��������жϸö������Ƿ���ƽ���������������������Ȳ����1����ô������һ��ƽ���������
 * <br>
 * ������������Ȳ�����1�����Եݹ�������������ĸ߶ȣ�����жϡ��������ڵ���ظ��ؼ��㡣
 * ��Java�Ļ���������һ����ȥ����ÿ���ڵ�ĸ߶ȡ�
 *@author Kaiscript
 *
 *2016��9��8������9:24:52
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
