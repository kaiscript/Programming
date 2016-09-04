package DP;
/**
 * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
测试样例：
2,2
返回：2
 *@author Kaiscript
 *
 *2016年8月4日上午1:53:59
 */
public class Robot {

	public static void main(String[] args) {
		System.out.println(countWays(1,11));
	}
	
	public static int countWays(int x, int y) {
		int count = 0;
		int[][] dp = new int[x][y];
		
		for(int i=0;i<x;i++){
			dp[i][0] = 1;
		}
		
		for(int j=0;j<y;j++){
			dp[0][j] = 1;
		}
		
		for(int i=1;i<x;i++){
			for(int j=1;j<y;j++){
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[x-1][y-1];
	}
	
}
