package Array;
/**
 *@author kaiscript
 *
 *2016��3��19������9:03:44
 */
/*��Ŀ����

��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и������� 
��������:
array�� �����ҵĶ�ά����
target�����ҵ�����


�������:
���ҵ�����true�����Ҳ�������false*/
public class Find {

	public static void main(String[] args) {
		int[][] array = {{},{}};
		System.out.println(array.length);
		System.out.println(array[0].length);
	}
	//���½ǿ�ʼ���������ƣ���С���ƣ�ֱ�������߽綼û�ҵ�����false�������true��
	public boolean Find(int [][] array,int target) {
		int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){ //�����µ�����
                len--;
            }else if(array[len][i] < target){  //�����������
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
	
}
