package String;


/**
 * ���������ַ���A��B�����A��B�г��ֵ��ַ�������ͬ��ÿ���ַ����ֵĴ�����ͬ����A��B��Ϊ���δʣ������һ����Ч�㷨��������������Ƿ�Ϊ���δʡ�
���������ַ���A��B�����ǵĳ��ȣ��뷵��һ��boolֵ�����������Ƿ�Ϊ���δʡ�
����������
"abc",3,"bca",3
���أ�true
 *@author Kaiscript
 *
 *2016��9��12������4:31:18
 */
public class Transform {
	//����Hash��˼��
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
