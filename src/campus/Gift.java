package campus;
/**
 * [编程题] 微信红包
春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
若没有金额超过总数的一半，返回0。
测试样例：
[1,2,3,2,2],5
返回：2
 *@author Kaiscript
 *
 *2016年9月11日下午3:51:24
 */
public class Gift {
	
	public int getValue(int[] gifts, int n) {
		
		int start = 0;
		int end = n-1;
		int index = Partition(gifts, start, end);
		while(index!=n/2){
			if(index<n/2){
				start = index+1;
				index = Partition(gifts, start, end);
			}
			else if(index>n/2){
				end = index-1;
				index = Partition(gifts, start, end);
			}
		}
		int sum = 0;
		for(int i=0;i<gifts.length;i++){
			if(gifts[i]==gifts[index])
				sum++;
		}
		if(sum>gifts.length/2)
			return gifts[index];
		else 
			return 0;
    }
	
	public int Partition(int[] num,int start,int end){
		int i = start;
		int j = end;
		int k = num[i];
		while(i<j){
			while(num[j]>=k && i<j)
				j--;
			num[i] = num[j];
			while(num[i]<=k && i<j)
				i++;
			num[j] = num[i];
		}
		num[i] = k;
		return i;
	}
	
	public static void main(String[] args){
		int[] gifts = {1,2,3,2,2};
		System.out.println(new Gift().getValue(gifts, gifts.length));
	} 
	
}
