package DealString;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ��Ŀ���� ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,
 * ���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� ����밴��ĸ˳������� ��������:
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 *
 * @author Kaiscript
 *
 *         2016��8��15������6:16:09
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
