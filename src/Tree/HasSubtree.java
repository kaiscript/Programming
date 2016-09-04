package Tree;


/**
 * ��Ŀ����

�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 *@author Kaiscript
 *
 *2016��8��11������7:25:08
 */
public class HasSubtree {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1!=null && root2!=null){
        	if(root1.val==root2.val)
        		result = tree1HasTree2(root1, root2);
        	if(!result)
        		result = HasSubtree(root1.left, root2);
        	if(!result)
        		result = HasSubtree(root1.right, root2);
        }
        return result;
    }
	
	public boolean tree1HasTree2(TreeNode t1,TreeNode t2){
		if(t2==null)
			return true;
		if(t1==null)
			return false;
		if(t1.val!=t2.val)
			return false;
		return tree1HasTree2(t1.left, t2.left) && tree1HasTree2(t1.right, t2.right);
	}
	
	public static void main(String[] args) {
		
	}

}
