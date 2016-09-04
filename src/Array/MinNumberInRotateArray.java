package Array;
/**
 *@author Kaiscript
 *
 *2016年9月3日下午7:39:02
 */
public class MinNumberInRotateArray {
	
	public int minNumberInRotateArray(int [] array) {
	    
		int p1 = 0;
		int p2 = array.length-1;
		int mid = p1;
		while(array[p1]>=array[p2]){
			if(p2-p1==1){
				mid = p2;
				break;
			}
			mid = (p1+p2)/2;
			if(array[p1]==array[mid] && array[mid]==array[p2]){
				return orderFind(array,p1,p2);
			}
			else if(array[mid]>=array[p1]){
				p1 = mid;
			}
			else if(array[mid]<=array[p2])
				p2 = mid;
			
		}
		return array[mid];
    }
	
	private int orderFind(int[] array, int p1, int p2) {
		int result = array[p1];
		for(int i=p1+1;i<=p2;i++){
			if(array[i]<result)
				result = array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArray(a));
	}

}
