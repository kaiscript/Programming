package Stack;

import java.util.Stack;

/**
 * ��Ŀ����

���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 *@author Kaiscript
 *
 *2016��8��12������4:53:38
 */
public class IsPopOrder {
//	����һ������ջ
//	������ջ���е�ÿ��Ԫ��
//	�����ǳ�ջ���е�4��Ȼ����ѭ���б�����ջ���У�ֱ����ջ��������Ԫ�غ�4��ͬ������һֱ����ջ������4֮ǰ��Ԫ��ѹ�븨��ջ
//	����Ԫ����ͬ���򵯳�����ջ��ջ��Ԫ�أ���ջ���е�ָ����ǰ�ƶ�һ���ټ�����������
//	����ջ���ж��������ˣ�����ջΪ�գ�˵����ջ���в��Ǹ�ջ��һ���Ϸ��ĵ�������
//	������
//	��ջ1,2,3,4,5
//	��ջ4,5,3,2,1
//	����1�븨��ջ����ʱջ��1��4��������ջ2
//	��ʱջ��2��4��������ջ3
//	��ʱջ��3��4��������ջ4
//	��ʱջ��4��4����ջ4�������������һλ����ʱΪ5��,����ջ������1,2,3
//	��ʱջ��3��5��������ջ5
//	��ʱջ��5=5����ջ5,�����������һλ����ʱΪ3��,����ջ������1,2,3
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	      if(pushA==null || pushA.length==0 || popA==null || popA.length==0)
	    	  return false;
	      Stack<Integer> stack = new Stack<>();
	      int pushIndex =0;
	      for(int i=0;i<popA.length;i++){
	    	  
	    	  while(pushIndex<pushA.length && pushA[pushIndex]!=popA[i]){ 
		    	  stack.push(pushA[pushIndex]);  //Ԫ�ز�����ѹջ
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
