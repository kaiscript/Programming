package String;
/**
 * ��Ŀ����

ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 *<br>
 *˼·���ȶ������ַ������з�ת���ٶ�ÿ�����ʽ��з�ת.Ϊ��³���ԣ����Խ���ת������ȡΪһ������
 *@author Kaiscript
 *
 *2016��9��16������10:20:52
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
	 * ��ת�ַ��� 
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
