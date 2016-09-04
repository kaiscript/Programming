package Stack;

import java.util.Stack;

/**
 * 题目描述

输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *@author Kaiscript
 *
 *2016年8月12日下午4:53:38
 */
public class IsPopOrder {
//	借助一个辅助栈
//	遍历出栈队列的每个元素
//	首先是出栈队列的4，然后在循环中遍历入栈队列，直到入栈队列中有元素和4相同，否则一直将入栈队列中4之前的元素压入辅助栈
//	遇到元素相同，则弹出辅助栈的栈顶元素，出栈队列的指针向前移动一格。再继续上述过程
//	当出栈队列都遍历完了，辅助栈为空，说明出栈序列不是该栈的一个合法的弹出序列
//	举例：
//	入栈1,2,3,4,5
//	出栈4,5,3,2,1
//	首先1入辅助栈，此时栈顶1≠4，继续入栈2
//	此时栈顶2≠4，继续入栈3
//	此时栈顶3≠4，继续入栈4
//	此时栈顶4＝4，出栈4，弹出序列向后一位，此时为5，,辅助栈里面是1,2,3
//	此时栈顶3≠5，继续入栈5
//	此时栈顶5=5，出栈5,弹出序列向后一位，此时为3，,辅助栈里面是1,2,3
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	      if(pushA==null || pushA.length==0 || popA==null || popA.length==0)
	    	  return false;
	      Stack<Integer> stack = new Stack<>();
	      int pushIndex =0;
	      for(int i=0;i<popA.length;i++){
	    	  
	    	  while(pushIndex<pushA.length && pushA[pushIndex]!=popA[i]){ 
		    	  stack.push(pushA[pushIndex]);  //元素不等则压栈
		    	  pushIndex++;
		      }
	    	  if(pushIndex<pushA.length)
	    		  stack.push(pushA[pushIndex]);
	    	  
	    	  if(stack.peek()==popA[i]){
	    		  stack.pop();
	    		  pushIndex++;
	    	  }
	      
	      }
	      return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,3,2,1};
		IsPopOrder(a,b);
	}

}
