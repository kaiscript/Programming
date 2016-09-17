package String;
/**
 * 题目描述

牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 *<br>
 *思路：先对整体字符串进行翻转，再对每个单词进行翻转.为了鲁棒性，可以将翻转操作提取为一个函数
 *@author Kaiscript
 *
 *2016年9月16日下午10:20:52
 */
public class ReverseSentence {
	
	public String ReverseSentence(String str) {
		char[] cs = str.toCharArray();
        reverse(cs,0,cs.length-1);
        int start = 0;
        int end = 0;
        int i = 0;
        while(i<cs.length){
        	while(i<cs.length && cs[i]==' ')
        		i++;
        	start = end = i;
        	while(end < cs.length && cs[end]!=' '){
        		i++;
        		end++;
        	}
        	reverse(cs, start, end-1);
        }
        
        return new String(cs);
    }
	
	/**
	 * 翻转字符串 
	 * @param cs
	 * @param start
	 * @param end
	 */
	public void reverse(char[] cs,int start,int end){
		if(cs==null || cs.length==0)
			return;
		while(start<end){
			char temp = cs[start];
			cs[start] = cs[end];
			cs[end] = temp;
			start++;
			end--;
		}
		
	}
	
	public static void main(String[] args){
		ReverseSentence rs = new ReverseSentence();
		String str = "I am a student.";
		System.out.println(rs.ReverseSentence(str));
	} 
	
}
