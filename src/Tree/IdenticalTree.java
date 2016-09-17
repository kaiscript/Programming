package Tree;
/**�������ñ˴˶����Ķ�����A��B�����дһ����Ч�㷨�����A���Ƿ����һ��������B�������˽ṹ��ȫ��ͬ��
 * �������ö�������ͷ���A��B���뷵��һ��boolֵ������A���Ƿ����һ��ͬ����B��������
 * 
 * ���ñ�־λ��һ��ƥ��ɹ�resultΪtrue����ʣ�²�ִ��
 * �ݹ�˼�룺���ڵ���ͬ����ݹ���ã����ڵ㲻ͬ���ж���������Tree2�Ƿ���ͬ���ж���������Tree2�Ƿ���ͬ��
 * �ݹ�����һ�㣨�ݹ���������Tree2Ϊ�գ�˵���������ˣ�ƥ��ɹ���
 * ���Tree2��Ϊ�գ�Tree1Ϊ�գ�˵��ƥ�䲻�ɹ���
 * ���Tree1��tree2��Ϊ�գ�˵��ƥ��ɹ�������ȥ�ֱ�ƥ�����ǵ���������������
 * 
 *@author Kaiscript
 *
 *2016��9��12������4:05:46
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
