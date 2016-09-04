package Number;

import java.util.ArrayList;

/**
 * ��Ŀ����
<br>��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 *@author Kaiscript
 *
 *2016��8��23������11:52:11
 */
public class GetUglyNumber {
	
	//��������ǰ��ĳ���*2��*3��*5�����ġ����Ƕ�̬�滮��˼�롣
	public static int GetUglyNumber_Solution(int index) {
		if(index==0)
			return 0;
		ArrayList<Integer> list = new ArrayList<>();
		int i2=0,i3=0,i5=0; //*2��ָ�롢*3��ָ�롢*5��֮��
		list.add(1);
		while(list.size()<index){
			int m2 = list.get(i2)*2;
			int m3 = list.get(i3)*3;
			int m5 = list.get(i5)*5;
			int min = Math.min(Math.min(m2, m3), m5);  //ȡ�����е���Сֵ
			list.add(min);
			if(min==m2) //��Сֵ�򽫱�������ָ����ǰ�ƣ���Ϊ�Ѿ�������������
				i2++;
			if(min==m3)
				i3++;
			if(min==m5)
				i5++;
			
		}
		return list.get(index-1);
    }
	
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(GetUglyNumber_Solution0(50));
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"ns");
		long start1 = System.currentTimeMillis();
		System.out.println(GetUglyNumber_Solution(50));
		long end1 = System.currentTimeMillis();
		System.out.println((end1-start1)+"ns");
		
	}
	
	//��������ʱ
	public static int GetUglyNumber_Solution0(int index) {
        int num=0;
		int uglyIndex = 0;
		while(uglyIndex<index){
			num++;
			if(isUgly(num)){
				uglyIndex++;
			}
			
		}
		
        return num;
    }
    
    public static  boolean isUgly(int num){
		while(num%2==0)
			num/=2;
		while(num%3==0)
			num/=3;
		while(num%5==0)
			num/=5;
		return num==1?true:false;
	}
	
}
