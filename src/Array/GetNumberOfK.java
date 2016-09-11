package Array;
/**
 * ��Ŀ����
 * ͳ��һ�����������������г��ֵĴ�����
 * <br>
 * �������ź�������飬ͳ��ĳ�����ֳ��ֵĸ���������һ�εĻ����Ӷ���O(n),��Ȼ�������Թ���Ҫ�ġ�
 * �������������飬���Ǳ�������뵽���ֵ�˼·����Ϊ���ֱ��ǽ�������������Ļ����ϵġ�
 * ����ͳ�Ƶ�������K����ô�����ǿ����ҵ�һ��K���ֵ�λ�ã��͵ڶ���K���ֵ�λ�ã����������������Եõ����ֵĴ�����
 * �������ҵ�һ��K���ֵ�λ�á����ֲ������ҳ��м������������K���бȽϣ�������ֱ�K��˵��k���м�λ�õ���ߣ�
 * ��ô�����Ǳ�ȥ����ң�����м����ֱ�KС�����Ǳ�ȥ�ұ��ң�����м�������K��ȣ��������ȷ�����������ߵ�������K����ô���K���ǳ��ֵĵ�һ��K��
 * ������������K����ô��Ҫ����ȥ����ҡ���������˼·��ʹ�õķ������ǵݹ顣
 * �����һ������Ҳ��ͬ���ĵ���
 * �ҵ�һ��K��O(lgN)�������һ��K��O(lgN).���Ը��ӶȾ���O(lgN)
 * 
 *@author Kaiscript
 *
 *2016��9��7������8:12:48
 */
public class GetNumberOfK {
	
	public int GetNumberOfK(int [] array , int k) {
		int first = getFirstOfK(array, k, 0, array.length-1);
		int last = getLastOfK(array, k, 0, array.length-1);
		if(first>-1 && last>-1)
			return (last-first+1);
		return 0;
    }
	
	public int getFirstOfK(int[] a,int k,int start,int end){
		
		if(start>end)
			return -1;
		
		int mid = (start+end)/2;
		int midData = a[mid];
		if(midData==k){
			if(mid>0 && a[mid-1]!=k || mid==0)
				return mid;
			else
				end = mid-1;
		}
		else if(midData>k){
			end = mid-1;
		}
		else
			start = mid +1;
		
		return getFirstOfK(a, k, start, end);
	}
	
	public int getLastOfK(int[] a,int k,int start,int end) {
		
		if(start>end)
			return -1;
		int mid = (start+end)/2;
		int midData = a[mid];
		if(midData==k){
			if(mid<a.length-1 && a[mid+1]!=k || mid==a.length-1)
				return mid;
			else
				start = mid+1;
		}
		else if(midData>k){
			end = mid-1;
		}
		else
			start = mid+1;
		
		return getLastOfK(a, k, start, end);
	}
	
	public static void main(String[] args) {
		
	}

}
