package DP;
/**
 * 题目描述

我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *@author Kaiscript
 *
 *2016年8月4日下午11:09:00
 */
public class RectCover {
	
	 public int RectCover(int target) {
			if(target==0)
	            return 0;
	        if(target==1)
	            return 1;
	        int[] d = new int[target];
	        d[0] = 1;
	        d[1] = 2;
	        
	        for(int i=2;i<target;i++){
	            d[i] = d[i-1]+d[i-2];
	        }
	        return d[target-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
