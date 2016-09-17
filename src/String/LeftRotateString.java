package String;
/**
 * 题目描述

汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！
 * <br>
 * 思路：将字符串*2，再截取
 *@author Kaiscript
 *
 *2016年9月16日下午9:55:17
 */
public class LeftRotateString {
	
	public String LeftRotateString(String str,int n) {
		if(str.length()==0)
			return "";
       String res = str+str;
       res = res.substring(n,str.length()+n);
       return res;
    }
	
	public static void main(String[] args){
		LeftRotateString lrs = new LeftRotateString();
		System.out.println(lrs.LeftRotateString("abcXYZdef", 3));
	}
	
}
