package Tree;
/**
 * ��Ŀ����<br>
ʵ��һ�����������������Ƿ�ƽ�⣬ƽ��Ķ������£��������е�����һ����㣬�����������ĸ߶Ȳ����1��
����ָ����������ָ��TreeNode* root���뷵��һ��bool������������Ƿ�ƽ�⡣
 *@author Kaiscript
 *
 *2016��8��7������4:52:24
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
	 * ����ʱ�䣺37ms
		ռ���ڴ棺651k
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
	 * ����ʱ�䣺37ms
		ռ���ڴ棺777k
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
