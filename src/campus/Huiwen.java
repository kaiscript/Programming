package campus;

import java.util.Scanner;

/**
 * [�����] �������
����һ���ַ���s������Դ���ɾ��һЩ�ַ���ʹ��ʣ�µĴ���һ�����Ĵ������ɾ������ʹ�û��Ĵ���أ�
�����Ҫɾ�����ַ�������

��������:

���������ж��飬ÿ�����һ���ַ���s���ұ�֤:1<=s.length<=1000.
  


�������:

����ÿ�����ݣ����һ������������������Ҫɾ�����ַ�������

��������:
abcda
google

�������:
2
2
 *@author Kaiscript
 *
 *2016��9��11������4:38:06
 */
public class Huiwen {

	/**
	 * ˼·���ǽ������������ַ����������������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			String strni = "";
			char[] cs = str.toCharArray();
			for(int i=cs.length-1;i>=0;i--)
				strni = strni+cs[i];
			//��β��ͷ��ʼƥ��
			int[][] dp = new int[str.length()+1][str.length()+1];
			for(int i = str.length()-1;i>=0;i--){
				for(int j = strni.length()-1;j>=0;j--){
					if(str.charAt(i)==strni.charAt(j))
						dp[i][j] = dp[i+1][j+1]+1;
					else
						dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
			System.out.println(str.length()-dp[0][0]);
			
			//��ͷ����ʼƥ��
//			for(int i=0;i<str.length();i++)
//				dp[i][0] = 0;
//			for(int i=0;i<strni.length();i++)
//				dp[0][i] = 0;
//			
//			for(int i=1;i<=str.length();i++){
//				for(int j=1;j<=strni.length();j++){
//					if(str.charAt(i-1)==strni.charAt(j-1))
//						dp[i][j] = dp[i-1][j-1]+1;
//					else
//						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
//				}
//			}
//			System.out.println(str.length()-dp[str.length()][str.length()]);
		}
		
	}

}
