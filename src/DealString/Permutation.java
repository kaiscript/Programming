package DealString;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 题目描述 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 结果请按字母顺序输出。 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 *
 * @author Kaiscript
 *
 *         2016年8月15日下午6:16:09
 */
public class Permutation {

	ArrayList<String> res = new ArrayList<>();

	public ArrayList<String> Permutation(String str) {
		if(str==null || str.equals(""))
			return res;
		char[] chs = str.toCharArray();
		Permutation(chs, 0);
		Collections.sort(res);
		return res;
	}

	public void Permutation(char[] str, int start) {

		if (start == str.length-1) {
			String s = new String(str);
			res.add(s);
			return;
		}

		for (int i = start; i < str.length; i++) {

			if (i == start || str[start] != str[i]) {
				swap(start, i, str);
				Permutation(str, start + 1);
			}

		}

	}

	public void swap(int i, int j, char[] str) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;

	}

	public static void main(String[] args) {

	}

}
