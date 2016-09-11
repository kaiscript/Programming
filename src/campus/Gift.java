package campus;
/**
 * [�����] ΢�ź��
�����ڼ�С��ʹ��΢���յ��ܶ��������ǳ����ġ��ڲ鿴��ȡ�����¼ʱ���֣�ĳ����������ֵĴ��������˺��������һ�롣���С���ҵ��ú����д�������㷨˼·�ʹ���ʵ�֣�Ҫ���㷨�����ܸ�Ч��
����һ������Ľ������gifts�����Ĵ�Сn���뷵���������Ľ�
��û�н���������һ�룬����0��
����������
[1,2,3,2,2],5
���أ�2
 *@author Kaiscript
 *
 *2016��9��11������3:51:24
 */
public class Gift {
	
	public int getValue(int[] gifts, int n) {
		
		int start = 0;
		int end = n-1;
		int index = Partition(gifts, start, end);
		while(index!=n/2){
			if(index<n/2){
				start = index+1;
				index = Partition(gifts, start, end);
			}
			else if(index>n/2){
				end = index-1;
				index = Partition(gifts, start, end);
			}
		}
		int sum = 0;
		for(int i=0;i<gifts.length;i++){
			if(gifts[i]==gifts[index])
				sum++;
		}
		if(sum>gifts.length/2)
			return gifts[index];
		else 
			return 0;
    }
	
	public int Partition(int[] num,int start,int end){
		int i = start;
		int j = end;
		int k = num[i];
		while(i<j){
			while(num[j]>=k && i<j)
				j--;
			num[i] = num[j];
			while(num[i]<=k && i<j)
				i++;
			num[j] = num[i];
		}
		num[i] = k;
		return i;
	}
	
	public static void main(String[] args){
		int[] gifts = {1,2,3,2,2};
		System.out.println(new Gift().getValue(gifts, gifts.length));
	} 
	
}
