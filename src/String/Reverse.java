package String;
/**
 * ����һ���ַ����������һ���㷨��ֻ���ַ����ĵ��ʼ������������Ҳ����˵���ַ�����һЩ�ɿո�ָ��Ĳ�����ɣ�����Ҫ����Щ��������
����һ��ԭ�ַ���A�����ĳ��ȣ��뷵���������ַ�����
����������
"dog loves pig",13
���أ�"pig loves dog"
 *@author Kaiscript
 *
 *2016��9��12������5:37:55
 */
public class Reverse {
	
	/*public String reverseSentence(String A, int n) {
		String[] ss = A.split(" ");
		String res = "";
		for(int i = ss.length-1;i>=0;i--){
			res = res+ss[i]+" ";
		}
		res = res.substring(0,res.length()-1);
		return res;
    }*/
	
	public String reverseSentence(String A, int n) {
		char[] cs = A.toCharArray();
		if(cs.length==0)
			return "";
		reverse(cs, 0, cs.length-1);
		int i = 0;
		int start = 0;
		int end = 0;
		while(i<cs.length){
			while(i<cs.length && cs[i]==' ')
				i++;
			start = end = i;
			while(end<cs.length && cs[end]!=' '){
				end++;
				i++;
			}
			reverse(cs, start, end-1);
		}
		return new String(cs);
	}
	
	public void reverse(char[] cs,int start,int end){
		while(start<end){
			char temp = cs[start];
			cs[start] = cs[end];
			cs[end] = temp;
			start++;
			end--;
		}
	}
	
}
