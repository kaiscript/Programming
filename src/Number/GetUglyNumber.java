package Number;

import java.util.ArrayList;

/**
 * 题目描述
<br>把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *@author Kaiscript
 *
 *2016年8月23日上午11:52:11
 */
public class GetUglyNumber {
	
	//丑数是由前面的丑数*2、*3、*5得来的。故是动态规划的思想。
	public static int GetUglyNumber_Solution(int index) {
		if(index==0)
			return 0;
		ArrayList<Integer> list = new ArrayList<>();
		int i2=0,i3=0,i5=0; //*2的指针、*3的指针、*5的之争
		list.add(1);
		while(list.size()<index){
			int m2 = list.get(i2)*2;
			int m3 = list.get(i3)*3;
			int m5 = list.get(i5)*5;
			int min = Math.min(Math.min(m2, m3), m5);  //取他们中的最小值
			list.add(min);
			if(min==m2) //最小值则将被乘数的指针向前移，因为已经处理好这个数了
				i2++;
			if(min==m3)
				i3++;
			if(min==m5)
				i5++;
			
		}
		return list.get(index-1);
    }
	
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(GetUglyNumber_Solution0(50));
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"ns");
		long start1 = System.currentTimeMillis();
		System.out.println(GetUglyNumber_Solution(50));
		long end1 = System.currentTimeMillis();
		System.out.println((end1-start1)+"ns");
		
	}
	
	//暴力、耗时
	public static int GetUglyNumber_Solution0(int index) {
        int num=0;
		int uglyIndex = 0;
		while(uglyIndex<index){
			num++;
			if(isUgly(num)){
				uglyIndex++;
			}
			
		}
		
        return num;
    }
    
    public static  boolean isUgly(int num){
		while(num%2==0)
			num/=2;
		while(num%3==0)
			num/=3;
		while(num%5==0)
			num/=5;
		return num==1?true:false;
	}
	
}
