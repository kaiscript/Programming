package BitComputing;
/**
 *@author Kaiscript
 *��Ŀ����

����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 *2016��8��6������10:51:16
 */
public class NumberOf1 {
	
	public static int  NumberOf1(int n) {
		int count = 0;
        while(n!=0){
        	count++;
        	n = n & (n-1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(NumberOf1(12));
//		System.out.println(Integer.toBinaryString(12).replace("0", "").length());
	}

}
