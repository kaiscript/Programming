package Array;
/**
 * 题目描述
 * 统计一个数字在排序数组中出现的次数。
 * <br>
 * 由于是排好序的数组，统计某个数字出现的个数，遍历一次的话复杂度是O(n),显然不是面试官想要的。
 * 由于是排序数组，我们便可以联想到二分的思路，因为二分便是建立在排序数组的基础上的。
 * 假设统计的是数字K。那么，我们可以找第一个K出现的位置，和第二个K出现的位置，将他们相减，便可以得到出现的次数。
 * 首先先找第一个K出现的位置。二分查找先找出中间的数，与数字K进行比较，如果数字比K大，说明k在中间位置的左边，
 * 那么，我们便去左边找；如果中间数字比K小，我们便去右边找；如果中间数字与K相等，我们如果确定这个数字左边的数不是K，那么这个K就是出现的第一个K。
 * 如果左边数字是K，那么还要继续去左边找。基于以上思路，使用的方法就是递归。
 * 找最后一个数字也是同样的道理。
 * 找第一个K，O(lgN)。找最后一个K，O(lgN).所以复杂度就是O(lgN)
 * 
 *@author Kaiscript
 *
 *2016年9月7日下午8:12:48
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
