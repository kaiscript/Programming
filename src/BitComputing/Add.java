package BitComputing;
/**
 * 题目描述

写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 *<br>
 *首先看十进制是如何做的： 5+7=12，三步走
第一步：相加各位的值，不算进位，得到2。
第二步：计算进位值，得到10. 如果这一步的进位值为0，那么第一步得到的值就是最终结果。

第三步：重复上述两步，只是相加的值变成上述两步的得到的结果2和10，得到12。

同样我们可以用三步走的方式计算二进制值相加： 5-101，7-111 第一步：相加各位的值，不算进位，得到010，二进制每位相加就相当于各位做异或操作，101^111。

第二步：计算进位值，得到1010，相当于各位做与操作得到101，再向左移一位得到1010，(101&111)<<1。

第三步重复上述两步， 各位相加 010^1010=1000，进位值为100=(010&1010)<<1。
     继续重复上述两步：1000^100 = 1100，进位值为0，跳出循环，1100为最终结果。
 *@author Kaiscript
 *
 *2016年9月17日下午10:17:35
 */
public class Add {
	
	public int Add(int num1,int num2) {
        while(num2!=0){
        	int temp = num1^num2; //异或。得到没有进位的二进制
    		num2 = (num1&num2)<<1;//相与，再左移一位。得到进位的二进制，与没有进位的二进制相加能得到结果。
    		num1 = temp; //将没有进位的二进制赋值给num1，进入下一个循环
        }
		
		return num1;
    }
	
}
