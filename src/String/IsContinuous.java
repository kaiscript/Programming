package String;

import java.util.Arrays;

/**��Ŀ����

LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ����κ�����,
����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0��
 *<br>
 *˼·��˳��-->����
 *�����Ƚ���������Ȼ��ͳ���м䲻�����ĸ�������ͳ��0�ĸ���������������ĸ���<=0�ĸ�����˵���ǿ��Խ�������˳�ӵ� 
 *@author Kaiscript
 *
 *2016��9��17������3:40:19
 */
public class IsContinuous {
	
	public boolean isContinuous(int [] numbers) {
		if(numbers==null || numbers.length==0)
			return false;
		Arrays.sort(numbers);
		int zeroes = 0;
		for(int i:numbers){
			if(i==0)
				zeroes++;
			else
				break;
		}
		int emptyIndex = 0;
		for(int i=zeroes+1;i<numbers.length;i++){
			int cha = numbers[i]-numbers[i-1]; //ǰһ�������һ����֮��
			if(cha>1)
				emptyIndex+=cha-1;
			else if(cha==0)  //�����Ϊ0��Ҳ�������ڵ���������ͬ��˵���޷����˳��
				return false;
		}
		if(emptyIndex<=zeroes)
			return true;
		return false;
	}
	
	//1.��0��û���ظ�����
	//2.max-min<5
	public boolean isContinuous1(int [] numbers) {
		if(numbers==null || numbers.length==0)
			return false;
		int max = 0;
		int min = 14;
		int[] hash = new int[14];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==0)
				continue;
			hash[numbers[i]]++;
			if(hash[numbers[i]]>1)
				return false;
			if(numbers[i]>max)
				max = numbers[i];
			if(numbers[i]<min)
				min = numbers[i];
			
		}
			
		if(max-min<5)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args){
		IsContinuous ic = new IsContinuous();
		int[] a = {1,0,0,1,0};
		System.out.println(ic.isContinuous(a));
	}
	
}
