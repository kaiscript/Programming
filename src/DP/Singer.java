package DP;

import java.util.Scanner;

/**
 * 
 * 合唱团
有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？ 
输入描述:

每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，
表示学生的个数，接下来的一行，包含 n 个整数，
按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。


输出描述:

输出一行表示最大的乘积。

输入例子:

3
7 4 7
2 50

输出例子:

49

 *@author Kaiscript
 *
 *2016年8月9日下午6:15:07
 */
public class Singer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] a = new Long[n+1];
		for(int i=1;i<=n;i++){
			Long score = sc.nextLong();
			a[i] = score;
		}
		int kk = sc.nextInt();
		int d = sc.nextInt();
		Long[][] min = new Long[n+1][kk+1];
		Long[][] max = new Long[n+1][kk+1];
		 for (int ii = 0; ii <= n; ii++){
             max[ii] = new Long[kk+1];
             min[ii] = new Long[kk+1];
             for (int jj = 0; jj <= kk; jj++){
                 max[ii][jj] = 0L;
                 min[ii][jj] = 0L;
             }
         }
		Long res = 0l;
		for(int i=1;i<=n;i++){
			min[i][1] = max[i][1] = a[i];
			for(int j=2;j<=kk;j++){
				for(int k=i-1;k>=Math.max(i-d, 1);k--){
					max[i][j] = Math.max(max[i][j], Math.max(min[k][j-1]*a[i], max[k][j-1]*a[i]));
					min[i][j] = Math.min(min[i][j], Math.min(min[k][j-1]*a[i], max[k][j-1]*a[i]));
				}
			}
			res = Math.max(res,Math.max(max[i][kk], min[i][kk]));
		}
		System.out.println(res);
		
	}

}
