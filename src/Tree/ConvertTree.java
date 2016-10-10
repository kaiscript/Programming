package Tree;
/**
 * ��Ŀ����

����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 *@author Kaiscript
 *
 *2016��8��15������4:14:31
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
	 * �������������˼�롣�ݹ�
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
		current.left = lastNodeInList; //����ǰ�ڵ��nextָ��ǰ����������һ���ڵ�
		if (lastNodeInList != null)  //ǰ����������һ���ڵ��nextָ��ǰ�ڵ�
			lastNodeInList.right = current;
		lastNodeInList = current;  //���һ���ڵ�����ӣ���ǰ��
		if (current.right != null) {
			ConvertByInOrder(current.right,lastNodeInList);
		}
	}
    /////////////////////////////////////////////////////////////////
	/*����˼·��
	1.�������������˫��������������ͷ�ڵ㡣
	2.��λ��������˫�������һ���ڵ㡣
	3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
	4.�������������˫��������������ͷ�ڵ㡣
	5.�������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
	6.���������������Ƿ�Ϊ��ȷ�����صĽڵ㡣*/
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
	//�������
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
			p = p.right;//p�����˵�ǰ�ĸ��ڵ�
		}
		ConvertSub(root.right);
		
	}
	
	public TreeNode Convert0(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }
	////////////////////////////////////////////

}
