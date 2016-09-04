package Compute;
/**
 * ��Ŀ����

����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 *@author Kaiscript
 *
 *2016��8��10������4:42:58
 */
public class Power {
	
	
	public static double Power(double base, int exponent) {
		 if(exponent==0)
			 return 1;
		 else if(exponent>0){
			 return powerWithUnsignedExponent(base, exponent);
		 }
		 else if(exponent<0){
			 double temp = powerWithUnsignedExponent(base, -exponent);
			 return 1/temp;
		 }
		 return 0;
	}
	
	public static double powerWithUnsignedExponent(double base,long exponent){
		if(exponent==0)
			return 1;
		if(exponent==1)
			return base;
		double result = powerWithUnsignedExponent(base, exponent>>1);
		result*=result;
		if((exponent & 0x1) ==1)
			result*=base;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Power(2, 0));
	}

}
