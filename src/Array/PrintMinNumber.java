package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ��Ŀ����
<br>����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
<br>������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 *@author Kaiscript
 *
 *2016��8��23������11:29:39
 */
public class PrintMinNumber {
	
	public static String PrintMinNumber(int [] numbers) {
		if(numbers.length==0 || numbers==null)
			return "";
		ArrayList<Integer> list = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		for(int i:numbers)
			list.add(i);
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String str1 = o1+""+o2;
				String str2 = o2+""+o1;
				return str1.compareTo(str2);
			}
			
		});
		
		for(int i:list)
			sb.append(String.valueOf(i));
		
		return sb.toString();
		
    }
	
	public static void main(String[] args) {
		int[] a = {3,32,321};
		
		System.out.println(PrintMinNumber(a));
	}

}
