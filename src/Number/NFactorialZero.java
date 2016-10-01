package Number;
/**
 * N！中0的个数
 * <br>
 * N！二进制表示中最低位1的位置
 *@author Kaiscript
 *
 *2016年9月27日下午10:01:47
 */
public class NFactorialZero {

	public static void main(String[] args) {
		NFactorialZero factorial = new NFactorialZero();
		System.out.println(factorial.FactorizlNum0_1(10));
		System.out.println(factorial.FactorizlNum0_2(5));
	}
	
	/**
	 * 例如10=2*5；出现成对的2和5就有一个0。由于乘数2的个数比5多，那么只要判断N！中为5的质因数的 个数就可以了
	 * 1~N，每个数都进行判断
	 * @param num
	 * @return
	 */
	public int FactorizlNum0_1(int num){
		int count = 0;
		for(int i=1;i<=num;i++){
			int j = i;
			while(j%5==0){
				count++;
				j/=5;
			}
		}
		return count;
	}
	
	/**
	 *  N！中含有的质因数k的个数为：[N/k]+[N/k^2]+[N/k^3]+...（总会存在一个t,使得k^t>N,便有[N/k^t]=0）
	 * @param num
	 * @return
	 */
	public int FactorizlNum0_2(int num){
		int count = 0;
		while(num!=1){
			count+=num/5;
			num/=5;
		}
		return count;
	}
	
	/**
	 *  N！二进制表示中最低位1的位置

    比如3！为6，二进制为1010，那么最低位的1的位置为2，这里最左边的位置从1开始计算。

    方法一
    我们假设最低位的1的位置为第k位，则N！=2^(k-1)+...+2^t+...+2^p+...，这里t，p等意味着后面的第t+1位，第p+1位也为1，且p>t>k。这样很容易看出来，N！中质因数2的个数为k-1个，也就是说，最低位1的位置即为N！中质因数2的个数加1，因此问题又转化为了求N！中质因数2的个数了，同样利用结论：

N！中含有的质因数k的个数为：[N/k]+[N/k^2]+[N/k^3]+...（总会存在一个t,使得k^t>N,便有[N/k^t]=0）
	 * @param num
	 * @return
	 */
	public int Lowest1(int num){
		int count = 0;
		while(num!=1){
			count+=num/5;
			num/=5;
		}
		return count+1;
	}
	
}
