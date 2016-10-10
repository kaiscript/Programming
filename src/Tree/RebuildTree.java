package Tree;

/**
 * ��Ŀ����
 * <p>
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 *
 * @author Kaiscript
 *         <p>
 *         2016��7��30������8:07:44
 */
public class RebuildTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null)
            return null;
        return construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode construct(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe)
            return null;
        int index = is;
        int root = pre[ps];

        while (root != in[index]) { // && index<=ie
            index++;
        }
        TreeNode rootNode = new TreeNode(root);
        //ǰ������У��������Ǵӵ�ǰ�ڵ㣨��������ĸ��ڵ㣩+1����ʼ,ps+(index-is)����;����������Ǵ�is��ʼ�����ҵ����Ǹ�index-1����
        rootNode.left = construct(pre, ps + 1, ps + (index - is), in, is, index - 1);
        //�������������ǰ���������Ϊ�ղ���������[ps+1,ps+(index-is)],�����������Ǵ�ps+(index-is)+1��ʼ����pe����
        //�������,���ҵ����Ǹ�index��ʼ������Ҫ+1����ie����
        rootNode.right = construct(pre, ps + (index - is) + 1, pe, in, index + 1, ie);
        return rootNode;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
