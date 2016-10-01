package Number;
/**
 * ���Լ��
 *@author Kaiscript
 *
 *2016��9��30������4:11:54
 */
public class MaximumCommonDivisor {
	
	/**
	 * շת����� 
	 */
	public int maximumCommonDivisor(int a,int b){
		if(a<b)
			return maximumCommonDivisor(b, a);
		
		while(b!=0){
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	
	/**
	 * Ϊ�˱��������������Ĵ�Ŀ��������ǿ�����շת�������ʵ�֣�ͬ�����õ�ԭ�����£�
	 * ���һ�����ܹ�ͬʱ����x��y����������ͬʱ����x-y��y��������Լ��f(x,y) = f(y,x-y),
	 * ע��Ҫ��֤��ߵ��������ұߵ��������С�ڣ��򽫶��߽��н�����
	 */
	public int maximumCommonDivisor1(int a,int b){
		if(a<b)
			return maximumCommonDivisor1(b, a);
		if(b==0)
			return a;
		return maximumCommonDivisor1(b, a-b);
	}
	
	/**
	 * Ϊ�˼��ٵ����Ĵ��������ǿ��Ƕ������㷨���иĽ��������ԣ����ǿ��������½��ۣ�

    1����x��y��Ϊż��ʱ��f(x,y) = 2*f(x/2,y/2)

    2����xΪż����yΪ����ʱ��f(x,y) = f(x/2,y)

    3����xΪ������yΪż��ʱ��f(x,y) = f(x,y/2)  

    4����x��y��Ϊ����ʱ��f(x,y) = f(y,x-y)  

    ÿһ�εĲ�����Ȼ�������������������һ�֣������ǶԳ�2�ͳ�2�Ĳ�������ͨ����λ����ɣ�Ч�ʺܸߣ�
    �����������㷨�����µ�ʱ�临�Ӷ�ΪO(log2max(x,y))(��2Ϊ�ף�max(x,y)�Ķ���)�����ʺ϶Դ���������м��㡣
	 */
	public int maximumCommonDivisor2(int a,int b){
		if(a<b)
			return maximumCommonDivisor2(b, a);
		if(b==0)
			return a;
		if((a&1)==0){ //aΪż��
			if((b&1)==0) //bΪż��
				return (maximumCommonDivisor2(a>>1, b>>1))<<1;
			else
				return maximumCommonDivisor2(a>>1, b);
		}
		else{
			if((b&1)==0)
				return maximumCommonDivisor2(a, b>>1);
			else{
				return maximumCommonDivisor2(b, a-b);
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		MaximumCommonDivisor mcd = new MaximumCommonDivisor();
		System.out.println(mcd.maximumCommonDivisor(12, 3));
		System.out.println(mcd.maximumCommonDivisor1(12, 8));
		System.out.println(mcd.maximumCommonDivisor2(12, 3));
	}

}
