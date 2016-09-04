package DP;
/**
 *@author Kaiscript
 *
 *2016年8月4日上午1:10:27
 */
public class GoUpstairs {

	public static void main(String[] args) {
		System.out.println(countWays(36196));
	}
	
	public static int countWays(int n) {
		int[] d = new int[n];
		d[0] = 1;
		if(n<3)
			return n;
		else if(n==3)
			return 4;
		else{
			d[0] = 1;
			d[1] = 2;
			d[2] = 4;
				
		}
		/*状态：d[i]
		状态转移方程：d[i] = d[i-3] + d[i-2] + d[i-1]*/
		for(int i=3;i<d.length;i++){
			for(int j=0;j<3;j++){
				d[i] = (d[i-3]+(d[i-2]+d[i-1])%1000000007)%1000000007;
			}
		}
		return d[n-1];
	}
	
}
