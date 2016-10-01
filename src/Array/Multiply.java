package Array;
/**
 * 题目描述

给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 *<br>利用两个辅助数组，
 *第一个数组L依次保存A数组从0-length-1的乘积，
 *第二个数组h依次保存从length-1到0的乘积，
 *然后每一个要求的B[i]=L[i-1]*H[i+1].
 *大概的思路就是这样，
 *具体做的时候会发现第一个数组可以用一个全局变量cur代替掉。
 *@author Kaiscript
 *
 *2016年9月22日下午9:28:11
 */
public class Multiply {
	
	public int[] multiply(int[] A) {
		
		int[] h = new int[A.length];
		int[] B = new int[A.length];
		
		h[0]=1;
		h[A.length-1] = A[A.length-1];
		for(int i=A.length-2;i>=0;i--){
			h[i] = h[i+1]*A[i];
		}
		B[0] = h[1];
		int cur = 1;
		for(int i=1;i<A.length-1;i++){
			cur*=A[i-1];
			B[i]=cur*h[i+1];
		}
		B[A.length-1] = cur*A[A.length-2];
		return B;
    }
	
}
