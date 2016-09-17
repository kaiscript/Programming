package String;
/**
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
给定一个原字符串A和他的长度，请返回逆序后的字符串。
测试样例：
"dog loves pig",13
返回："pig loves dog"
 *@author Kaiscript
 *
 *2016年9月12日下午5:37:55
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
