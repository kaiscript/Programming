package Array;
/**
 * ��Ŀ����

HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����᲻�ᱻ������ס��
 *@author Kaiscript
 *
 *2016��8��15������11:04:10
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
