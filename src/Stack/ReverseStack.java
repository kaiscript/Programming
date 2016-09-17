package Stack;
/**
 * 一个栈依次压入1,2,3,4,5那么从栈顶到栈底分别为5,4,3,2,1。将这个栈转置后，从栈顶到栈底为1,2,3,4,5，
 * 也就是实现了栈中元素的逆序，请设计一个算法实现逆序栈的操作，但是只能用递归函数来实现，而不能用另外的数据结构。
给定一个栈Stack以及栈的大小top，请返回逆序后的栈。
测试样例：
[1,2,3,4,5],5
返回：[5,4,3,2,1]
 *@author Kaiscript
 *
 *2016年9月12日下午3:25:18
 */
public class ReverseStack {
	
	int i = 0;
	
	//递归将元素逆序。
	//当递归到最后一层也就是栈的第一个元素时，index应该是最开始的。所以可以设置一个变量来控制index
	public int[] reverseStackRecursively(int[] stack, int top) {
		if(top>0){
			int a = stack[top-1];
			i++;
			stack = reverseStackRecursively(stack, top-1);
			i--;
			stack[i] = a;
			
		}
		return stack;
    }
	
}
