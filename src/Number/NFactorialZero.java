package Number;
/**
 * N����0�ĸ���
 * <br>
 * N�������Ʊ�ʾ�����λ1��λ��
 *@author Kaiscript
 *
 *2016��9��27������10:01:47
 */
public class NFactorialZero {

	public static void main(String[] args) {
		NFactorialZero factorial = new NFactorialZero();
		System.out.println(factorial.FactorizlNum0_1(10));
		System.out.println(factorial.FactorizlNum0_2(5));
	}
	
	/**
	 * ����10=2*5�����ֳɶԵ�2��5����һ��0�����ڳ���2�ĸ�����5�࣬��ôֻҪ�ж�N����Ϊ5���������� �����Ϳ�����
	 * 1~N��ÿ�����������ж�
	 * @param num
	 * @return
	 */
	public int FactorizlNum0_1(int num){
		int count = 0;
		for(int i=1;i<=num;i++){
			int j = i;
			while(j%5==0){
				count++;
				j/=5;
			}
		}
		return count;
	}
	
	/**
	 *  N���к��е�������k�ĸ���Ϊ��[N/k]+[N/k^2]+[N/k^3]+...���ܻ����һ��t,ʹ��k^t>N,����[N/k^t]=0��
	 * @param num
	 * @return
	 */
	public int FactorizlNum0_2(int num){
		int count = 0;
		while(num!=1){
			count+=num/5;
			num/=5;
		}
		return count;
	}
	
	/**
	 *  N�������Ʊ�ʾ�����λ1��λ��

    ����3��Ϊ6��������Ϊ1010����ô���λ��1��λ��Ϊ2����������ߵ�λ�ô�1��ʼ���㡣

    ����һ
    ���Ǽ������λ��1��λ��Ϊ��kλ����N��=2^(k-1)+...+2^t+...+2^p+...������t��p����ζ�ź���ĵ�t+1λ����p+1λҲΪ1����p>t>k�����������׿�������N����������2�ĸ���Ϊk-1����Ҳ����˵�����λ1��λ�ü�ΪN����������2�ĸ�����1�����������ת��Ϊ����N����������2�ĸ����ˣ�ͬ�����ý��ۣ�

N���к��е�������k�ĸ���Ϊ��[N/k]+[N/k^2]+[N/k^3]+...���ܻ����һ��t,ʹ��k^t>N,����[N/k^t]=0��
	 * @param num
	 * @return
	 */
	public int Lowest1(int num){
		int count = 0;
		while(num!=1){
			count+=num/5;
			num/=5;
		}
		return count+1;
	}
	
}
