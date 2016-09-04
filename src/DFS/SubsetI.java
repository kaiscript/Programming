package DFS;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem 1: Subset I

Given a set of distinct integers, S, return all possible subsets.

Note: Elements in a subset must be in non-descending order. The solution set must not contain duplicate subsets.

For example, If S = [1,2,3], a solution is: [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]

 *@author Kaiscript
 *
 *2016年9月4日下午7:25:52
 */
public class SubsetI {
	
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<>();
		list.add(temp);
		Arrays.sort(S); //题目要求non-descending order
		dfs(list, temp, S, 0);
		return list;
    }
	
	
	public void dfs(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int[] S,int pos){
		for(int i=pos;i<S.length;i++){
			temp.add(S[i]);
			list.add(new ArrayList<>(temp));
			dfs(list,temp,S,i+1);
			temp.remove(temp.size()-1);
		}
	}
	
	public static void main(String[] args) {
		
	}

}
