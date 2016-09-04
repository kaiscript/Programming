package Number;

import java.util.ArrayList;

/**
 * ��Ŀ����

����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 *@author Kaiscript
 *
 *2016��8��17������11:38:04
 */
public class GetLeastNumbers_Solution {
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		
		ArrayList<Integer> list = new ArrayList<>();
		if(input==null || input.length<k || input.length==0)
			return list;
		
		for(int i = k/2-1;i>=0;i--) //��������.��Ϊ��k���������Ա�֤kΪ���ڵ��ʱ��k���ϵ���Ϊ���Ѿ���
			maxHeapFixdown(input, i,k);
		
		for(int i=k;i<input.length;i++){
			if(input[i]<input[0]){  //�ӵ�k������ʼ����������ȸ��ڵ�С���򽻻���Ȼ��������ѡ������ķ�Χ��0~k-1����֤��0~k-1�����϶�����С��k����
				int temp = input[0];
				input[0] = input[i];
				input[i] = temp;
				maxHeapFixdown(input, 0, k-1);
			}
		}
		
		for(int i=0;i<k;i++)
			list.add(input[i]);
		
		return list;
    }
	
	public static void maxHeapFixdown(int[] a,int i,int n){
		int j = 2*i+1;
		int temp = a[i];
		while(j<=n){
			if(j<n-1 && a[j]<a[j+1])
				j++;
			if(a[j]<=temp)
				break;
			
			a[i] = a[j];
			i = j;
			j = j*2+1;
			
		}
		a[i] = temp;
	}
	
	/**
	 * ţ���� --- ��ʱ
	 * @param input
	 * @param k
	 * @return
	 */
	public ArrayList<Integer> GetLeastNumbers_Solution0(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input==null || input.length==0 || input.length>k)
        	return list;
        int index = Partition(input, 0, input.length-1);
        int start = 0;
        int end = input.length-1;
        while(index!=k-1){
        	if(k-1>index){
        		start = index+1;
        		index = Partition(input, start, end);
        	}
        	if(k-1<index){
        		end = index-1;
        		index = Partition(input, start, end);
        	}
        }
        for(int i=0;i<k;i++)
        	list.add(input[i]);
        return list;
    }
	
	public int Partition(int[] input,int start,int end){
		int low = start;
		int high = end;
		
		int x = input[low];
		while(low<high){
			while(input[high]>x && low<high)
				high--;
			input[low] = input[high];
			while(input[low]<x && low<high)
				low++;
			input[high] = input[low];
		}
		input[low] = x;
		return low;
		
	}
	
	public static void main(String[] args) {
		int[] input = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> list = GetLeastNumbers_Solution(input,4);
		for(int i:list)
			System.out.print(i+" ");
	}

}
