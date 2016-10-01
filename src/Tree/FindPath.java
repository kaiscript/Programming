package Tree;

import java.util.ArrayList;

/**
 * �������к�Ϊĳһֵ��·��
����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * @author Kaiscript
 *
 * 2016��8��12������9:50:23
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
	//˼����ǵݹ�������ݹ飬��������������������
	public void dfs(TreeNode root, ArrayList<Integer> path,int target) {
		
		path.add(root.val);
		if (root.left==null && root.right==null) {
			if(root.val==target){
				paths.add(path);
			}	
			return;
			
		}
		//�ֱ���left��right��֧�ĵݹ顣�������ֿ�����Ȼ���ҷ�֧�ļ��������໥Ӱ���~
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
