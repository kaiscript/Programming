package Tree;

/**
 * ��Ŀ����<br>
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * <br>
 * ��������ȡ����ǿ����������������ֻ��һ���ڵ㣬��ô������Ⱦ�Ϊ1.
 * �������ڵ���һ�����ӣ���ô��ȼ���1+���ӵ����1.
 * �����һ���Һ��ӣ���ô�������1+�Һ��ӵ����1.
 * ������Һ��Ӷ��У���ô���Ǳ�������1�������Һ������������ȡ�
 * ��������˼·�����ǿ����뵽�ݹ��˼�롣
 *
 * @author Kaiscript
 *         <p>
 *         2016��9��8������9:16:03
 */
public class TreeDepth {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int TreeDepth(TreeNode pRoot) {
        if (pRoot == null)
            return 0;

        int leftLength = TreeDepth(pRoot.left);
        int rightLength = TreeDepth(pRoot.right);
        return (leftLength > rightLength ? leftLength : rightLength) + 1; //+1����Ϊ����������ĸ߶�

    }

}
