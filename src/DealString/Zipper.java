package DealString;
/**
 * ��Ŀ����<br>
�����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ����磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3������ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
����һ��string iniStringΪ��ѹ���Ĵ�(����С�ڵ���3000)����֤�����ַ����ɴ�СдӢ����ĸ��ɣ�����һ��string��Ϊ�����ѹ�����δ�仯�Ĵ���
��������
"aabcccccaaa"
���أ�"a2b1c5a3"
"welcometonowcoderrrrr"
���أ�"welcometonowcoderrrrr"
 *@author Kaiscript
 *
 *2016��8��7������3:12:49
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
