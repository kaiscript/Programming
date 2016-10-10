package Tree;

/**
 * 题目描述<br>
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * <br>
 * 找树的深度。我们可以这样想象，如果树只有一个节点，那么他的深度就为1.
 * 如果这个节点有一个左孩子，那么深度即是1+左孩子的深度1.
 * 如果有一个右孩子，那么就是深度1+右孩子的深度1.
 * 如果左右孩子都有，那么就是本身的深度1加上左右孩子上最深的深度。
 * 按照这种思路，我们可以想到递归的思想。
 *
 * @author Kaiscript
 *         <p>
 *         2016年9月8日下午9:16:03
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
        return (leftLength > rightLength ? leftLength : rightLength) + 1; //+1是因为加上了自身的高度

    }

}
