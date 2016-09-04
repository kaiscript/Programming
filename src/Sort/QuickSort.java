package Sort;
/**
 *@author Kaiscript
 *
 *2016年8月17日下午10:58:21
 */
public class QuickSort {

	public static int Partition(int[] a,int start,int end){
			
			int i = start;
			int j = end;
			int pivot = a[i];
			while(i<j){
				while(a[j]>=pivot && i<j)
					j--;
				a[i] = a[j];
				
				while(a[i]<=pivot && i<j)
					i++;
				a[j] = a[i];
				
			}
			a[i] = pivot;
			
		return i;
	}
	
	
	public static void main(String[] args) {
		int[] a = {2,3,5,12,4,97,23};
		Partition(a, 0, a.length-1);
		for(int i:a)
			System.out.print(i+" ");
	}

}
