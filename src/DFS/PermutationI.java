package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 题目描述


Given a collection of numbers, return all possible permutations.
For example,
[1,2,3]have the following permutations:
[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2], and[3,2,1].
 *@author Kaiscript
 *
 *2016年9月4日下午8:13:16
 */
public class PermutationI {
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		boolean[] book = new boolean[num.length];
		Arrays.sort(num);
		dfs(list,temp,0,num,book);
		return list;
    }
		
	public void dfs(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int step,int[] num,boolean[] book){
		if(step==num.length){
			list.add(new ArrayList<>(temp));
			for(Iterator<Integer> iter = temp.iterator();iter.hasNext();){
				System.out.print(iter.next()+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<num.length;i++){
			if(!book[i]){
				book[i] = true;
				temp.add(num[i]);
				dfs(list,temp,step+1,num,book);
				temp.remove(temp.size()-1);
				book[i] = false;
			}
		}
	}
	
	public static void main(String[] args){
		int[] num={4,7};
		new PermutationI().permute(num);
	}
	
}
