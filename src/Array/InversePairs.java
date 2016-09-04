package Array;
/**
 * 题目描述

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007 
输入描述:
题目保证输入的数组中没有的相同的数字
数据范围：
	对于%50的数据,size<=10^4
	对于%75的数据,size<=10^5
	对于%100的数据,size<=2*10^5


输入例子:
1,2,3,4,5,6,7,0

输出例子:
7
 *@author Kaiscript
 *
 *2016年8月23日下午4:52:35
 */
public class InversePairs {
	//思路是归并排序
	public static int InversePairs(int [] array) {
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++){
            copy[i] = array[i];
        }
        int count = InversePairsCore(array, copy, 0, array.length-1);
        return count;
    }
	
	
	public static int InversePairsCore(int[] data,int[] temp,int start,int end){
		if(start==end)
			return 0;
		int mid = (start+end)>>1;
		int leftCount = InversePairsCore(data, temp, start, mid);
		int rightCount = InversePairsCore(data, temp, mid+1, end);
		int i = mid;
		int j = end;
		int copyIndex = end;
		int count = 0;
		
		while(i>=start && j>mid){
			if(data[i]>data[j]){
				temp[copyIndex--] = data[i--];
				count +=j-mid;  //每次归并时，统计左右两个数组组合成的逆序对。因为递归到最后，每个小数组都是排好序的。作为
				//data[i]>data[j]时，会有j-mid个数是能构成逆序对的
				if(count>=1000000007){
					count%=1000000007;
				}
			}
			else{
				temp[copyIndex--] = data[j--];
			}
		}
		
		while(j>mid)
			temp[copyIndex--] = data[j--];
		while(i>=start)
			temp[copyIndex--] = data[i--];
		
		for(int s=start;s<=end;s++)
			data[s] = temp[s];
		
		return (leftCount+rightCount+count)%1000000007;
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(a));
	}

}
