package DP;
/**
 * ��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ������һ���㷨������������ж������߷���
��������������int x,int y���뷵�ػ����˵��߷���Ŀ����֤x��yС�ڵ���12��
����������
2,2
���أ�2
 *@author Kaiscript
 *
 *2016��8��4������1:53:59
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
