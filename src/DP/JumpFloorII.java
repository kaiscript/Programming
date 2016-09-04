package DP;
/**
 * 题目描述

一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *@author Kaiscript
 *
 *2016年8月4日下午10:40:58
 */
public class JumpFloorII {
	
	public int JumpFloorII(int target) {
        if(target<=2){
            return target;
        }
        
        int[] dp = new int[target];
        dp[0] = 1;
        dp[1] = 2;
        
        for(int i=2;i<target;i++){
            int temp = 0;
            for(int j=i-1;j>=0;j--){
                temp +=dp[j];
            }
            dp[i] = temp+1;
        }
        return dp[target-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
