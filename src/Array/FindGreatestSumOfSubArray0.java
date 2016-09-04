package Array;
/**
 *@author Kaiscript
 *
 *2016年8月23日上午11:13:45
 */
public class FindGreatestSumOfSubArray0 {
	
	public static int FindGreatestSumOfSubArray(int[] array) {
		if(array.length==0 || array==null)
			return 0;
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for(int i=0;i<array.length;i++){
			cur = cur>0?cur:0;
			cur+=array[i];
			max = cur>max?cur:max;
		}
		return max;
    }
	
	public static void main(String[] args) {
		int[] array = {6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

}
