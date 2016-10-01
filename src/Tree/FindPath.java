package Tree;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author Kaiscript
 *
 * 2016年8月12日下午9:50:23
 */
public class FindPath {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if(root==null)
			return paths;
		dfs(root, new ArrayList<Integer>(),target);
		return paths;
	}
	//思想就是递归操作。递归，往左子树，右子树操作
	public void dfs(TreeNode root, ArrayList<Integer> path,int target) {
		
		path.add(root.val);
		if (root.left==null && root.right==null) {
			if(root.val==target){
				paths.add(path);
			}	
			return;
			
		}
		//分别负责left和right分支的递归。这里必须分开，不然左右分支的计算结果会相互影响的~
		ArrayList<Integer> path2 = new ArrayList<>();
		path2.addAll(path);
		if(root.left!=null)
			dfs(root.left, path,target-root.val);
		if(root.right!=null){
			dfs(root.right, path2,target-root.val);
		}
		
	}

	private ArrayList<ArrayList<Integer>> allList = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<ArrayList<Integer>> FindPath1(TreeNode root, int target) {
		if(root==null)
			return allList;
		list.add(root.val);
		target-=root.val;
		if(root.left==null && root.right==null && target==0)
			allList.add(new ArrayList<>(list));
		FindPath1(root.left, target);
		FindPath1(root.right, target);
		list.remove(list.size()-1);
		return allList;
	}
	
	
	public static void main(String[] args) {

	}

}
