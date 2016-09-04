package DealString;
/**
 * 题目描述<br>
利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
给定一个string iniString为待压缩的串(长度小于等于3000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。
测试样例
"aabcccccaaa"
返回："a2b1c5a3"
"welcometonowcoderrrrr"
返回："welcometonowcoderrrrr"
 *@author Kaiscript
 *
 *2016年8月7日下午3:12:49
 */
public class Zipper {
	
	public static String zipString(String iniString){
		char[] strs = iniString.toCharArray();
		int count=1;
		StringBuffer res=new StringBuffer();
		char temp = strs[0];
		for(int i=1;i<strs.length;i++){
			if(strs[i]!=temp){
				res.append(temp);
				res.append(count);
				temp = strs[i];
				count=1;
			}
			else{
				count++;
			}
			if(res.length()>iniString.length())
				return iniString;
		}
		/*if(strs[strs.length-1]!=strs[strs.length-2]){
			res.append(strs[strs.length-1]);
			res.append(count);
		}
		else{
			res.append(strs[strs.length-2]);
			res.append(count);
		}*/
		res.append(temp).append(count);
		
		if(res.length()>iniString.length())
			return iniString;
		return res.toString();
	}
	
	public static String zipString0(String iniString){
		char[] strs = iniString.toCharArray();
		StringBuffer res = new StringBuffer();
		char pre = strs[0];
		int count=1;
		for(int i=1;i<strs.length;i++){
			if(pre==strs[i]){
				count++;
			}
			else{
				res.append(pre+""+count);
				pre = strs[i];
				count =1 ;
			}
			if(res.length()>iniString.length())
				return iniString;
		}
		res.append(pre+""+count);
		if(res.length()>iniString.length())
			return iniString;
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(zipString0("jjjjjjxxxxxxxooZLL"));
	}

}
