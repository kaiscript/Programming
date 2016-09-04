package Array;
/**
 * 题目描述

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *@author Kaiscript
 *
 *2016年8月10日下午5:29:44
 */
public class ReOrderArray {
	//可以用类似冒泡排序的方法，但复杂度太高
	public static void reOrderArray(int [] array) {
        int[] res = new int[array.length];
        int k = array.length-1;
        for(int i=array.length-1;i>=0;i--){
        	if((array[i] & 0x1)==0){
        		res[k--] = array[i];
        	}
        	
        }
        int j = 0;
        for(int i=0;i<array.length;i++){
        	if((array[i] & 0x1)==1)
        		res[j++] = array[i];
        }
        for(int i=0;i<res.length;i++){
        	array[i] = res[i];
        }
    }
	/*http://www.nowcoder.com/questionTerminal/beb5aa231adc45b2a5dcc5b62c93f593
		设置两个指针，奇数指针从0开始，偶数指针从奇数个数的末尾开始 遍历，填数
		也是可以的*/
	public static void main(String[] args) {
		int[] a = {2,4,8,5,234,7};
		reOrderArray(a);
	}

}
