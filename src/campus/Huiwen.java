package campus;

import java.util.Scanner;

/**
 * [编程题] 构造回文
给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
输出需要删除的字符个数。

输入描述:

输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
  


输出描述:

对于每组数据，输出一个整数，代表最少需要删除的字符个数。

输入例子:
abcda
google

输出例子:
2
2
 *@author Kaiscript
 *
 *2016年9月11日下午4:38:06
 */
public class Huiwen {

	/**
	 * 思路就是将正序和逆序的字符串求最长公共子序列
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			String strni = "";
			char[] cs = str.toCharArray();
			for(int i=cs.length-1;i>=0;i--)
				strni = strni+cs[i];
			//从尾往头开始匹配
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
			
			//从头往后开始匹配
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
