package Tree;
/**
 * 题目描述

输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
则重建二叉树并返回。
 *@author Kaiscript
 *
 *2016年7月30日下午8:07:44
 */
public class RebuildTree {
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null)
            return null;
    	return construct(pre,0,pre.length-1,in,0,in.length-1);    
    }
    
    public TreeNode construct(int[] pre,int ps,int pe,int[] in,int is,int ie){
        if(ps>pe)
        	return null;
        int index = is;
        int root = pre[ps];
        
        while(root!=in[index]){ // && index<=ie
            index++;
        }
        TreeNode rootNode = new TreeNode(root);
        rootNode.left = construct(pre,ps+1,ps+(index-is),in,is,index-1);
        rootNode.right = construct(pre,ps+index-is+1,pe,in,index+1,ie);
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
