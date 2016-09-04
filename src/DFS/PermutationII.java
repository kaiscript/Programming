package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *@author Kaiscript
 *
 *2016年9月4日下午8:31:15
 */
public class PermutationII {

	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
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
				while(i<num.length-1 && num[i]==num[i+1]) i++;
			}
		}
	}
	
	public static void main(String[] args) {
		
	}

}
