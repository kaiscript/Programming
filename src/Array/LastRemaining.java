package Array;
/**
 * 题目描述

每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,
并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 *<br>
 *此题就是所谓的约瑟夫环问题。
 *可以模拟一个环，然后通过计数来解决 
 *@author Kaiscript
 *
 *2016年9月17日下午4:38:23
 */
public class LastRemaining {
	
	public int LastRemaining_Solution(int n, int m) {
		int step = 0;
		int[] a = new int[n];
		int i = -1;//这里必须-1.因为进入循环就加1了
		int count = 0; //已经有几个人走出去了
		
		while(count<=n){
			i++;
			if(i>=n) //如果超过了长度，必须将其变成头部，模拟一个环
				i=0;
			if(a[i]==-1)
				continue;
			step++;
			if(step==m){//每次迭代都达到了第m个人
				a[i] = -1;
				count++;
				step=0;
			}
			
		}
		return i;
    }
	
}
