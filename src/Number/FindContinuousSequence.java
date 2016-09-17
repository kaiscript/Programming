package Number;

import java.util.ArrayList;

/**
 * 题目描述

小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck! 
输出描述:
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 *<br>
 *根据 找有序数组中 和为s的某两个数字的思路。可以在头部维护两个指针。一个指向第一个，一个指向第二个。
 *@author Kaiscript
 *
 *2016年9月15日下午3:51:37
 */
public class FindContinuousSequence {
	
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int small = 1;
		int big = 2;
		int mid = (1+sum)/2;
		int curSum = small+big;
		while(small<mid){
			if(curSum==sum){
				add(list,small,big);
			}
			while(curSum>sum && small<mid){
				curSum-=small;
				small++;
				if(curSum==sum)
					add(list,small,big);
			}
			
			big++;
			curSum+=big;
		}
		return list;
	}
	
	public void add(ArrayList<ArrayList<Integer>> list,int small,int big){
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = small;i<=big;i++)
			temp.add(i);
		list.add(temp);
	}
	
	/*public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if(sum<3){
			ArrayList<Integer> t = new ArrayList<>();
			t.add(sum);
			list.add(t);
			return list;
		}
			
		int p1 = 1;
		int p2 = 2;
		int s = 0;
		int[] num = new int[sum+1];
		for(int i=1;i<=num.length;i++)
			num[i] = i;
		
		while(p1<=p2){
			int sn = num[p1];
			int en = num[p2];
			s = (sn+en)*(p2-p1+1)/2;
			if(s<sum && p2<num.length-1){
				p2++;
			}
			else if(s>sum){
				p1++;
			}
			else if(s==sum){
				ArrayList<Integer> temp = new ArrayList<>();
				for(int i=sn;i<=en;i++){
					temp.add(i);
				}
				list.add(temp);
				p1++; //符合情况后再让头指针前进，后面可能有其他和是目标和的情况。
				p2 = sum-1;
			}
				
		}
		return list;
    }*/
	
	public static void main(String[] args){
		FindContinuousSequence fcs = new FindContinuousSequence();
		System.out.println(fcs.FindContinuousSequence(3));
	}
	
}
