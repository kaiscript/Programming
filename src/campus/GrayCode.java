package campus;
/**
 * [�����] ���ɸ�����
��һ�����ı����У��������������ڵĴ���ֻ��һλ����������ͬ�� ������ֱ���Ϊ������(Gray Code)�����дһ��������ʹ�õݹ�ķ�������Nλ�ĸ����롣
����һ������n���뷵��nλ�ĸ����룬˳��Ϊ��0��ʼ��
����������
1
���أ�["0","1"]
 *@author Kaiscript
 *
 *2016��9��11������3:20:48
 */
public class GrayCode {
	
	public static String[] getGray(int n) {
		int m = 1<<n;
		String[] gray = new String[m];
		if(n==1){
			gray[0] = "0";
			gray[1] = "1";
			return gray;
		}
		String[] temp = getGray(n-1);
		int j = 0;
		for(int i=0;i<m;i++){
			if(i<m/2){
				gray[i] = "0"+temp[j++];
			}
			else{
				gray[i] = "1"+temp[--j];
			}
		}
			
		return gray;
		
    }
	
	public static void main(String[] args){
		getGray(2);
	} 
	
}
