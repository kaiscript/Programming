package Array;
/**
 * ��Ŀ����

����һ���������飬ʵ��һ�����������������������ֵ�˳��
ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
����֤������������ż����ż��֮������λ�ò��䡣
 *@author Kaiscript
 *
 *2016��8��10������5:29:44
 */
public class ReOrderArray {
	//����������ð������ķ����������Ӷ�̫��
	public static void reOrderArray(int [] array) {
        int[] res = new int[array.length];
        int k = array.length-1;
        for(int i=array.length-1;i>=0;i--){
        	if((array[i] & 0x1)==0){
        		res[k--] = array[i];
        	}
        	
        }
        int j = 0;
        for(int i=0;i<array.length;i++){
        	if((array[i] & 0x1)==1)
        		res[j++] = array[i];
        }
        for(int i=0;i<res.length;i++){
        	array[i] = res[i];
        }
    }
	/*http://www.nowcoder.com/questionTerminal/beb5aa231adc45b2a5dcc5b62c93f593
		��������ָ�룬����ָ���0��ʼ��ż��ָ�������������ĩβ��ʼ ����������
		Ҳ�ǿ��Ե�*/
	public static void main(String[] args) {
		int[] a = {2,4,8,5,234,7};
		reOrderArray(a);
	}

}
