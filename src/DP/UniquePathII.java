package DP;
/**
 * 题目描述


Follow up for "Unique Paths":
Now consider if some obstacles are added to the grids. How many unique paths would there be?
An obstacle and empty space is marked as1and0respectively in the grid.
For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is2.
Note: m and n will be at most 100.
 *@author Kaiscript
 *
 *2016年9月5日下午5:19:51
 */
public class UniquePathII {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
		int n = obstacleGrid.length;
		int m = obstacleGrid[0].length;
		int[][] dp = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i==0 && j==0)
					dp[i][j] = 1;
				if(obstacleGrid[i][j]==1)
					dp[i][j] = 0;
				else{
					if(i>0 && j==0){
						dp[i][j] = dp[i-1][j];
					}
					else if(j>0 && i==0){
						dp[i][j] = dp[i][j-1];
					}
					else if(i>0 && j>0){
						dp[i][j] = dp[i-1][j]+dp[i][j-1];
					}
				}
			}
		}
		return dp[n-1][m-1];
    }
	
}
