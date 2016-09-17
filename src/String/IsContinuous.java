package String;

import java.util.Arrays;

/**题目描述

LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
 *<br>
 *思路：顺子-->排序
 *可以先将数组排序，然后统计中间不连续的个数。再统计0的个数。如果不连续的个数<=0的个数，说明是可以将数组变成顺子的 
 *@author Kaiscript
 *
 *2016年9月17日下午3:40:19
 */
public class IsContinuous {
	
	public boolean isContinuous(int [] numbers) {
		if(numbers==null || numbers.length==0)
			return false;
		Arrays.sort(numbers);
		int zeroes = 0;
		for(int i:numbers){
			if(i==0)
				zeroes++;
			else
				break;
		}
		int emptyIndex = 0;
		for(int i=zeroes+1;i<numbers.length;i++){
			int cha = numbers[i]-numbers[i-1]; //前一个数与后一个数之差
			if(cha>1)
				emptyIndex+=cha-1;
			else if(cha==0)  //如果差为0，也就是相邻的两个数相同，说明无法组成顺子
				return false;
		}
		if(emptyIndex<=zeroes)
			return true;
		return false;
	}
	
	//1.除0外没有重复的数
	//2.max-min<5
	public boolean isContinuous1(int [] numbers) {
		if(numbers==null || numbers.length==0)
			return false;
		int max = 0;
		int min = 14;
		int[] hash = new int[14];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==0)
				continue;
			hash[numbers[i]]++;
			if(hash[numbers[i]]>1)
				return false;
			if(numbers[i]>max)
				max = numbers[i];
			if(numbers[i]<min)
				min = numbers[i];
			
		}
			
		if(max-min<5)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args){
		IsContinuous ic = new IsContinuous();
		int[] a = {1,0,0,1,0};
		System.out.println(ic.isContinuous(a));
	}
	
}
