package Array;
/**
 * ��Ŀ����

����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 *<br>���������������飬
 *��һ������L���α���A�����0-length-1�ĳ˻���
 *�ڶ�������h���α����length-1��0�ĳ˻���
 *Ȼ��ÿһ��Ҫ���B[i]=L[i-1]*H[i+1].
 *��ŵ�˼·����������
 *��������ʱ��ᷢ�ֵ�һ�����������һ��ȫ�ֱ���cur�������
 *@author Kaiscript
 *
 *2016��9��22������9:28:11
 */
public class Multiply {
	
	public int[] multiply(int[] A) {
		
		int[] h = new int[A.length];
		int[] B = new int[A.length];
		
		h[0]=1;
		h[A.length-1] = A[A.length-1];
		for(int i=A.length-2;i>=0;i--){
			h[i] = h[i+1]*A[i];
		}
		B[0] = h[1];
		int cur = 1;
		for(int i=1;i<A.length-1;i++){
			cur*=A[i-1];
			B[i]=cur*h[i+1];
		}
		B[A.length-1] = cur*A[A.length-2];
		return B;
    }
	
}
