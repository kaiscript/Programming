package DFS;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 题目描述


Given a collection of integers that might contain duplicates, S, return all possible subsets.
Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.

For example,
If S =[1,2,2], a solution is:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 *@author Kaiscript
 *
 *2016年9月4日下午7:50:45
 */
public class SubjectII {
	
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<>();
		Arrays.sort(num);
		list.add(temp);
		dfs(list,temp,num,0);
		return list;
    }
	
	public void dfs(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int[] num,int pos){
		for(int i= pos;i<num.length;i++){
			temp.add(num[i]);
			list.add(new ArrayList<>(temp));
			dfs(list,temp,num,i+1);
			temp.remove(temp.size()-1);
			while(i<num.length-1 && num[i]==num[i+1]) i++;
		}
		
	}
	
}
