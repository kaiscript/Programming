package String;
/**
 * ��Ŀ����

�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
 * ����XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 * <br>
 * ˼·�����ַ���*2���ٽ�ȡ
 *@author Kaiscript
 *
 *2016��9��16������9:55:17
 */
public class LeftRotateString {
	
	public String LeftRotateString(String str,int n) {
		if(str.length()==0)
			return "";
       String res = str+str;
       res = res.substring(n,str.length()+n);
       return res;
    }
	
	public static void main(String[] args){
		LeftRotateString lrs = new LeftRotateString();
		System.out.println(lrs.LeftRotateString("abcXYZdef", 3));
	}
	
}
