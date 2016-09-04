package Array;
/**
 *@author Kaiscript
 *
 *2016年8月15日下午11:46:39
 */
public class MoreThanHalfNum_Solution {
	
	public boolean checkIfMoreThanHalf(int[] array,int result){
		int times = 0;
		for(int i=0;i<array.length;i++){
			if(array[i] == result)
				times++;
		}
		if((times<<1)>array.length)
			return true;
		else
			return false;
					
	}
	
	public int MoreThanHalfNum_Solution(int [] array) {
		if(array.length==0)
			return 0;
		int res = array[0];
		int times = 1;;
		
		for(int i=1;i<array.length;i++){
			if(res==array[i])
				times++;
			else
				times--;
			
			if(times==0){
				res = array[i];
				times = 1;
			}
			
		}
		if(!checkIfMoreThanHalf(array, res))
			return 0;
		return res;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,2,2,5,4,2};
		System.out.println(new MoreThanHalfNum_Solution().MoreThanHalfNum_Solution(arr));
	}

}
