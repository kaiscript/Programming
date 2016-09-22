package Number;
/**
 * 题目描述

求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *<br>
 *思路：公式法：（首项+末项）*项数/2
 *但是不可以用乘除法，所以必须用递归或者迭代。但是n等于0的情况，由于不能用if。
 *故利用短路特性
 *@author Kaiscript
 *
 *2016年9月17日下午4:48:35
 */
public class Sum_Solution{
	
	public int Sum_Solution(int n) {
		int sum = n;
		boolean bol = (n!=0) && ((sum+=Sum_Solution(n-1))>0);//短路特性就可以利用递归。
		return sum;
    }
	
}
