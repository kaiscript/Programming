package String;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ����һ���������ַ������飬���ҵ�һ��ƴ��˳��ʹ����С�ַ���ƴ�ӳɵĴ��ַ��������п��ܵ�ƴ�����ֵ�����С�ġ�
����һ���ַ�������strs��ͬʱ�������Ĵ�С���뷵��ƴ�ӳɵĴ���
����������
["abc","de"],2
"abcde"
 *@author Kaiscript
 *
 *2016��9��12������7:14:25
 */
public class Prior {
	
	public String findSmallest(String[] strs, int n) {
		Arrays.sort(strs,new comparator());
		String res = "";
		for(String s:strs)
			res  = res+s;
		return res;
    }
	
	public class comparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			return (o1+o2).compareTo(o2+o1);
		}
		
	}
	
}
