package Number;
/**
 * 最大公约数
 *@author Kaiscript
 *
 *2016年9月30日下午4:11:54
 */
public class MaximumCommonDivisor {
	
	/**
	 * 辗转相除法 
	 */
	public int maximumCommonDivisor(int a,int b){
		if(a<b)
			return maximumCommonDivisor(b, a);
		
		while(b!=0){
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	
	/**
	 * 为了避免除法运算带来的大的开销，我们可以用辗转相减法来实现，同样利用的原理如下：
	 * 如果一个数能够同时整除x和y，则它必能同时整除x-y和y，因此最大公约数f(x,y) = f(y,x-y),
	 * 注意要保证左边的数大于右边的数，如果小于，则将二者进行交换。
	 */
	public int maximumCommonDivisor1(int a,int b){
		if(a<b)
			return maximumCommonDivisor1(b, a);
		if(b==0)
			return a;
		return maximumCommonDivisor1(b, a-b);
	}
	
	/**
	 * 为了减少迭代的次数，我们考虑对上述算法进行改进，很明显，我们可以有如下结论：

    1、当x、y都为偶数时，f(x,y) = 2*f(x/2,y/2)

    2、当x为偶数，y为奇数时，f(x,y) = f(x/2,y)

    3、当x为奇数，y为偶数时，f(x,y) = f(x,y/2)  

    4、当x，y多为奇数时，f(x,y) = f(y,x-y)  

    每一次的操作必然是以上四种情况的其中一种，且我们对乘2和除2的操作可以通过移位来完成，效率很高，
    很明显这种算法最坏情况下的时间复杂度为O(log2max(x,y))(以2为底，max(x,y)的对数)，很适合对大的整数进行计算。
	 */
	public int maximumCommonDivisor2(int a,int b){
		if(a<b)
			return maximumCommonDivisor2(b, a);
		if(b==0)
			return a;
		if((a&1)==0){ //a为偶数
			if((b&1)==0) //b为偶数
				return (maximumCommonDivisor2(a>>1, b>>1))<<1;
			else
				return maximumCommonDivisor2(a>>1, b);
		}
		else{
			if((b&1)==0)
				return maximumCommonDivisor2(a, b>>1);
			else{
				return maximumCommonDivisor2(b, a-b);
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		MaximumCommonDivisor mcd = new MaximumCommonDivisor();
		System.out.println(mcd.maximumCommonDivisor(12, 3));
		System.out.println(mcd.maximumCommonDivisor1(12, 8));
		System.out.println(mcd.maximumCommonDivisor2(12, 3));
	}

}
