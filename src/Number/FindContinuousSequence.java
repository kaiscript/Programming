package Number;

import java.util.ArrayList;

/**
 * ��Ŀ����

С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck! 
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 *<br>
 *���� ������������ ��Ϊs��ĳ�������ֵ�˼·��������ͷ��ά������ָ�롣һ��ָ���һ����һ��ָ��ڶ�����
 *@author Kaiscript
 *
 *2016��9��15������3:51:37
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
				p1++; //�������������ͷָ��ǰ���������������������Ŀ��͵������
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
