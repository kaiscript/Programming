package Search;
/**
 *@author Kaiscript
 *
 *2016��9��15������3:25:48
 */
public class HalfSearch {
	
	public int halfSearchFirst(int[] num,int target){
		int start = 0;
		int end = num.length-1;
		int mid;
		while(start<=end){
			mid = (start+end)/2;
			if(num[mid]>=target)
				end = mid-1;
			else
				start = mid+1;
		}
		
		return num[start]==target?start:-1;
		
	}
	
	public int halfSearchLast(int[] num,int target){
		target++;
		int start = 0;
		int end = num.length-1;
		int mid;
		while(start<=end){
			mid = (start+end)/2;
			if(num[mid]>=target) //�˴����ڵ��ڡ��ҵ�target������end�����1
				end = mid -1;
			else
				start = mid +1;
		}
		return num[end] ==target-1?end:-1;	//���������num[end]��target���бȽ�
	}
	
	public static void main(String[] args){
		HalfSearch hs = new HalfSearch();
		int[] num = {0,1,2,3,4,5,6,6,7,7,8};
		
		System.out.println(hs.halfSearchFirst(num, 7));
//		System.out.println(hs.halfSearchLast(num, 7));
	}
	
}
