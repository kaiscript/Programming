package DP;
/**
 * 题目描述


A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
How many possible unique paths are there?

Above is a 3 x 7 grid. How many possible unique paths are there?
Note: m and n will be at most 100.
 *@author Kaiscript
 *
 *2016年9月5日下午4:53:03
 */
public class UniquePaths {
	
	public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i=0;i<m;i++){
        	dp[i][0] = 1;
        	for(int j=1;j<n;j++){
        		if(i==0)
        			dp[i][j] = 1;
        		else
        			dp[i][j] = dp[i-1][j]+dp[i][j-1];
        	}
        }
        return dp[m-1][n-1];
        
    }
	
}
