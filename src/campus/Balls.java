package campus;
/**
 * С������������һ����¥����С������վ��¥���Ĳ�ͬ�㣬����С��վ��¥��������N�ף�����������������£�ÿ����غ������ϴ�����߶ȵ�һ�룬���Դ�����֪��ȫ���䵽���治������4��С��һ�������˶����ף�(���ֶ�Ϊ����)
�����ĸ�����A,B,C,D���뷵����������
����������
100,90,80,70
���أ�1020
 *@author Kaiscript
 *
 *2016��9��5������3:37:42
 */
public class Balls {
	
	public int calcDistance(int A, int B, int C, int D) {
		float res = getDistance(A)+getDistance(B)+getDistance(C)+getDistance(D);
		return (int)res;
	}
	
	public float getDistance(float meter){
		float sum=meter,h=meter;
		while(h>0.000001){
			sum+=h;
			h/=2;
		}
		return (float) Math.ceil(sum);
		//return meter*3;
	}
	
	public static void main(String[] args) {
		System.out.println(new Balls().calcDistance(100, 90, 80, 70));
	}

}
