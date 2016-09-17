package String;


/**
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
测试样例：
"abc",3,"bca",3
返回：true
 *@author Kaiscript
 *
 *2016年9月12日下午4:31:18
 */
public class Transform {
	//利用Hash的思想
	public boolean chkTransform(String A, int lena, String B, int lenb) {
		int[] map1 = new int[256];
		int[] map2 = new int[256];
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		for(int i=0;i<a.length;i++)
			map1[a[i]]++;
		for(int i=0;i<b.length;i++)
			map2[b[i]]++;
		for(int i=0;i<256;i++){
			if(map1[i]!=map2[i])
				return false;
		}
		return true;
    }
}
