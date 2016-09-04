package Array;
/**
 * ��Ŀ����

�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007 
��������:
��Ŀ��֤�����������û�е���ͬ������
���ݷ�Χ��
	����%50������,size<=10^4
	����%75������,size<=10^5
	����%100������,size<=2*10^5


��������:
1,2,3,4,5,6,7,0

�������:
7
 *@author Kaiscript
 *
 *2016��8��23������4:52:35
 */
public class InversePairs {
	//˼·�ǹ鲢����
	public static int InversePairs(int [] array) {
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++){
            copy[i] = array[i];
        }
        int count = InversePairsCore(array, copy, 0, array.length-1);
        return count;
    }
	
	
	public static int InversePairsCore(int[] data,int[] temp,int start,int end){
		if(start==end)
			return 0;
		int mid = (start+end)>>1;
		int leftCount = InversePairsCore(data, temp, start, mid);
		int rightCount = InversePairsCore(data, temp, mid+1, end);
		int i = mid;
		int j = end;
		int copyIndex = end;
		int count = 0;
		
		while(i>=start && j>mid){
			if(data[i]>data[j]){
				temp[copyIndex--] = data[i--];
				count +=j-mid;  //ÿ�ι鲢ʱ��ͳ����������������ϳɵ�����ԡ���Ϊ�ݹ鵽���ÿ��С���鶼���ź���ġ���Ϊ
				//data[i]>data[j]ʱ������j-mid�������ܹ�������Ե�
				if(count>=1000000007){
					count%=1000000007;
				}
			}
			else{
				temp[copyIndex--] = data[j--];
			}
		}
		
		while(j>mid)
			temp[copyIndex--] = data[j--];
		while(i>=start)
			temp[copyIndex--] = data[i--];
		
		for(int s=start;s<=end;s++)
			data[s] = temp[s];
		
		return (leftCount+rightCount+count)%1000000007;
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(a));
	}

}
