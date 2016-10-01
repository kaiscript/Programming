package Tree;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 * <br>此题的树为二叉搜索树，故可以按照此思路来查找：
 * 根据二叉搜索树的性质。假如q，p的值都小于根节点，则q，p的LCA在根节点的左子树。q，p的值都大于根节点，则q，p的LCA在根节点的右子树。
 * p，q一个大，一个小于本节点，则本节点就是他们的LCA
 * @author Kaiscript
 * 2016年9月22日下午6:07:47
 */
public class LowestCommonAncestor {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;
		if ((root.val >= p.val && root.val <= q.val)
				|| (root.val <= p.val && root.val >= q.val))
			return root;
		else if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);
		else if (root.val < p.val && root.val < q.val)
			return lowestCommonAncestor(root.right, p, q);
		return null;
	}

}
