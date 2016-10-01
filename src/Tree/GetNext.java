package Tree;
/**
 * ��Ŀ����
����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 *@author Kaiscript
 *
 *2016��9��26������3:04:52
 */
public class GetNext {
	
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode.right!=null)
        	return getMin(pNode.right);
        TreeLinkNode y = pNode.next;
        while(y!=null && y.right==pNode){
        	pNode = y;
        	y = y.next;
        }
        return y;
    }
	
	public TreeLinkNode getMin(TreeLinkNode node){
		if(node==null)
			return null;
		while(node.left!=null)
			node = node.left;
		return node;
	}
	
}
