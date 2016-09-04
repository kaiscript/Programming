package Array;
/**
 * 题目描述

HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
今天测试组开完会后,他又发话了:在古老的一维模式识别中,
常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？
 *@author Kaiscript
 *
 *2016年8月15日下午11:04:10
 */
public class FindGreatestSumOfSubArray {
	
	public static int FindGreatestSumOfSubArray(int[] array) {
		if(array==null || array.length==0)
			return 0;
		int max = Integer.MIN_VALUE;
		int curSum = 0;
		for(int i=0;i<array.length;i++){
			curSum = curSum<=0?0:curSum;
			curSum+=array[i];
			max = Math.max(curSum, max);
		}
		return max;
    }
	
	public static void main(String[] args) {
//		int[] arr = { -11, -10, 6, 4, 5, 3, -7, -8, 3, 6, 9, 1, -7 };
		int[] arr = {-2,-8,-1,-5,-9};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}

}
