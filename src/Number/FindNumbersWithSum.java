package Number;

import java.util.ArrayList;

/**
 * ��Ŀ����
����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ� 
�������:
��Ӧÿ�����԰����������������С���������
 *<br>
 *�����������ĺ�-->����-->����ָ��
 *һ��ָ��ָ��ͷ��һ��ָ��β�������������ֵĺͣ��ʹ���ָ���ͣ���Ҫ��ͼ�С����βָ����ǰ�ơ���С��ָ���ͣ���Ҫ������󣬼�ͷָ�������
 *@author Kaiscript
 *
 *2016��9��15������4:44:46
 */
public class FindNumbersWithSum {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int start = 0;
        int end = array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        if(array.length==0 || array==null)
        	return list;
        int s = 0;
        while(start<=end){
        	s = array[start]+array[end];
        	if(s>sum){//����ʹ���Ŀ���
        		end--;
        	}
        	else if(s<sum){
        		start++;
        	}
        	else if(s==sum){
        		list.add(array[start]);
                list.add(array[end]);
                break;
        	}
        	
        }
       
        return list;
    }
}
