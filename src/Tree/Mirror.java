package Tree;
/**
 * ��Ŀ����
���������Ķ�����������任ΪԴ�������ľ��� 
 *@author Kaiscript
 *
 *2016��8��11������8:36:08
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
		TreeNode tmp = root.left; //����root��������������
		root.left = root.right;
		root.right = tmp;
		
		if(root.left!=null) //��������ӣ���ȥroot�����ӽ��н���
			Mirror(root.left);
		if(root.right!=null) //������Һ��ӣ���ȥroot���Һ��ӽ��н���
			Mirror(root.right);
		
    }

	/**
	 * �Ӹ��ڵ㿪ʼ��������ǰ�ڵ�����Һ��ӡ��ٵݹ�ر������Һ��ӡ�
	 * Ҳϵ���Ե�
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
