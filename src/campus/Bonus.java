package campus;
/**
 * С�����ڹ�˾Ҫ�����ս�����С��ǡ�û������߸�������Ҫ�ڹ�˾����ϲ���һ���齱��Ϸ����Ϸ��һ��6*6�������Ͻ��У��������36����ֵ���ȵ����ÿ��С���������������һ���������Ҫ�����Ͻǿ�ʼ��Ϸ��ÿ��ֻ�����»��������ƶ�һ�����������½�ֹͣ��һ·�ϵĸ����������С�������õ��������һ���㷨ʹС���õ���ֵ��ߵ����
����һ��6*6�ľ���board������ÿ��Ԫ��Ϊ��Ӧ���ӵ������ֵ,���Ͻ�Ϊ[0,0],�뷵���ܻ�õ�����ֵ����֤ÿ�������ֵ����100С��1000��
 *@author Kaiscript
 *
 *2016��9��5������2:42:14
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
