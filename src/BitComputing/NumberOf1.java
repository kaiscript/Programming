package BitComputing;
/**
 *@author Kaiscript
 *题目描述

输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *2016年8月6日下午10:51:16
 */
public class NumberOf1 {
	
	public static int  NumberOf1(int n) {
		int count = 0;
        while(n!=0){
        	count++;
        	n = n & (n-1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(NumberOf1(12));
//		System.out.println(Integer.toBinaryString(12).replace("0", "").length());
	}

}
