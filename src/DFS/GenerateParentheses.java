package DFS;

import java.util.ArrayList;

/**
 * 题目描述<br>
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
For example, given n = 3, a solution set is:
"((()))", "(()())", "(())()", "()(())", "()()()"
 *@author Kaiscript
 *
 *2016年9月4日下午8:55:26
 */
public class GenerateParentheses {
	
	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> list = new ArrayList<>();
		dfs(list,"",n,n);
		return list;
    }
	
	public void dfs(ArrayList<String> list,String tmp,int left,int right){
		if(left==0 && right==0){
			list.add(tmp);
			return;
		}
		
		if(left>0){
			dfs(list,tmp+"(",left-1,right);
		}
		
		if(left<right){
			dfs(list,tmp+")",left,right-1);
		}
		
	}
	
}
