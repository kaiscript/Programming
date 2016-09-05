package campus;
/**
 * 小东所在公司要发年终奖，而小东恰好获得了最高福利，他要在公司年会上参与一个抽奖游戏，游戏在一个6*6的棋盘上进行，上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，一路上的格子里的礼物小东都能拿到，请设计一个算法使小东拿到价值最高的礼物。
给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角为[0,0],请返回能获得的最大价值，保证每个礼物价值大于100小于1000。
 *@author Kaiscript
 *
 *2016年9月5日下午2:42:14
 */
public class Bonus {
	
	public static int[][] move = {{0,1},{1,0}};
	
	public static int max = Integer.MIN_VALUE;
	
	public int getMost(int[][] board) {
		
		int n = board.length;
		int[][] dp = new int[board.length][board[0].length];
		dp[0][0] = board[0][0];
		for(int i=1;i<n;i++){
			dp[0][i] += dp[0][i-1]+board[0][i];
			dp[i][0] += dp[i-1][0]+board[i][0];
		}
		
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				board[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+board[i][j];
			}
		}
		return board[n-1][n-1];
    }
	
	public static void main(String[] args){
		int[][] a = {{426,306,641,372,477,409},{223,172,327,586,363,553},{292,645,248,316,711,295},{127,192,495,208,547,175},{131,448,178,264,207,676},{655,407,309,358,246,714}};
		int res = new Bonus().getMost(a);
		System.out.println(res);
	}
	
	
}
