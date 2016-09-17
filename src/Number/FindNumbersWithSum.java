package Number;

import java.util.ArrayList;

/**
 * 题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
输出描述:
对应每个测试案例，输出两个数，小的先输出。
 *<br>
 *查找两个数的和-->两个-->两个指针
 *一个指针指向头，一个指向尾。计算两个数字的和，和大于指定和，则要令和减小，即尾指针向前移。和小于指定和，则要令和增大，即头指针向后移
 *@author Kaiscript
 *
 *2016年9月15日下午4:44:46
 */
public class FindNumbersWithSum {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int start = 0;
        int end = array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        if(array.length==0 || array==null)
        	return list;
        int s = 0;
        while(start<=end){
        	s = array[start]+array[end];
        	if(s>sum){//如果和大于目标和
        		end--;
        	}
        	else if(s<sum){
        		start++;
        	}
        	else if(s==sum){
        		list.add(array[start]);
                list.add(array[end]);
                break;
        	}
        	
        }
       
        return list;
    }
}
