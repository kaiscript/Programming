package DP;

import java.util.Scanner;

/**
 * 
 * �ϳ���
�� n ��ѧ��վ��һ�ţ�ÿ��ѧ����һ������ֵ��ţţ����� n ��ѧ���а���˳��ѡȡ k ��ѧ����
Ҫ����������ѧ����λ�ñ�ŵĲ���� d��ʹ���� k ��ѧ��������ֵ�ĳ˻�������ܷ������ĳ˻��� 
��������:

ÿ��������� 1 ������������ÿ���������ݵĵ�һ�а���һ������ n (1 <= n <= 50)��
��ʾѧ���ĸ�������������һ�У����� n ��������
��˳���ʾÿ��ѧ��������ֵ ai��-50 <= ai <= 50������������һ�а�������������k �� d (1 <= k <= 10, 1 <= d <= 50)��


�������:

���һ�б�ʾ���ĳ˻���

��������:

3
7 4 7
2 50

�������:

49

 *@author Kaiscript
 *
 *2016��8��9������6:15:07
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
