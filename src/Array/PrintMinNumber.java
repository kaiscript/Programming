package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 题目描述
<br>输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
<br>例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *@author Kaiscript
 *
 *2016年8月23日上午11:29:39
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
